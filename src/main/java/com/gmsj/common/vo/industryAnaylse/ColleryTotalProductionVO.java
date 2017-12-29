package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ColleryTotalProductionVO {

    @ApiModelProperty(value = "统计的年份")
    private String year;

    @ApiModelProperty(value = "贵州省煤矿总产出量标题")
    private String title;

    @ApiModelProperty(value = "贵州省总产出量信息")
    private Float totalProductioin;

    public ColleryTotalProductionVO() {
    }
}
