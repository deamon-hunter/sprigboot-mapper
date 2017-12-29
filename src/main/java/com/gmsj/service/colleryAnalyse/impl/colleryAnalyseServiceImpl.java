package com.gmsj.service.colleryAnalyse.impl;

import com.gmsj.common.vo.colleryAnalyse.CoalVO;
import com.gmsj.common.vo.colleryAnalyse.ColleryEnterpriseVO;
import com.gmsj.service.colleryAnalyse.ColleryAnalyseIndexService;
import com.gmsj.service.colleryAnalyse.ColleryAnalyseService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class colleryAnalyseServiceImpl implements ColleryAnalyseService {

    @Autowired
    private ColleryAnalyseIndexService indexService;

    private static final Integer DIFF_YEAR = -1;

    private static final Integer DEFAULT_CHOOSE_FLAG = 1;


    @Override
    public ColleryEnterpriseVO queryColleryEnterpriseInfo(Integer groupId) {
        Calendar calendar = Calendar.getInstance();
        //统计的是现在之前的一年
        calendar.add(Calendar.YEAR, DIFF_YEAR);
        Integer year = calendar.get(calendar.YEAR);
        ColleryEnterpriseVO vo = new ColleryEnterpriseVO();
        //产量波动
        vo.setProductionRangeVO(indexService.queryEnterpriseDefaultProductionRangeInfo(groupId));
        //产能总量
        vo.setTotalCapacityVO(indexService.queryEnterpriseTotalCapacityInfo(groupId, year));
        //安全隐患数
        vo.setSafetyDangerVO(indexService.querySafetyDangerInfo(groupId, year));
        //安全事故和诉讼数据
        vo.setAccidentAndLitigationVO(indexService.queryEnterpriseAccidentAndLitigationInfo(groupId, year));
        //抵押数量数据
        vo.setMortgageVO(indexService.queryEnterpriseMortgageInfo(groupId, year));
        //设置煤企地图
        vo.setGroupMapVO(indexService.queryEnterpriseMapInfo(groupId,year));
        return vo;
    }

    @Override
    public CoalVO queryColleryInfo(Integer coalId) {
        Calendar calendar = Calendar.getInstance();
        Integer year = calendar.get(calendar.YEAR);
        CoalVO vo = new CoalVO();
        //设置生产评分信息
        vo.setProduceScoreVO(indexService.queryColleryProduceScoreInfo(coalId, year));
        //设置煤矿产量波动信息
        vo.setRangeVO(indexService.queryColleryDefaultProductioinRangInfo(coalId));
        //设置产能监测信息
        vo.setDetectionVO(indexService.queryColleryCapacityDetectionInfo(coalId, year));
        //设置安全事故和诉讼信息
        vo.setAccidentAndLitigationVO(indexService.queryColleryAccidentAndLitigationInfo(coalId, year));
        //设置煤矿抵押数量信息
        vo.setMortgageVO(indexService.queryColleryMortgageInfo(coalId, year));
        //设置煤矿默认地图信息（煤矿、非煤矿、下游企业全部显示）
        vo.setSpreadMapVO(indexService.queryColleryMapInfo(coalId,DEFAULT_CHOOSE_FLAG,DEFAULT_CHOOSE_FLAG));
        return vo;
    }


}
