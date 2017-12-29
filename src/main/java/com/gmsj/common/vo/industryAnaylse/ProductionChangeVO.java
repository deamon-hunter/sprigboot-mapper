package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 行业分析 --> 发展总览 --> 煤矿产量变化VO
 * @author 刘江
 * @date 2017-12-12
 */
@Data
public class ProductionChangeVO {

	@ApiModelProperty(value = "统计的年份")
	private Integer year;

	@ApiModelProperty(value = "煤矿产量")
	private float outputProduction;

	public ProductionChangeVO() {
		super();
	}

}
