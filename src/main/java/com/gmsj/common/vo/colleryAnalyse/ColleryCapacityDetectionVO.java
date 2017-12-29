package com.gmsj.common.vo.colleryAnalyse;

import com.gmsj.common.vo.CommonVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ColleryCapacityDetectionVO {

    @ApiModelProperty(value = "产能检测标题")
    private String capacityTitle;

    @ApiModelProperty(value = "煤矿产能检测值")
    private Long totalCapacityNum;

    @ApiModelProperty(value = "产能检测详细信息")
    private List<CommonVO> listTotalCapacity;

    public ColleryCapacityDetectionVO() {
    }
}
