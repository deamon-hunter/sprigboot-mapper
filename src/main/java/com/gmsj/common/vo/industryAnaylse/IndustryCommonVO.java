package com.gmsj.common.vo.industryAnaylse;

import com.gmsj.common.vo.CommonVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author 刘江
 * @description 公共VO
 * @date 2017-12-12
 */
@Data
public class IndustryCommonVO {

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "信息")
    private List<CommonInfoVO> list;

    public IndustryCommonVO() {
        super();
    }
}
