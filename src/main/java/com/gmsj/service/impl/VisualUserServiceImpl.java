/**
 * Copyright (c) 2017
 * .gmsj.
 */
package com.gmsj.service.impl;

import com.gmsj.common.config.security.Session;
import com.gmsj.common.config.security.TokenService;
import com.gmsj.common.util.MD5Utils;
import com.gmsj.common.vo.LoginTokenDataVO;
import com.gmsj.mapper.VisualUserMapper;
import com.gmsj.model.VisualUser;
import com.gmsj.service.VisualUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@Service
public class VisualUserServiceImpl implements VisualUserService {

    @Autowired
    private VisualUserMapper visualUserMapper;

    @Autowired
    private TokenService tokenService;

    @Override
    public LoginTokenDataVO authenticate(String userName, String password) {

        Example example = new Example(VisualUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userName", userName);
        List<VisualUser> users = visualUserMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(users)) {
            throw new RuntimeException("未找到登陆用户");
        }
        VisualUser user = users.get(0);
        String passwordN = MD5Utils.encrypt(userName, password);
        if (!passwordN.equalsIgnoreCase(user.getPassword())) {
            throw new RuntimeException("密码验证不通过");
        }
        //创建session
        final Session session = Session.buildSession(user);
        //生成token
        String token = tokenService.generate(session);
        LoginTokenDataVO loginDataVO = new LoginTokenDataVO();

        loginDataVO.setUserName(user.getUserName());
        loginDataVO.setUserId(user.getUserId());
        loginDataVO.setAuthorization(token);

        return loginDataVO;
    }

    @Override
    @Transactional
    public void modifyPwd(String userName, String password, String newPassword) {
        Example example = new Example(VisualUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userName", userName);
        List<VisualUser> users = visualUserMapper.selectByExample(example);

        VisualUser user = users.get(0);
        if (CollectionUtils.isEmpty(users)) {
            throw new RuntimeException("未找到登陆用户");
        }
        String passwordN = MD5Utils.encrypt(userName, password);
        if (!passwordN.equalsIgnoreCase(user.getPassword())) {
            throw new RuntimeException("密码验证不通过");
        }
        user.setPassword(MD5Utils.encrypt(userName, newPassword));
        visualUserMapper.updateByPrimaryKey(user);

    }

}
