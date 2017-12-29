package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class CollerySpreadVO {

    @ApiModelProperty(value = "矿点分布图标题")
    private String coalSpreadTitle;

    @ApiModelProperty(value = "煤矿经纬度信息")
    private List<CoalSpreadMapVO> listCoalSpreadMapVO;

    public CollerySpreadVO() {
    }
}
