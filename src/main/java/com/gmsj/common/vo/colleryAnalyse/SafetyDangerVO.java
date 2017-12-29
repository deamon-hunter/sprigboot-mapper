package com.gmsj.common.vo.colleryAnalyse;

import com.gmsj.common.vo.CommonVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class SafetyDangerVO {

    @ApiModelProperty(value = "安全隐患数标题")
    private String safetyDangerTitle;

    @ApiModelProperty(value = "安全隐患数信息")
    private List<CommonVO> listSafetyDanger;

    public SafetyDangerVO() {
    }
}
