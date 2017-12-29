package com.gmsj.common.vo.colleryAnalyse;

import com.gmsj.common.vo.CommonVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductRangeVO {

    @ApiModelProperty(value = "煤矿产量波动标题")
    private String rangeTitle;

    @ApiModelProperty(value = "煤矿蝉联波动信息")
    private List<CommonVO> listProductionRange;

    public ProductRangeVO() {
    }
}
