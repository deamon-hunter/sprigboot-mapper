package com.gmsj.common.vo.industryAnaylse;

import com.gmsj.common.vo.CommonVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class EnterpriseTypeVO {

    @ApiModelProperty(value = "煤矿企业性质标题")
    private String title;

    @ApiModelProperty(value = "煤矿企业性质")
    private List<CommonVO> listEnterpriseTypeVO;

    public EnterpriseTypeVO() {
    }
}
