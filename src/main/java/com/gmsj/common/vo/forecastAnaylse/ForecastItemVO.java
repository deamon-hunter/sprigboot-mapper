package com.gmsj.common.vo.forecastAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ForecastItemVO {

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "每一项详细信息")
    private List<ItemDetailVO> listItem;

}
