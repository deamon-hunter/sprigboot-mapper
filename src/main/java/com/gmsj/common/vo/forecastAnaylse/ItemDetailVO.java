package com.gmsj.common.vo.forecastAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ItemDetailVO {

    @ApiModelProperty(value = "数据项")
    private String item;

    @ApiModelProperty(value = "数据项对应值")
    private String value;

}
