package com.gmsj.common.vo.colleryAnalyse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ColleryAccidentAndLitigationVO {

    @ApiModelProperty(value = "统计的年份")
    private String year;

    @ApiModelProperty(value = "煤矿安全事故数量标题")
    private String accidentTitle;

    @ApiModelProperty(value = "煤矿安全事故数量信息")
    private Integer accidentNum;

    @ApiModelProperty(value = "煤矿诉讼数量标题")
    private String litigationTitle;

    @ApiModelProperty(value = "煤矿诉讼数量信息")
    private Integer litigationNum;

    public ColleryAccidentAndLitigationVO() {
    }
}
