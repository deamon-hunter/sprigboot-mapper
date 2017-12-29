package com.gmsj.common.vo.colleryAnalyse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AccidentAndLitigationVO {

    @ApiModelProperty(value = "统计的年份")
    private String  year;

    @ApiModelProperty(value = "贵州省集团安全事故标题")
    private String accidentTitle;

    @ApiModelProperty(value = "贵州省集团安全事故信息")
    private Integer accidentNum;

    @ApiModelProperty(value = "贵州省集团诉讼数据标题")
    private String litigationTitle;

    @ApiModelProperty(value = "贵州省集团诉讼数据信息")
    private Integer litigationNum;

    public AccidentAndLitigationVO() {
    }
}
