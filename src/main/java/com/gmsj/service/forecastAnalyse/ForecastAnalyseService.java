package com.gmsj.service.forecastAnalyse;

import com.gmsj.common.vo.forecastAnaylse.ForecastAnalyseVO;

public interface ForecastAnalyseService {
    /**
     * 返回 行业预测 信息
     * @param year
     * @return
     */
    ForecastAnalyseVO queryForecastAnalyseInfo(Integer year);
}
