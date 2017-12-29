package com.gmsj.common.vo.colleryAnalyse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MapItemVO {

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "经纬度（多个经纬度集合）")
    private String longitudeAndlatitude;

    @ApiModelProperty(value = "经度")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    private String latitude;

}
