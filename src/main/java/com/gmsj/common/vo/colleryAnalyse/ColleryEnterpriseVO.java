package com.gmsj.common.vo.colleryAnalyse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ColleryEnterpriseVO {

    @ApiModelProperty(value = "产量波动信息")
    private ProductionRangeVO productionRangeVO;

    @ApiModelProperty(value = "产能总量信息")
    private TotalCapacityVO totalCapacityVO;

    @ApiModelProperty(value = "安全隐患数信息")
    private SafetyDangerVO safetyDangerVO;

    @ApiModelProperty(value = "贵州省集团安全事故和集团诉讼数据信息")
    private AccidentAndLitigationVO accidentAndLitigationVO;

    @ApiModelProperty(value = "贵州省集团抵押数量信息")
    private MortgageVO mortgageVO;

    @ApiModelProperty(value = "集团下属煤矿分布图")
    private GroupMapVO groupMapVO;

    public ColleryEnterpriseVO() {
    }
}
