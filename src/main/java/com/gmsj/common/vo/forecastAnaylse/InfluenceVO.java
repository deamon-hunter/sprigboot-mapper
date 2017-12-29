package com.gmsj.common.vo.forecastAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class InfluenceVO {

    @ApiModelProperty(value = "价格产量影响因素标题")
    private String title;

    @ApiModelProperty(value = "产量影响因素")
    private DetailVO prodctionVO;

    @ApiModelProperty(value = "价格影响因素")
    private DetailVO priceVO;

}
