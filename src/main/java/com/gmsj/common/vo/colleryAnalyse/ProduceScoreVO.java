package com.gmsj.common.vo.colleryAnalyse;

import com.gmsj.common.vo.CommonVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProduceScoreVO {

    @ApiModelProperty(value = "生产评分标题")
    private String produceScoreTitle;

    @ApiModelProperty(value = "生产评分总分数")
    private Integer totalScore;

    @ApiModelProperty(value = "生产评分信息")
    private List<CommonVO> listScore;

    public ProduceScoreVO() {
    }
}
