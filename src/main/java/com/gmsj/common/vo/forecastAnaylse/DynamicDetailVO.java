package com.gmsj.common.vo.forecastAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class DynamicDetailVO {

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "标题url")
    private String url;

    @ApiModelProperty(value = "时间")
    private String date;
}
