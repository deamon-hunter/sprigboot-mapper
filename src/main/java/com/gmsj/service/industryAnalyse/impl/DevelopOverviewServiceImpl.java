package com.gmsj.service.industryAnalyse.impl;

import com.gmsj.common.vo.industryAnaylse.ColleryTotalNumVO;
import com.gmsj.common.vo.industryAnaylse.ColleryTotalProductionVO;
import com.gmsj.common.vo.industryAnaylse.DevelopOverviewVO;
import com.gmsj.mapper.CertificatesMapper;
import com.gmsj.mapper.ColleryProductionMapper;
import com.gmsj.mapper.CollieryInformationMapper;
import com.gmsj.service.industryAnalyse.DevelopOverviewService;
import com.gmsj.service.industryAnalyse.IndexPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class DevelopOverviewServiceImpl implements DevelopOverviewService {

    @Autowired
    private IndexPoolService indexService;

    @Autowired
    private CertificatesMapper certificatesMapper;

    @Autowired
    private ColleryProductionMapper productionMapper;

    private static final String YEAR_UNIT = "年";

    private static final String GUIZHOU_TOTAL_COLLERY_NUM = "贵州省煤矿总数量（单位：个）";

    private static final String GUIZHOU_TOTAL_PRODUCTION = "贵州省煤矿总产出量（单位：万吨）";

    private static final Integer DIFF_YEAR = -5;

    private static final Integer DIFF_YEAR_OF_LAST = -1;

    @Override
    @SuppressWarnings("static-access")
    public DevelopOverviewVO queryDevelopOverviewInfo() {

        DevelopOverviewVO retVO = new DevelopOverviewVO();
        Calendar calendar = Calendar.getInstance();
        Integer currentYear = calendar.get(calendar.YEAR);
        calendar.add(Calendar.YEAR, DIFF_YEAR);
        Integer preYear = calendar.get(calendar.YEAR);

        //贵州省煤矿总数量信息
        retVO.setColleryTotalNumVO(setColleryTotalNumVOInfo());
        //贵州省煤矿总产出量信息
        retVO.setColleryTotalProductionVO(setColleryTotalProductionVO());
        //煤矿企业性质模块信息
        retVO.setEnterpriseTypeVO(indexService.queryCollieryClassifyInfo(currentYear));
        //矿企数量变化模块信息
        retVO.setColleryNumChangeVO(indexService.queryCollieryNumChangeInfo(preYear.toString(), currentYear.toString()));
        //煤矿规模变化信息
        retVO.setColleryScaleChangeVO(indexService.queryScaleChangeInfo(
                preYear.toString(), currentYear.toString()));
        //煤矿产量变化信息
        retVO.setColleryPorductionChangeVO(indexService
                .queryProductionChangeInfo(preYear.toString(), currentYear.toString()));
        //煤矿数量增长和产量变化增长率
        retVO.setColleryNumAndProductionGrowRateVO(indexService.queryRateGrowInfo(
                preYear.toString(), currentYear.toString()));
        return retVO;
    }

    /**
     * @return
     * @description 返回 行业分析 --> 发展总览 --> 贵州省煤矿总产出量 信息
     */
    private ColleryTotalProductionVO setColleryTotalProductionVO() {
        ColleryTotalProductionVO vo = new ColleryTotalProductionVO();
        //统计的年份（m默认当前年份的前一年）
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, DIFF_YEAR_OF_LAST);
        vo.setYear(calendar.get(calendar.YEAR) + YEAR_UNIT);
        //贵州省煤矿总产出量标题
        vo.setTitle(GUIZHOU_TOTAL_PRODUCTION);
        //贵州省煤矿总产出量信息
//        Float total = 300f;
//        vo.setTotalProductioin(total);
        vo.setTotalProductioin(productionMapper
                .getAllProductionByYear(calendar.get(calendar.YEAR)));
        return vo;
    }

    /**
     * @return
     * @description 返回 行业分析 --> 发展总览 --> 贵州省煤矿总数量 信息
     */
    private ColleryTotalNumVO setColleryTotalNumVOInfo() {
        ColleryTotalNumVO vo = new ColleryTotalNumVO();
        //统计的年份
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, DIFF_YEAR_OF_LAST);
        vo.setYear(calendar.get(calendar.YEAR) + YEAR_UNIT);
        //贵州省煤矿总数量标题
        vo.setTitle(GUIZHOU_TOTAL_COLLERY_NUM);
        //贵州省煤矿总数量
        vo.setCount(certificatesMapper
                .getAllCoalCountByYear(calendar.get(calendar.YEAR)));
        return vo;
    }

}
