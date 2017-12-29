package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 行业分析 --> 发展总览 --> 煤矿规模变化VO
 * @author 刘江
 * @date 2017-12-12
 */
@Data
public class ScaleChangeVO {
	@ApiModelProperty(value = "统计的年份")
	private Integer year;


	@ApiModelProperty(value = "低于统计标准的煤矿数量")
	private Long lowerCount;


	@ApiModelProperty(value = "高于统计标准的煤矿数量")
	private Long higherCount;

	public ScaleChangeVO() {
		super();
	}
}
