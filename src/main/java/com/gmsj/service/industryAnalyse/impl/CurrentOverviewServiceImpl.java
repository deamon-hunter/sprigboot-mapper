package com.gmsj.service.industryAnalyse.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.gmsj.common.vo.*;
import com.gmsj.common.vo.industryAnaylse.*;
import com.gmsj.mapper.*;
import com.gmsj.service.industryAnalyse.IndexPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmsj.service.industryAnalyse.CurrentOverviewService;

@Service
public class CurrentOverviewServiceImpl implements CurrentOverviewService {

    @Autowired
    private IndexPoolService indexService;

    private static final Integer DIFF_YEAR = -5;

    @SuppressWarnings("static-access")
    @Override
    public CurrentOverviewVO queryCurrentOverviewInfo() {

        CurrentOverviewVO vo = new CurrentOverviewVO();
        Calendar calendar = Calendar.getInstance();
        Integer currentYear = calendar.get(calendar.YEAR);
        calendar.add(Calendar.YEAR, DIFF_YEAR);
        Integer preYear = calendar.get(calendar.YEAR);

        //设置煤矿前10信息
        vo.setColleryTopTenVO(indexService.queryTopTenCollieryInfo(currentYear));
        //设置矿点分布图信息
        vo.setCollerySpreadVO(indexService.queryCollerySpreadInfo(currentYear));
        //设置安全分类信息
        vo.setSafetyClassifyVO(indexService.querySafetyClassifyInfo(currentYear));
        //设置诉讼分类信息
        vo.setLitigateClassifyVO(indexService.queryLitigateClassifyVOInfo(currentYear));
        //设置煤矿开采率信息
        vo.setExploitationRateVO(indexService.queryExploitationRateInfo(preYear, currentYear));
        //设置煤矿盈利情况
        vo.setGainProfitVO(indexService.queryGainProfitInfo(currentYear));
        return vo;
    }

}
