package com.gmsj.service.industryAnalyse;

import com.gmsj.common.vo.industryAnaylse.DevelopOverviewVO;

/**
 * @author 刘江
 * @description 发展总览信息一览
 * @date 2017-12-12
 */
public interface DevelopOverviewService {

    /**
     * 返回行业分析 --> 发展总览信息
     *
     * @return
     */
    public DevelopOverviewVO queryDevelopOverviewInfo();
}
