package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ColleryNumAndProductionGrowRateVO {

    @ApiModelProperty(value = "煤矿数量增长和产量增长趋势图标题")
    private String title;

    @ApiModelProperty(value = "数量增长率信息")
    private IndustryCommonVO coalRate;

    @ApiModelProperty(value = "产量增长率信息")
    private IndustryCommonVO producitonRate;

    public ColleryNumAndProductionGrowRateVO() {
    }
}
