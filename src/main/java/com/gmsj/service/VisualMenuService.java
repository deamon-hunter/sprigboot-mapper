package com.gmsj.service;

import com.gmsj.common.vo.Tree;
import com.gmsj.model.VisualMenu;

public interface VisualMenuService {

    Tree<VisualMenu> getTree();

    Tree<VisualMenu> getTree(Long id);
}
