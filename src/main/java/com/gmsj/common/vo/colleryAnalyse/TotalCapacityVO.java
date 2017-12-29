package com.gmsj.common.vo.colleryAnalyse;

import com.gmsj.common.vo.CommonVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class TotalCapacityVO {

    @ApiModelProperty(value = "产量总量标题")
    private String  totalCapacityTitle;

    @ApiModelProperty(value = "产能总量总和")
    private Long totalCapacity;

    @ApiModelProperty(value = "产能总量详细信息")
    private List<CommonVO> listTotalCapacity;

    public TotalCapacityVO() {
    }
}
