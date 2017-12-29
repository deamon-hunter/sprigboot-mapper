package com.gmsj.common.vo.industryAnaylse;

import com.gmsj.common.vo.CommonVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class LitigateClassifyVO {

    @ApiModelProperty(value = "诉讼分类信息标题")
    private String litigateClassifyTitle;

    @ApiModelProperty(value = "诉讼分类信息")
    private List<CommonVO> listLitigationClassifyVO;

    public LitigateClassifyVO() {
    }
}
