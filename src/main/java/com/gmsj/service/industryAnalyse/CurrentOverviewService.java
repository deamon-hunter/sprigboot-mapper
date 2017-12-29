package com.gmsj.service.industryAnalyse;

import com.gmsj.common.vo.industryAnaylse.CurrentOverviewVO;

/**
 * @description 现状总览信息一览
 * @author 刘江
 * @date 2017-12-12
 */
public interface CurrentOverviewService {

	/**
	 * 返回行业分析 --> 现状总览信息
	 * 
	 * @param now
	 * 
	 * @return
	 */
	public CurrentOverviewVO queryCurrentOverviewInfo();
}
