package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ColleryAndGroupNumChangeVO {

    @ApiModelProperty(value = "煤矿数量变化标题")
    private String title;

    @ApiModelProperty(value = "集团数量变化信息")
    private IndustryCommonVO groupVO;

    @ApiModelProperty(value = "煤矿数量变化信息")
    private IndustryCommonVO coalVO;

    public ColleryAndGroupNumChangeVO() {
    }
}
