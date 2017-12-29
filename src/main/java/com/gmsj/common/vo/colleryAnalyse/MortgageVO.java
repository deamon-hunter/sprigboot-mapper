package com.gmsj.common.vo.colleryAnalyse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MortgageVO {

    @ApiModelProperty(value = "统计的年份")
    private String year;

    @ApiModelProperty(value = "贵州省集团抵押数量标题")
    private String mortgageTitle;

    @ApiModelProperty(value = "贵州省集团抵押数量信息")
    private Integer mortgageNum;

    public MortgageVO() {
    }
}
