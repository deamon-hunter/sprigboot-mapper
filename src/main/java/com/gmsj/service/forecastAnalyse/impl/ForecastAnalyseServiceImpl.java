package com.gmsj.service.forecastAnalyse.impl;

import com.gmsj.common.vo.forecastAnaylse.*;
import com.gmsj.mapper.IndustryDynamicMapper;
import com.gmsj.mapper.InfluenceFactorMapper;
import com.gmsj.service.forecastAnalyse.ForecastAnalyseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class ForecastAnalyseServiceImpl implements ForecastAnalyseService {


    @Autowired
    private InfluenceFactorMapper influenceMapper;

    @Autowired
    private IndustryDynamicMapper dynamicMapper;

    @Value("${gmsj.developOverview.standardProduction}")
    private Long standardProduction;

    private static final Integer INDUSTRY_ROW_NUM = 5;

    private static final Integer FACTOR_TYPE_PRODUCTION = 1;

    private static final Integer FACTOR_TYPE_PRICE = 2;

    private static final String INFLUENCE_PRODUCTION_TITLE = "产量";

    private static final String INDUSTRY_DYNAMIC_TITLE = "行业动态";

    private static final String INFLUENCE_PRICE_TITLE = "价格";

    private static final String INFLUENCE_TITLE = "煤炭价格和煤炭产量影响因素";

    private static final String COLLERY_SCALE_FORECAST_TITLE = "年煤矿规模预测";

    private static final String PRICE_FORECAST_TITLE = "煤炭年价格预测（单位：元）";

    private static final String PRODUCTION_FORECAST_TITLE = "年煤种产量预测（单位：万吨）";


    @Override
    public ForecastAnalyseVO queryForecastAnalyseInfo(Integer year) {
        Calendar calendar = Calendar.getInstance();
        Integer curYear = calendar.get(calendar.YEAR);
        ForecastAnalyseVO vo = new ForecastAnalyseVO();
        //价格产量影响因素
        vo.setInfluenceVO(setInfluenceInfo());
        //行业动态
        vo.setDynamicsVO(setDynamicsInfo());
        //煤矿规模预测 （假数据）
        vo.setScaleVO(setScaleInfo(curYear));
        //价格预测 （假数据）
        vo.setPriceVO(setPriceFooecastInfo(curYear));


        //修改

        //产量预测 （假数据）
        vo.setProductVO(setProductForecastInfo(curYear));
        return vo;
    }

    private ProductionForecastVO setProductForecastInfo(Integer curYear) {
        ProductionForecastVO vo = new ProductionForecastVO();
        //设置产量预测标题
        vo.setTitle(curYear.toString() + PRODUCTION_FORECAST_TITLE);
        //设置产量预测详细信息
        vo.setList(setProductionForcastInfo(curYear));
        return vo;
    }

    private List<ForecastItemVO> setProductionForcastInfo(Integer curYear) {
        //暂时值是一样的
        return setPriceForecastInfo(curYear);
    }

    private PriceForecastVO setPriceFooecastInfo(Integer curYear) {
        PriceForecastVO vo = new PriceForecastVO();
        //设置价格预测标题
        vo.setTitle(curYear.toString() + PRICE_FORECAST_TITLE);
        //设置价格预测详细信息
        vo.setList(setPriceForecastInfo(curYear));
        return vo;
    }

    private List<ForecastItemVO> setPriceForecastInfo(Integer curYear) {
        List<ForecastItemVO> list = new ArrayList<>();
        list.add(setForecastItemInfo("褐煤", "400", "620", "470", "680", "680", "710"));
        list.add(setForecastItemInfo("无烟煤", "500", "390", "570", "530", "520", "600"));
        list.add(setForecastItemInfo("烟煤", "120", "300", "250", "310", "430", "380"));
        list.add(setForecastItemInfo("泥煤", "200", "200", "400", "190", "480", "410"));
        list.add(setForecastItemInfo("其他", "50", "100", "300", "110", "380", "310"));
        return list;
    }


    private ForecastItemVO setForecastItemInfo(String title, String janVal, String febVal, String marVal, String aprVal, String mayVal, String junVal) {
        ForecastItemVO retVO = new ForecastItemVO();
        retVO.setTitle(title);
        List<ItemDetailVO> list = new ArrayList<>();
        ItemDetailVO vo1 = new ItemDetailVO();
        vo1.setItem("1月");
        vo1.setValue(janVal);
        list.add(vo1);
        ItemDetailVO vo2 = new ItemDetailVO();
        vo2.setItem("2月");
        vo2.setValue(febVal);
        list.add(vo2);
        ItemDetailVO vo3 = new ItemDetailVO();
        vo3.setItem("3月");
        vo3.setValue(marVal);
        list.add(vo3);
        ItemDetailVO vo4 = new ItemDetailVO();
        vo4.setItem("4月");
        vo4.setValue(aprVal);
        list.add(vo4);
        ItemDetailVO vo5 = new ItemDetailVO();
        vo5.setItem("5月");
        vo5.setValue(marVal);
        list.add(vo5);
        ItemDetailVO vo6 = new ItemDetailVO();
        vo6.setItem("6月");
        vo6.setValue(junVal);
        list.add(vo6);
        ItemDetailVO vo7 = new ItemDetailVO();
        vo7.setItem("7月");
        vo7.setValue(janVal);
        list.add(vo7);
        ItemDetailVO vo8 = new ItemDetailVO();
        vo8.setItem("8月");
        vo8.setValue(febVal);
        list.add(vo8);
        ItemDetailVO vo9 = new ItemDetailVO();
        vo9.setItem("9月");
        vo9.setValue(marVal);
        list.add(vo9);
        ItemDetailVO vo10 = new ItemDetailVO();
        vo10.setItem("10月");
        vo10.setValue(aprVal);
        list.add(vo10);
        ItemDetailVO vo11 = new ItemDetailVO();
        vo11.setItem("11月");
        vo11.setValue(mayVal);
        list.add(vo11);
        ItemDetailVO vo12 = new ItemDetailVO();
        vo12.setItem("12月");
        vo12.setValue(junVal);
        list.add(vo12);
        retVO.setListItem(list);
        return retVO;
    }


    private ColleryScaleForecastVO setScaleInfo(Integer curYear) {
        ColleryScaleForecastVO vo = new ColleryScaleForecastVO();
        //标题
        vo.setTitle(curYear.toString() + COLLERY_SCALE_FORECAST_TITLE);
        //规模预测详细信息 （假数据）
        List<ItemDetailVO> list = new ArrayList<>();
        ItemDetailVO vo1 = new ItemDetailVO();
        vo1.setItem("30万吨以上");
        vo1.setValue("70");
        list.add(vo1);
        ItemDetailVO vo2 = new ItemDetailVO();
        vo2.setItem("30万吨以下");
        vo2.setValue("30");
        list.add(vo2);
        vo.setList(list);
        return vo;
    }

    private DynamicsVO setDynamicsInfo() {
        DynamicsVO vo = new DynamicsVO();
        //标题
        vo.setTitle(INDUSTRY_DYNAMIC_TITLE);
        //详细信息
        vo.setList(dynamicMapper.listDynamicInfo(INDUSTRY_ROW_NUM));
        return vo;
    }


    private InfluenceVO setInfluenceInfo() {
        InfluenceVO vo = new InfluenceVO();
        //设置标题
        vo.setTitle(INFLUENCE_TITLE);
        //设置讲过详细信息
        vo.setProdctionVO(setInfluenceInfo(INFLUENCE_PRODUCTION_TITLE, FACTOR_TYPE_PRODUCTION));
        //设置价格详细信息
        vo.setPriceVO(setInfluenceInfo(INFLUENCE_PRICE_TITLE, FACTOR_TYPE_PRICE));
        return vo;
    }


    private DetailVO setInfluenceInfo(String title, Integer factorType) {
        DetailVO vo = new DetailVO();
        //标题
        vo.setTitle(title);
        //详细信息
        vo.setList(influenceMapper.listInfo(factorType));
        return vo;
    }


}
