package com.gmsj.common.vo.forecastAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductionForecastVO {

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "产量预测详细信息")
    private List<ForecastItemVO> list;

}
