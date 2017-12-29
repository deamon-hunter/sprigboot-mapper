/**
 * 创建人： Ovrille
 * 包名字： com.gmsj.service.impl
 * 创建时间：2017/12/11
 * 描述：TODO
 * Copyright @ 2014-2017 bicitech.cn
 */
package com.gmsj.service.impl;

import com.gmsj.common.util.BuildTree;
import com.gmsj.common.vo.Tree;
import com.gmsj.mapper.VisualMenuMapper;
import com.gmsj.mapper.VisualRoleMenuMapper;
import com.gmsj.mapper.VisualUserMapper;
import com.gmsj.mapper.VisualUserRoleMapper;
import com.gmsj.model.VisualMenu;
import com.gmsj.model.VisualRoleMenu;
import com.gmsj.model.VisualUserRole;
import com.gmsj.service.VisualMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 创建人： Ovrille
 * 包名字： com.gmsj.service.impl
 * 创建时间：2017/12/11
 *  *类名：VisualMenuServiceImpl
 * 描述：TODO
 * Copyright @ 2014-2017
 */

@Service
public class VisualMenuServiceImpl implements VisualMenuService {

    @Autowired
    VisualMenuMapper menuMapper;

    @Autowired
    VisualRoleMenuMapper roleMenuMapper;

    @Autowired
    VisualUserRoleMapper userRoleMapper;

    @Autowired
    VisualUserMapper userMapper;
    @Override
    public Tree<VisualMenu> getTree() {
        List<Tree<VisualMenu>> trees = new ArrayList<Tree<VisualMenu>>();
        List<VisualMenu> VisualMenus = menuMapper.selectAll();
        for (VisualMenu sysVisualMenu : VisualMenus) {
            Tree<VisualMenu> tree = new Tree<VisualMenu>();
            tree.setId(sysVisualMenu.getMenuId().toString());
            tree.setParentId(sysVisualMenu.getParentId().toString());
            tree.setText(sysVisualMenu.getName());

            trees.add(tree);
        }
        // 默认顶级菜单为０，根据数据库实际情况调整
        Tree<VisualMenu> t = BuildTree.build(trees);
        return t;
    }

    @Override
    public Tree<VisualMenu> getTree(Long id) {
        // 根据roleId查询权限
        List<VisualMenu> menus = menuMapper.selectAll();
        VisualUserRole userRole = new VisualUserRole();
        userRole.setUserId(id);
        userRole = userRoleMapper.selectOne(userRole);

        Example example = new Example(VisualRoleMenu.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("roleId", userRole.getRoleId());
        List<Long> menuIds = roleMenuMapper.selectByExample(example).stream().map(VisualRoleMenu::getMenuId).collect(Collectors.toList());
        //权限验证完后需验证登陆账号部门
        Long deptId = Long.valueOf(userMapper.selectByPrimaryKey(id).getDeptId());
        Map<String, Object> attributes = new HashMap<>(16);
        List<Tree<VisualMenu>> trees = new ArrayList<Tree<VisualMenu>>();
        for (VisualMenu visualMenu : menus) {
            Tree<VisualMenu> tree = new Tree<VisualMenu>();
            if (menuIds.contains(visualMenu.getMenuId()) && deptId.equals(visualMenu.getDeptId())) {
                tree.setId(visualMenu.getMenuId().toString());
                tree.setParentId(visualMenu.getParentId().toString());
                tree.setText(visualMenu.getName());
                attributes.put("url", visualMenu.getUrl());
                attributes.put("icon", visualMenu.getIcon());
                tree.setAttributes(attributes);
                trees.add(tree);
            }
        }
        // 默认顶级菜单为０，根据数据库实际情况调整
        Tree<VisualMenu> t = BuildTree.build(trees);
        return t;
    }
}
