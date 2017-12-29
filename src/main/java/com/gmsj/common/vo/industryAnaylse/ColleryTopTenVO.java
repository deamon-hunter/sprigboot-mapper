package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ColleryTopTenVO {

    @ApiModelProperty(value = "煤矿产量前10煤企标题")
    private String topTenTitle;

    @ApiModelProperty(value = "煤矿产量前10位信息")
    private List<TopTenCollieryVO> listTopTenVO;

    public ColleryTopTenVO() {
    }
}
