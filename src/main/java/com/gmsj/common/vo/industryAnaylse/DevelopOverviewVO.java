package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

/**
 * @author 刘江
 * @description 行业分析 --> 发展总览页面
 * @date 2017-12-12
 */
@Data
public class DevelopOverviewVO {

    @ApiModelProperty(value = "贵州省煤矿总数量模块信息")
    private ColleryTotalNumVO colleryTotalNumVO;

    @ApiModelProperty(value = "贵州省煤矿总产量模块信息")
    private ColleryTotalProductionVO colleryTotalProductionVO;

    @ApiModelProperty(value = "煤矿企业性质模块信息")
    private EnterpriseTypeVO enterpriseTypeVO;

    @ApiModelProperty(value = "矿企数量变化模块信息")
    private ColleryAndGroupNumChangeVO colleryNumChangeVO;

    @ApiModelProperty(value = "煤矿规模变化模块信息")
    private ColleryScaleChangeVO colleryScaleChangeVO;

    @ApiModelProperty(value = "煤矿产量变化模块信息")
    private ColleryPorductionChangeVO colleryPorductionChangeVO;

    @ApiModelProperty(value = "煤矿数量增长和产量增长趋势图")
    private ColleryNumAndProductionGrowRateVO colleryNumAndProductionGrowRateVO;

    public DevelopOverviewVO() {
        super();
    }

}
