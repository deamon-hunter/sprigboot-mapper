package com.gmsj.common.vo.forecastAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class DynamicsVO {

    @ApiModelProperty(value = "行业动态标题")
    private String title;

    @ApiModelProperty(value = "行业动态详细信息")
    private List<DynamicDetailVO> list;

}
