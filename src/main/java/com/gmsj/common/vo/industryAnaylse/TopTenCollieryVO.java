package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 行业分析 --> 现状总览页面 --> 煤矿产量前10煤企
 * @author 刘江
 * @date 2017-12-12
 */
@Data
public class TopTenCollieryVO {

	@ApiModelProperty(value = "煤矿名称")
	private String name;

	@ApiModelProperty(value = "煤矿产量")
	private Float production;

	public TopTenCollieryVO() {
		super();
	}

}
