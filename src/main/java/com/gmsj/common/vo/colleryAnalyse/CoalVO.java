package com.gmsj.common.vo.colleryAnalyse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CoalVO {

    @ApiModelProperty(value = "生产评分")
    private ProduceScoreVO produceScoreVO;

    @ApiModelProperty(value = "煤矿产量波动")
    private ProductRangeVO rangeVO;

    @ApiModelProperty(value = "煤矿产能检测")
    private ColleryCapacityDetectionVO detectionVO;

    @ApiModelProperty(value = "贵州省煤矿安全事故数量")
    private ColleryAccidentAndLitigationVO accidentAndLitigationVO;

    @ApiModelProperty(value = "贵州省煤矿抵押数量")
    private ColleryMortgageVO mortgageVO;

    @ApiModelProperty(value = "煤矿分布地图")
    private CollerySpreadMapVO spreadMapVO;

    public CoalVO() {
    }
}
