package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ColleryTotalNumVO {

    @ApiModelProperty(value = "统计的年份")
    private String year;

    @ApiModelProperty(value = "煤矿总数量标题")
    private String title;

    @ApiModelProperty(value = "煤矿总数量信息")
    private Integer count;

    public ColleryTotalNumVO() {
    }
}
