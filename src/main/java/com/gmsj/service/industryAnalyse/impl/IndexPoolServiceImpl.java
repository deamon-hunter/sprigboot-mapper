package com.gmsj.service.industryAnalyse.impl;

import com.gmsj.common.vo.CommonVO;
import com.gmsj.common.vo.industryAnaylse.*;
import com.gmsj.mapper.*;
import com.gmsj.service.industryAnalyse.IndexPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class IndexPoolServiceImpl implements IndexPoolService {

    @Autowired
    CollieryInformationMapper colinfoMapper;

    @Autowired
    ColleryProductionMapper productionMapper;

    @Autowired
    private FinancialStandingMapper financialMapper;

    @Autowired
    CertificatesMapper certificatesMapper;

    @Autowired
    private LegalProceedingsMapper legalMapper;

    @Autowired
    private SecurityCheckMapper securityMapper;

    @Autowired
    GroupMapper groupMapper;

    @Value("${gmsj.developOverview.standardProduction}")
    private Long standardProduction;

    private static final Integer ROW_NUM = 10;

    private static final String YEAR_UNIT = "年";

    private static final String PROFIT_TITLE = "盈利";

    private static final String NO_PROFIT_TITLE = "未盈利";

    private static final String COLLERY_PROFIT_TITLE = "年煤矿盈利情况";

    private static final String GROUP_NUM = "集团数量";

    private static final String COLLERY_NUM = "煤矿数量";

    private static final String COLLERY_SCALE_CHANGE = "煤矿规模变化（单位：个）";

    private static final String COLLERY_ENTERPRISE_TYPE = "煤矿企业性质";

    private static final String COLLERY_GROUP_NUM_CHANGE = "矿企数量变化（单位：个）";

    private static final String COLLERY_PRODUCTION_CHANGE = "煤矿产量变化（单位：万吨）";

    private static final String COLLERY_SPREAD_TITLE = "矿点分布图";

    private static final String SECURITY_CLASSIFY_TITLE = "年安全分类";

    private static final String COLLERY_YEAR_TO_YEAR_GROWTH_RATE = "煤矿同比增长率";

    private static final String PRODUCTION_YEAR_TO_YEAR_GROWTH_RATE = "产量同比增长率";

    private static final String LITIGATION_CLASSIFY_TITLE = "年诉讼分类（单位：个）";

    private static final String COLLERY_EXPLOITATION_RATE_TITLE = "煤矿开采率（单位：百分比）";

    private static final String COLLERY_TOP_TEN_TITLE = "年煤矿产量前10煤矿";

    private static final String COLLERY_PRODUCTION_RATE_GROW = "煤矿数量增长和产量增长趋势图（单位：百分比）";

    // ----------------------- 指标池 -------------------------//

    @Override
    public EnterpriseTypeVO queryCollieryClassifyInfo(Integer year) {
        EnterpriseTypeVO vo = new EnterpriseTypeVO();
        //煤矿企业性质标题
        vo.setTitle(COLLERY_ENTERPRISE_TYPE);
        //煤矿企业模块信息
        List<CommonVO> list = certificatesMapper.listCollieryType(year);
        vo.setListEnterpriseTypeVO(list);
        return vo;
    }

    @Override
    public ColleryAndGroupNumChangeVO queryCollieryNumChangeInfo(String startYear,
                                                                 String endYear) {
        ColleryAndGroupNumChangeVO vo = new ColleryAndGroupNumChangeVO();
        //矿企数量变化标题
        vo.setTitle(COLLERY_GROUP_NUM_CHANGE);
        IndustryCommonVO groupInfoVO = new IndustryCommonVO();
        groupInfoVO.setTitle(GROUP_NUM);
        List<CommonInfoVO> listGroup = new ArrayList<>();
        IndustryCommonVO coalInfoVO = new IndustryCommonVO();
        coalInfoVO.setTitle(COLLERY_NUM);
        List<CommonInfoVO> listCoal = new ArrayList<>();
        for (int year = Integer.valueOf(startYear); year <= Integer.valueOf(endYear); year++) {
            CommonInfoVO groupVO = new CommonInfoVO();
            CommonInfoVO coalVO = new CommonInfoVO();
            groupVO.setYear(String.valueOf(year) + YEAR_UNIT);
            groupVO.setNum(Float.valueOf(groupMapper.listGroupNumChangeByRangeYear(year)));
            coalVO.setYear(String.valueOf(year) + YEAR_UNIT);
            coalVO.setNum(Float.valueOf(certificatesMapper.listColleryNumChange(year)));
            listGroup.add(groupVO);
            listCoal.add(coalVO);
        }
        groupInfoVO.setList(listGroup);
        coalInfoVO.setList(listCoal);
        //设置集团数量变化信息
        vo.setGroupVO(groupInfoVO);
        //设置煤矿数量变化信息
        vo.setCoalVO(coalInfoVO);
        return vo;
    }

    @Override
    public ColleryScaleChangeVO queryScaleChangeInfo(String startYear,
                                                     String endYear) {
        ColleryScaleChangeVO vo = new ColleryScaleChangeVO();
        //煤矿规模变化标题
        vo.setTitle(COLLERY_SCALE_CHANGE);
        IndustryCommonVO higherVO = new IndustryCommonVO();
        higherVO.setTitle("年产" + standardProduction.toString() + "万吨以上");
        IndustryCommonVO lowerVO = new IndustryCommonVO();
        lowerVO.setTitle("年产" + standardProduction.toString() + "万吨以下");
        List<CommonInfoVO> listHigher = new ArrayList<>();
        List<CommonInfoVO> listLower = new ArrayList<>();
        for (int year = Integer.valueOf(startYear); year <= Integer.valueOf(endYear); year++) {
            CommonInfoVO upVO = new CommonInfoVO();
            CommonInfoVO downVO = new CommonInfoVO();
            upVO.setYear(String.valueOf(year) + YEAR_UNIT);
            downVO.setYear(String.valueOf(year) + YEAR_UNIT);
            upVO.setNum(productionMapper.getHigherNumByYear(year, standardProduction));
            downVO.setNum(productionMapper.getLowerNumByYear(year, standardProduction));
            listHigher.add(upVO);
            listLower.add(downVO);
        }
        higherVO.setList(listHigher);
        lowerVO.setList(listLower);
        //设置高于标准的煤矿规模变化信息
        vo.setHigherVO(higherVO);
        //设置低于标准的煤矿规模变化信息
        vo.setLowerVO(lowerVO);
        return vo;
    }

    @Override
    public ColleryPorductionChangeVO queryProductionChangeInfo(String startYear,
                                                               String endYear) {
        ColleryPorductionChangeVO vo = new ColleryPorductionChangeVO();
        //设置煤矿产量变化信息标题
        vo.setTitle(COLLERY_PRODUCTION_CHANGE);
        //设置煤矿产量变化信息
        vo.setList(productionMapper.listProductionChange(startYear, endYear));
        return vo;
    }

    @Override
    public ColleryNumAndProductionGrowRateVO queryRateGrowInfo(String startYear, String endYear) {

        ColleryNumAndProductionGrowRateVO vo = new ColleryNumAndProductionGrowRateVO();
        //煤矿数量增长和产量增长趋势图标题
        vo.setTitle(COLLERY_PRODUCTION_RATE_GROW);
        IndustryCommonVO coalGrow = new IndustryCommonVO();
        IndustryCommonVO productoinGrow = new IndustryCommonVO();
        //设置煤矿数量增长标题
        coalGrow.setTitle(COLLERY_YEAR_TO_YEAR_GROWTH_RATE);
        //设置煤矿产量增长标题
        productoinGrow.setTitle(PRODUCTION_YEAR_TO_YEAR_GROWTH_RATE);
        // 得到统计的前一年，用以统计开始年份增长率
        startYear = String.valueOf(Integer.valueOf(startYear) - 1);
        List<CommonInfoVO> listCoal = certificatesMapper.listCoalNumChange(
                startYear, endYear);
        listCoal = setCollieryRate(listCoal);
        //设置煤矿数量增长率信息
        coalGrow.setList(listCoal);
        vo.setCoalRate(coalGrow);
        List<CommonInfoVO> listProduct = productionMapper
                .listProductionChange(startYear, endYear);
        listProduct = setProductionRate(listProduct);
        //设置煤矿产量增长率信息
        productoinGrow.setList(listProduct);
        vo.setProducitonRate(productoinGrow);
        return vo;
    }

    @Override
    public ColleryTopTenVO queryTopTenCollieryInfo(Integer currentYear) {
        ColleryTopTenVO vo = new ColleryTopTenVO();
        //统计的是前一年的情况
        currentYear = currentYear - 1;
        //煤矿产量前10煤企标题
        vo.setTopTenTitle(currentYear.toString() + COLLERY_TOP_TEN_TITLE);
        //煤矿产量前10信息
        vo.setListTopTenVO(productionMapper.listTopTenCollery(currentYear - 1, ROW_NUM));
        return vo;
    }

    @Override
    public CollerySpreadVO queryCollerySpreadInfo(Integer year) {
        CollerySpreadVO vo = new CollerySpreadVO();
        //矿点分布图标题
        vo.setCoalSpreadTitle(COLLERY_SPREAD_TITLE);
        //矿点分布图信息
        vo.setListCoalSpreadMapVO(colinfoMapper.listAllLatitudeAndlongitudeByYear(year));
        return vo;
    }

    @Override
    public SafetyClassifyVO querySafetyClassifyInfo(Integer year) {
        SafetyClassifyVO vo = new SafetyClassifyVO();
        //安全分类标题
        vo.setSecurityClassifyTitle(year.toString() + SECURITY_CLASSIFY_TITLE);
        //安全分类信息
        List<CommonVO> list = securityMapper.listSecurityClassifyByYear(year);
        vo.setListSecurityClassifyVO(list);
        return vo;
    }

    @Override
    public LitigateClassifyVO queryLitigateClassifyVOInfo(Integer year) {
        LitigateClassifyVO vo = new LitigateClassifyVO();
        //诉讼分类标题
        vo.setLitigateClassifyTitle(year.toString() + LITIGATION_CLASSIFY_TITLE);
        //诉讼分类信息
        vo.setListLitigationClassifyVO(legalMapper.listLegalProceedingsByYear(year));
        return vo;
    }

    @Override
    public ColleryExploitationRateVO queryExploitationRateInfo(Integer preYear, Integer currentYear) {
        ColleryExploitationRateVO vo = new ColleryExploitationRateVO();
        //煤矿开采率标题
        vo.setExploitateRateTitle(COLLERY_EXPLOITATION_RATE_TITLE);
        //煤矿开采率信息
        vo.setListExploitationRateVO(getExploitationRate(Integer.valueOf(preYear), Integer.valueOf(currentYear)));
        return vo;
    }

    @Override
    public ColleryGainProfitVO queryGainProfitInfo(Integer year) {
        ColleryGainProfitVO vo = new ColleryGainProfitVO();
        //煤矿盈利情况
        vo.setColleryProfitTitle(year.toString() + COLLERY_PROFIT_TITLE);
        CommonVO profitVO = new CommonVO();
        CommonVO noProfitVO = new CommonVO();
        ColleryProfitVO profitInfo = getProfitInfo(year);
        //设置盈利信息标题
        profitVO.setType(PROFIT_TITLE);
        //设置盈利信息
        profitVO.setCount(profitInfo.getProfitNum().toString());
        vo.setProfitVO(profitVO);
        //设置没盈利信息标题
        noProfitVO.setType(NO_PROFIT_TITLE);
        //设置没盈利信息
        noProfitVO.setCount(profitInfo.getNoProfitNum().toString());
        vo.setNoProfitVO(noProfitVO);
        return vo;
    }


    private ColleryProfitVO getProfitInfo(Integer currentYear) {
        ColleryProfitVO retVO = financialMapper.queryProfitInfoByYear(currentYear);
        retVO.setTotalNum(retVO.getProfitNum() + retVO.getNoProfitNum());
        retVO.setYear(currentYear);
        return retVO;
    }

    private List<ExploitationRateVO> getExploitationRate(Integer preYear,
                                                         Integer currentYear) {
        List<ExploitationRateVO> retList = new ArrayList<ExploitationRateVO>();
//        Float totalStock = certificatesMapper.getTotalStock();
        Float totalStock = 1000.0F;
        List<CommonVO> listYearTotalStock = productionMapper
                .listTotalStockByYear(preYear, currentYear);
        if (null != listYearTotalStock && listYearTotalStock.size() > 0) {
            for (CommonVO vo : listYearTotalStock) {
                ExploitationRateVO rateVO = new ExploitationRateVO();
                rateVO.setYear(vo.getType());
                rateVO.setRate(getProductionRate(Float.valueOf(vo.getCount()), totalStock));
                retList.add(rateVO);
            }
        }
        return retList;
    }

    private List<CommonInfoVO> setProductionRate(
            List<CommonInfoVO> listProduct) {
        List<CommonInfoVO> list = null;
        if (null != listProduct && listProduct.size() > 0) {
            list = new ArrayList<>();
            for (int i = 1; i <= listProduct.size() - 1; i++) {
                CommonInfoVO vo = new CommonInfoVO();
                float rate = getRate(listProduct.get(i - 1).getNum(),
                        listProduct.get(i).getNum());
                vo.setYear(listProduct.get(i).getYear());
                vo.setNum(rate);
                list.add(vo);
            }
        }
        return list;
    }

    private List<CommonInfoVO> setCollieryRate(List<CommonInfoVO> listCoal) {
        List<CommonInfoVO> list = null;
        if (null != listCoal && listCoal.size() > 0) {
            list = new ArrayList<>();
            for (int i = 1; i <= listCoal.size() - 1; i++) {
                CommonInfoVO vo = new CommonInfoVO();
                float rate = getRate(
                        Float.valueOf(listCoal.get(i - 1).getNum()),
                        Float.valueOf(listCoal.get(i).getNum()));
                vo.setYear(listCoal.get(i).getYear());
                vo.setNum(rate);
                list.add(vo);
            }
        }
        return list;
    }

    private float getRate(Float preCollieryNum, Float nextCollieryNum) {
        float rate = new BigDecimal((float) (nextCollieryNum - preCollieryNum)
                / preCollieryNum).setScale(2, BigDecimal.ROUND_HALF_UP)
                .floatValue();
        return Math.abs(rate);
    }

    private float getProductionRate(Float yearTotalStock, Float totalStock) {
        float rate = new BigDecimal((float) yearTotalStock / totalStock)
                .setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
        return rate;
    }

}
