package com.gmsj.common.vo.industryAnaylse;

import com.gmsj.common.vo.CommonVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ColleryGainProfitVO {

    @ApiModelProperty(value = "煤矿盈利信息标题")
    private String colleryProfitTitle;

    @ApiModelProperty(value = "煤矿盈利信息")
    private CommonVO profitVO;

    @ApiModelProperty(value = "未盈利煤矿信息")
    private CommonVO NoProfitVO;

    public ColleryGainProfitVO() {
    }
}
