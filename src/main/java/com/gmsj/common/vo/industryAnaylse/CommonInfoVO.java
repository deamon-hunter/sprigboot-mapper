package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CommonInfoVO {

    @ApiModelProperty(value = "年份")
    private String year;

    @ApiModelProperty(value = "属性值")
    private float num;

    public CommonInfoVO() {
    }
}
