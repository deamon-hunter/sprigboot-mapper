package com.gmsj.common.vo.industryAnaylse;

import io.swagger.annotations.ApiModelProperty;


import lombok.Data;

/**
 * @description 行业分析 --> 现状总览页面
 * @author 刘江
 * @date 2017-12-12
 */
@Data
public class CurrentOverviewVO {

	@ApiModelProperty(value = "煤矿产量前10煤企")
	private ColleryTopTenVO colleryTopTenVO;

	@ApiModelProperty(value = "矿点分布图")
	private CollerySpreadVO collerySpreadVO;

	@ApiModelProperty(value = "安全分类")
	private SafetyClassifyVO safetyClassifyVO;

	@ApiModelProperty(value = "诉讼分类")
	private LitigateClassifyVO litigateClassifyVO;

	@ApiModelProperty(value = "煤矿开采率")
	private ColleryExploitationRateVO  exploitationRateVO;

	@ApiModelProperty(value = "煤矿盈利")
	private ColleryGainProfitVO gainProfitVO;


	public CurrentOverviewVO() {
		super();
	}

}
