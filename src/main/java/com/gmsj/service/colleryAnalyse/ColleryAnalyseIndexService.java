package com.gmsj.service.colleryAnalyse;

import com.gmsj.common.vo.colleryAnalyse.*;

public interface ColleryAnalyseIndexService {


    /**
     * 返回 煤矿分析 --> 指标池 --> 煤企画像中的产能总量信息
     * @param groupId
     * @param year
     * @return
     */
    TotalCapacityVO queryEnterpriseTotalCapacityInfo(Integer groupId, Integer year);

    /**
     * 返回 煤矿分析 --> 指标池 --> 煤企画像中的安全隐患信息
     * @param groupId
     * @param year
     * @return
     */
    SafetyDangerVO querySafetyDangerInfo(Integer groupId, Integer year);

    /**
     * 返回煤矿分析 --> 指标池 --> 煤企画像中的安全事故和诉讼数据信息
     * @param groupId
     * @param year
     * @return
     */
    AccidentAndLitigationVO queryEnterpriseAccidentAndLitigationInfo(Integer groupId, Integer year);

    /**
     * 返回煤矿分析 --> 指标池 --> 煤企画像中的集团抵押数量信息
     * @param groupId
     * @param year
     * @return
     */
    MortgageVO queryEnterpriseMortgageInfo(Integer groupId, Integer year);

    /**
     * 返回煤矿分析 --> 指标池 --> 煤矿画像中的生产评分的信息
     * @param coalId
     * @param year
     * @return
     */
    ProduceScoreVO queryColleryProduceScoreInfo(Integer coalId, Integer year);

    /**
     * 返回煤矿分析 --> 指标池 --> 煤矿画像中的产能检测信息
     * @param coalId
     * @param year
     * @return
     */
    ColleryCapacityDetectionVO queryColleryCapacityDetectionInfo(Integer coalId, Integer year);

    /**
     * 返回煤矿分析 --> 指标池 --> 煤矿画像中的安全事故和诉讼数据信息
     * @param coalId
     * @param year
     * @return
     */
    ColleryAccidentAndLitigationVO queryColleryAccidentAndLitigationInfo(Integer coalId, Integer year);

    /**
     * 返回煤矿分析 --> 指标池 --> 煤矿画像中的煤矿抵押数量信息
     * @param coalId
     * @param year
     * @return
     */
    ColleryMortgageVO queryColleryMortgageInfo(Integer coalId, Integer year);


    /**
     * 返回煤矿分析 --> 指标池 --> 煤企画像中的产量波动默认6个月统计信息
     *
     * @param groupId
     * @return
     */
    ProductionRangeVO queryEnterpriseDefaultProductionRangeInfo(Integer groupId);

    /**
     * 返回煤矿分析 --> 指标池 --> 煤矿画像中的产量波动默认6个月统计信息
     * @param coalId
     * @return
     */
    ProductRangeVO queryColleryDefaultProductioinRangInfo(Integer coalId);

    /**
     * 返回煤矿分析 --> 指标池 --> 煤企画像中的集团下属煤矿分布图信息
     * @param groupId
     * @param year
     * @return
     */
    GroupMapVO queryEnterpriseMapInfo(Integer groupId, Integer year);

    /**
     * 返回煤矿分析 --> 指标池 --> 煤矿画像中 煤矿、非煤矿、下游企业信息
     * @param coalId
     * @param nonCoalId
     * @param downStreamId
     * @return
     */
    CollerySpreadMapVO queryColleryMapInfo(Integer coalId, Integer nonCoalId, Integer downStreamId);
}
