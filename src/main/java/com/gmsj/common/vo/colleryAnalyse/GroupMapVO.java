package com.gmsj.common.vo.colleryAnalyse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class GroupMapVO {

    @ApiModelProperty(value = "煤企地图标题")
    private String title;

    @ApiModelProperty(value = "煤企下属煤矿经纬度分布图")
    private List<MapItemVO> list;

    public GroupMapVO() {
    }
}
