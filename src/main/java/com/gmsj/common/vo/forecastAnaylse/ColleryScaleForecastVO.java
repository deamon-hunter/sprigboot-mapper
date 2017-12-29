package com.gmsj.common.vo.forecastAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ColleryScaleForecastVO {

    @ApiModelProperty(value = "煤矿规模预测分析标题")
    private String title;

    @ApiModelProperty(value = "煤矿预测分析详细信息")
    private List<ItemDetailVO> list;


}
