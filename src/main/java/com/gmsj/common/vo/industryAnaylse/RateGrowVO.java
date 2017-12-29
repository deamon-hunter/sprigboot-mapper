package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 行业分析-->煤矿数量增长率和产量增长率VO
 * @author 刘江
 * @date 2017-12-12
 */
@Data
public class RateGrowVO {
	@ApiModelProperty(value = "统计的年份")
	private Integer year;

	@ApiModelProperty(value = "煤矿数量增长率")
	private float collieryRate;

	@ApiModelProperty(value = "煤矿产量增长率")
	private float productionRate;

	public RateGrowVO() {
		super();
	}

}
