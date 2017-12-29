package com.gmsj.common.vo.forecastAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ForecastAnalyseVO {

    @ApiModelProperty(value = "价格产量影响因素")
    private InfluenceVO influenceVO;

    @ApiModelProperty(value = "行业动态")
    private DynamicsVO dynamicsVO;

    @ApiModelProperty(value = "煤矿规模预测")
    private ColleryScaleForecastVO scaleVO;

    @ApiModelProperty(value = "价格预测")
    private PriceForecastVO priceVO;

    @ApiModelProperty(value = "产量预测")
    private ProductionForecastVO productVO;

}
