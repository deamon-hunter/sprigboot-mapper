package com.gmsj.common.vo.industryAnaylse;

import com.gmsj.common.vo.CommonVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class SafetyClassifyVO {

    @ApiModelProperty(value = "安全分类信息标题")
    private String securityClassifyTitle;

    @ApiModelProperty(value = "安全分类信息")
    private List<CommonVO> listSecurityClassifyVO;

    public SafetyClassifyVO() {
    }
}
