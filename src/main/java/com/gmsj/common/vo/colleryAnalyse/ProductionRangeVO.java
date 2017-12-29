package com.gmsj.common.vo.colleryAnalyse;

import com.gmsj.common.vo.CommonVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductionRangeVO {

    @ApiModelProperty(value = "产量波动标题")
    private String productionRangeTitle;

    @ApiModelProperty(value = "产量波动信息")
    private List<CommonVO> listProductionRangeVO;

    public ProductionRangeVO() {
    }
}
