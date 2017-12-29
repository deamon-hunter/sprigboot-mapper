package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ColleryScaleChangeVO {

    @ApiModelProperty(value = "煤矿规模变化标题")
    private String title;

    @ApiModelProperty(value = "高于标准的信息")
    private IndustryCommonVO higherVO;

    @ApiModelProperty(value = "低于标准的信息")
    private IndustryCommonVO lowerVO;

    public ColleryScaleChangeVO() {
    }
}
