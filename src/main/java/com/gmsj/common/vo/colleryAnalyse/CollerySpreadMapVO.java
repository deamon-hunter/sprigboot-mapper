package com.gmsj.common.vo.colleryAnalyse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class CollerySpreadMapVO {

    @ApiModelProperty(value = "设置煤矿地图标题")
    private String title;

    @ApiModelProperty(value = "设置煤矿地图信息")
    private MapItemVO coalMap;

    @ApiModelProperty(value = "设置非煤矿地图信息")
    private List<MapItemVO> NonCoalMap;

    @ApiModelProperty(value = "设置下游企业信息")
    private List<MapItemVO> downstreamMap;

    public CollerySpreadMapVO() {
    }
}
