package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ColleryProfitVO {

	@ApiModelProperty(value = "统计的年份")
	private Integer year;

	@ApiModelProperty(value = "总共的数量")
	private Integer totalNum;

	@ApiModelProperty(value = "盈利的煤矿数量")
	private Integer profitNum;

	@ApiModelProperty(value = "没盈利的煤矿数量")
	private Integer noProfitNum;

}
