package com.gmsj.service.industryAnalyse;

import com.gmsj.common.vo.industryAnaylse.*;

/**
 * @author 刘江
 * @description 指标池信息一览
 */
public interface IndexPoolService {

    /**
     * 返回行业分析 --> 指标池 --> 煤矿分类信息
     *
     * @param year
     * @return
     */
    EnterpriseTypeVO queryCollieryClassifyInfo(Integer year);

    /**
     * 返回行业分析 --> 指标池 --> 煤矿数量发展信息
     *
     * @param endYear
     * @param startYear
     * @return
     */
    ColleryAndGroupNumChangeVO queryCollieryNumChangeInfo(String startYear,
                                                          String endYear);

    /**
     * 返回行业分析 --> 指标池 --> 煤矿规模变化信息
     *
     * @param endYear
     * @param startYear
     * @return
     */
    ColleryScaleChangeVO queryScaleChangeInfo(String startYear,
                                              String endYear);

    /**
     * 返回行业分析 --> 指标池 --> 煤矿产量波动信息
     *
     * @param endYear
     * @param startYear
     * @return
     */
    ColleryPorductionChangeVO queryProductionChangeInfo(String startYear,
                                                        String endYear);

    /**
     * 返回行业分析 --> 指标池 --> 增长率对比分析信息
     *
     * @param endYear
     * @param startYear
     * @return
     */
    ColleryNumAndProductionGrowRateVO queryRateGrowInfo(String startYear, String endYear);

    /**
     * 返回行业分析 --> 指标池 --> 煤矿产量前10企业信息
     *
     * @param year
     * @return
     */
    ColleryTopTenVO queryTopTenCollieryInfo(Integer year);

    /**
     * 返回行业分析 --> 指标池 --> 矿点分布图信息
     *
     * @param year
     * @return
     */
    CollerySpreadVO queryCollerySpreadInfo(Integer year);

    /**
     * 返回 行业分析 --> 指标池 --> 安全分类信息
     *
     * @param year
     * @return
     */
    SafetyClassifyVO querySafetyClassifyInfo(Integer year);

    /**
     * 返回行业分析 --> 指标池 --> 诉讼分类信息
     *
     * @param year
     * @return
     */
    LitigateClassifyVO queryLitigateClassifyVOInfo(Integer year);

    /**
     * 返回行业分析 --> 指标池 --> 煤矿开采率信息
     *
     * @param startYear
     * @param endYear
     * @return
     */
    ColleryExploitationRateVO queryExploitationRateInfo(Integer startYear, Integer endYear);

    /**
     * 返回行业分析 --> 指标池 --> 煤矿盈利情况信息
     *
     * @param year
     * @return
     */
    ColleryGainProfitVO queryGainProfitInfo(Integer year);


}
