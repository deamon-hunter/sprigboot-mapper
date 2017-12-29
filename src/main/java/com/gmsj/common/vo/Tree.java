/**
 * 创建人： Ovrille
 * 包名字： com.gmsj.common.vo
 * 创建时间：2017/12/11
 * 描述：TODO
 * Copyright @ 2014-2017 bicitech.cn
 */
package com.gmsj.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *创建人： Ovrille
 *包名字： com.gmsj.common.vo
 *创建时间：2017/12/11
  *类名：Tree
 *描述：TODO
 *Copyright @ 2014-2017 
 */
@Data
public class Tree<T> {

    @ApiModelProperty(value = "节点ID")
    private String id;

    @ApiModelProperty(value = "显示节点文本")
    private String text;

    @ApiModelProperty(value = "节点ID")
    private boolean checked = false;

    @ApiModelProperty(value = "节点属性")
    private Map<String, Object> attributes;

    @ApiModelProperty(value = "节点的子节点")
    private List<Tree<T>> children = new ArrayList<Tree<T>>();

    @ApiModelProperty(value = "父ID")
    private String parentId;

    @ApiModelProperty(value = "是否有父节点")
    private boolean hasParent = false;

    @ApiModelProperty(value = "是否有子节点")
    private boolean hasChildren = false;

}
