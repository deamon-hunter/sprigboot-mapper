package com.gmsj.controller;

import com.gmsj.common.config.security.annotation.RoleCheck;
import com.gmsj.common.vo.LoginTokenDataVO;
import com.gmsj.common.vo.Tree;
import com.gmsj.service.VisualMenuService;
import com.gmsj.service.VisualUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * 创建人： Ovrille
 * 包名字： com.gmsj.controller
 * 创建时间：2017/12/6
 *  *类名：VisualUserController
 * Copyright @ 2014-2017
 */
@RestController
@Api(value = "用户信息模块", description = "登陆、验证、获取菜单信息等")
@RequestMapping(value = "/user")
public class VisualUserController {

    @Autowired
    private VisualUserService userService;
    @Autowired
    private VisualMenuService menuService;

    @ApiOperation(value = "用户登录", notes = "1", response = LoginTokenDataVO.class, httpMethod = "POST")
    @RequestMapping(path = "/authenticate", method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE)
    public LoginTokenDataVO authenticate(@RequestBody @RequestParam(value = "userName") String userName ,@RequestParam(value = "password")String password) {
        return userService.authenticate(userName,password);
    }

    @ApiOperation(value = "获取菜单信息", notes = "测试专用token ：eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiIxIiwidXNlcm5hbWUiOiJhZG1pbiJ9.X5mwMDD79SlZBw8NkgifQp1UZz8zMyVTuPsvFSMQ5u-KyEy0ALTp6SV0uWBBKydjugTZgtqVsYY_rMl-WFoUWw", response = Tree.class, httpMethod = "GET")
//    @RoleCheck
    @RequestMapping(value = "/menu/{userId}", method = GET)
    public Tree menu(@PathVariable Long userId) throws Exception {
        return  menuService.getTree(userId);

    }

    @ApiOperation(value = "用户自行修改密码", notes = "3", response = LoginTokenDataVO.class, httpMethod = "POST")
    @RoleCheck
    @RequestMapping(path = "/modifyPwd", method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE)
    public void modifyPwd(@RequestParam(value = "userName") String userName ,
                          @RequestParam(value = "password") String password, @RequestParam(value = "newPassword") String newPassword) {
        userService.modifyPwd(userName,password,newPassword);
    }
}