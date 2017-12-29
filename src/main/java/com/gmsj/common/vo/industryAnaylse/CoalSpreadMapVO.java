package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 行业分析 --> 现状总览页面 --> 矿点分布图
 * @author 刘江
 * @date 2017-12-12
 */
@Data
public class CoalSpreadMapVO {

	@ApiModelProperty(value = "煤矿经度")
	private float longitude;

	@ApiModelProperty(value = "煤矿纬度")
	private float latitude;

	@ApiModelProperty(value = "煤矿名称")
	private String name;

	public CoalSpreadMapVO() {
		super();
	}

}
