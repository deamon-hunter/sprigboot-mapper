package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ColleryPorductionChangeVO {

    @ApiModelProperty(value = "煤矿产量变化标题")
    private String title;

    @ApiModelProperty(value = "煤矿产量变化")
    private List<CommonInfoVO> list;

    public ColleryPorductionChangeVO() {
    }
}
