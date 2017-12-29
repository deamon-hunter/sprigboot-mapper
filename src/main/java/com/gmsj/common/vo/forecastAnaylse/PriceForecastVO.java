package com.gmsj.common.vo.forecastAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class PriceForecastVO {

    @ApiModelProperty(value = "价格预测标题")
    private String title;

    @ApiModelProperty(value = "价格预测详细信息")
    private List<ForecastItemVO> list;

}
