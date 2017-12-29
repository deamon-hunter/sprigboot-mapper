package com.gmsj.common.vo.colleryAnalyse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ColleryMortgageVO {

    @ApiModelProperty(value = "统计的年份")
    private String year;

    @ApiModelProperty(value = "煤矿抵押数量标题")
    private String title;

    @ApiModelProperty(value = "煤矿抵押的数量")
    private Integer mortgageNum;


    public ColleryMortgageVO() {
    }
}
