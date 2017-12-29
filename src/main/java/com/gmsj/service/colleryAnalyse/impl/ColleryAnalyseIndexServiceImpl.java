package com.gmsj.service.colleryAnalyse.impl;

import com.gmsj.common.vo.colleryAnalyse.*;
import com.gmsj.common.vo.CommonVO;
import com.gmsj.mapper.*;
import com.gmsj.service.colleryAnalyse.ColleryAnalyseIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class ColleryAnalyseIndexServiceImpl implements ColleryAnalyseIndexService {


    @Autowired
    private ColleryProductionMapper productionMapper;

    @Autowired
    private CollieryInformationMapper informationMapper;

    @Autowired
    private SecurityCheckMapper securityMapper;

    @Autowired
    private SafetyAccidentMapper safetMapper;

    @Autowired
    private LegalProceedingsMapper legalMapper;

    @Autowired
    private BankMortgageMapper mortgageMapper;

    @Autowired
    private ProductionScoreMapper scoreMapper;

    @Autowired
    private CapacityMonitorMapper monitorMapper;

    @Autowired
    private OtherMinesMapMapper otherMapper;

    @Autowired
    private DownstreamEnterprisesMapMapper downstreamMapper;

    private static final Integer UNIT_DIFF_MONTH = -1;

    private static final Integer DIFF_MONTH = 6;

    private static final Float UNIT_DEGREE = 0.5F;

    private static final Integer NOT_DEFAULT_CHOOSE_FLAG = 0;

    private static final String MONTH_UNIT = "月";

    private static final String YEAR_UNIT = "年";

    private static final String PRODUCTION_RANGE_TITLE = "煤企产量波动（单位：万吨）";

    private static final String TOTAL_CAPACTIY_TITLE = "煤企产能总量（单位：万吨）";

    private static final String SAFETY_DANGER_TITLE = "安全隐患数";

    private static final String GROUP_MAP_TITLE = "煤企下属煤矿分布图";

    private static final String COLLERY_PRODUCTION_RANGE_TITLE = "煤矿产量波动（单位：万吨）";

    private static final String GUIZHOU_GROUP_ACCIDENT_TITLE = "贵州省集团安全事故（单位：起）";

    private static final String GUIZHOU_GROUP_LITIGATION_TITLE = "贵州省集团诉讼数据（单位：起）";

    private static final String GUIZHOU_MORTGAGE_TITLE = "贵州省集团抵押数量（单位：个）";

    private static final String GUIZHOU_COLLERY_PRODUCE_SCORE_TITLE = "煤矿生产评分";

    private static final String GUIZHOU_PRODUCTION_DETECTION_TITLE = "煤矿产能检测总量（单位：吨）";

    private static final String GUIZHOU_COLLERY_ACCIDENT_TITLE = "贵州省煤矿安全事故数量（单位：起）";

    private static final String GUIZHOU_COLLERY_LITIGATION_TITLE = "贵州省煤矿诉讼数量（单位：起）";

    private static final String GUIZHOU_COLLERY_MORTGAGE_TITLE = "贵州省煤矿抵押数量（单位：个）";

    private static final String COLLERY_MAP_TITLE = "煤矿分布地图";


    @Override
    public ProductionRangeVO queryEnterpriseDefaultProductionRangeInfo(Integer groupId) {
        ProductionRangeVO vo = new ProductionRangeVO();
        //设置产量波动标题
        vo.setProductionRangeTitle(PRODUCTION_RANGE_TITLE);
        //设置产量波动信息
        vo.setListProductionRangeVO(setListProductionRangeVOInfo(groupId));
        return vo;
    }

    @Override
    public ProductRangeVO queryColleryDefaultProductioinRangInfo(Integer coalId) {
        ProductRangeVO vo = new ProductRangeVO();
        //设置煤矿产量波动标题
        vo.setRangeTitle(COLLERY_PRODUCTION_RANGE_TITLE);
        //设置煤矿产量波动信息
        vo.setListProductionRange(setListProductionRangeInfo(coalId));
        return vo;
    }

    @Override
    public GroupMapVO queryEnterpriseMapInfo(Integer groupId, Integer year) {
        GroupMapVO vo = new GroupMapVO();
        //设置煤企地图标题
        vo.setTitle(GROUP_MAP_TITLE);
        //设置煤企下属煤矿地图信息
        List<MapItemVO> list = informationMapper.listGroupMapByGroupIdAndYear(groupId, year);
        for (MapItemVO itemVO: list) {
            Integer length = itemVO.getLongitudeAndlatitude().length();
            itemVO.setLongitudeAndlatitude(itemVO.getLongitudeAndlatitude().substring(1,length-1));
        }
        vo.setList(list);
        return vo;
    }

    @Override
    public CollerySpreadMapVO queryColleryMapInfo(Integer coalId, Integer nonCoalId, Integer downStreamId) {
        CollerySpreadMapVO vo = new CollerySpreadMapVO();
        vo.setTitle(COLLERY_MAP_TITLE);
        Float preLongitude = null;
        Float NexLongitude = null;
        Float preLatitude = null;
        Float NexLatitude = null;

        MapItemVO coalMap = null;
        //不是0，煤矿被选中
        if (null != coalId && 0 != NOT_DEFAULT_CHOOSE_FLAG.compareTo(coalId)) {
            coalMap = informationMapper.getMapByCoalIdAndYear(coalId);
            Integer length = coalMap.getLongitudeAndlatitude().length();
            coalMap.setLongitudeAndlatitude(coalMap.getLongitudeAndlatitude().substring(1,length - 1));
            preLongitude = Float.valueOf(coalMap.getLongitude()) - UNIT_DEGREE;
            NexLongitude = Float.valueOf(coalMap.getLongitude()) + UNIT_DEGREE;
            preLatitude = Float.valueOf(coalMap.getLatitude()) - UNIT_DEGREE;
            NexLatitude = Float.valueOf(coalMap.getLatitude()) + UNIT_DEGREE;
        }
        vo.setCoalMap(coalMap);
        List<MapItemVO> listNonCoalMap = null;
        //不是0，非煤矿被选中（如果煤矿同时被选中，需要关联煤矿信息）
        if ( null != nonCoalId && 0 != NOT_DEFAULT_CHOOSE_FLAG.compareTo(nonCoalId) ) {
            if (null != coalMap) {
                listNonCoalMap = otherMapper.listNonCoalMap(preLongitude, NexLongitude, preLatitude, NexLatitude);
            } else {
                listNonCoalMap = otherMapper.listNonCoalMap(null, null, null, null);
            }
            for (  MapItemVO itemVO: listNonCoalMap) {
                if ( null != itemVO && null != itemVO.getLongitudeAndlatitude() ) {
                    Integer length = itemVO.getLongitudeAndlatitude().length();
                    itemVO.setLongitudeAndlatitude(itemVO.getLongitudeAndlatitude().substring(1,length-1));
                }
            }
        }
        vo.setNonCoalMap(listNonCoalMap);
        List<MapItemVO> listDownMap = null;
        //不是0，下游企业被选中（如果煤矿同时被选中，需要关联煤矿信息）
        if (null != downStreamId && 0 != NOT_DEFAULT_CHOOSE_FLAG.compareTo(downStreamId)) {
            if ( null != coalMap ) {
                listDownMap = downstreamMapper.listDownstreamMap(preLongitude, NexLongitude, preLatitude, NexLatitude);
            } else {
                listDownMap = downstreamMapper.listDownstreamMap(null, null, null, null);
            }
            for (  MapItemVO itemVO: listDownMap) {
                if ( null != itemVO && null != itemVO.getLongitudeAndlatitude() ) {
                    Integer length = itemVO.getLongitudeAndlatitude().length();
                    itemVO.setLongitudeAndlatitude(itemVO.getLongitudeAndlatitude().substring(1,length-1));
                }
            }
        }
        //下游企业的处理同上
        vo.setDownstreamMap(listDownMap);
        return vo;
    }

    @Override
    public TotalCapacityVO queryEnterpriseTotalCapacityInfo(Integer groupId, Integer year) {
        TotalCapacityVO vo = new TotalCapacityVO();
        //设置产能总量标题
        vo.setTotalCapacityTitle(TOTAL_CAPACTIY_TITLE);
        //设置产能总量总和
        vo.setTotalCapacity(productionMapper.getTotalCapacityByGroupId(groupId, year));
        //设置产能总量信息
        vo.setListTotalCapacity(setListTotalCapacityInfo(groupId, year));
        return vo;
    }

    @Override
    public SafetyDangerVO querySafetyDangerInfo(Integer groupId, Integer year) {
        SafetyDangerVO vo = new SafetyDangerVO();
        //设置安全隐患数标题
        vo.setSafetyDangerTitle(SAFETY_DANGER_TITLE);
        //设置安全隐患数信息
        List<CommonVO> listSafetyInfo = securityMapper.listSecurityClassifyByGroupId(groupId, year);
        vo.setListSafetyDanger(listSafetyInfo);
        return vo;
    }

    @Override
    public AccidentAndLitigationVO queryEnterpriseAccidentAndLitigationInfo(Integer groupId, Integer year) {
        AccidentAndLitigationVO vo = new AccidentAndLitigationVO();
        //设置统计的年份
        vo.setYear(year.toString() + YEAR_UNIT);
        //设置安全事故标题
        vo.setAccidentTitle(GUIZHOU_GROUP_ACCIDENT_TITLE);
        //设置集团诉讼数据标题
        vo.setLitigationTitle(GUIZHOU_GROUP_LITIGATION_TITLE);
        //设置统计年份的安全事故数
        vo.setAccidentNum(safetMapper.getTotalAccidentNumByYear(year, groupId));
        //设置统计年份的诉讼数据数
        vo.setLitigationNum(legalMapper.getTotalLitigationNumByYear(year, groupId));
        return vo;
    }

    @Override
    public MortgageVO queryEnterpriseMortgageInfo(Integer groupId, Integer year) {
        MortgageVO vo = new MortgageVO();
        vo.setYear(year.toString() + YEAR_UNIT);
        //设置集团抵押数量标题
        vo.setMortgageTitle(GUIZHOU_MORTGAGE_TITLE);
        //设置集团抵押数量信息
        vo.setMortgageNum(mortgageMapper.getTotalMortgageNum(groupId, year));
        return vo;
    }

    @Override
    public ProduceScoreVO queryColleryProduceScoreInfo(Integer coalId, Integer year) {
        ProduceScoreVO vo = new ProduceScoreVO();
        //设置生产评分标题
        vo.setProduceScoreTitle(GUIZHOU_COLLERY_PRODUCE_SCORE_TITLE);
        List<CommonVO> list = scoreMapper.listProductionScoreByCoalId(coalId, year);
        Integer totalNum = 0;
        for (CommonVO commonVO : list) {
            totalNum += Integer.valueOf(commonVO.getCount());
        }
        //设置煤矿生产评分总分数
        vo.setTotalScore(totalNum);
        //设置煤矿的生产评分信息
        vo.setListScore(list);
        return vo;
    }

    @Override
    public ColleryCapacityDetectionVO queryColleryCapacityDetectionInfo(Integer coalId, Integer year) {
        ColleryCapacityDetectionVO vo = new ColleryCapacityDetectionVO();
        //设置煤矿产能检测标题
        vo.setCapacityTitle(GUIZHOU_PRODUCTION_DETECTION_TITLE);
        //设置煤矿产能检测总量信息
        List<CommonVO> list = monitorMapper.listCapacityDetectionInfoByCoalId(coalId, year);
        if (null != list && list.size() > 0) {
            vo.setListTotalCapacity(list.subList(0, list.size() - 1));
            //设置煤矿产能检测总和(list最后一个为日产量总和)
            vo.setTotalCapacityNum(Long.valueOf(list.get(list.size() - 1).getCount()));
        }
        return vo;
    }

    @Override
    public ColleryAccidentAndLitigationVO queryColleryAccidentAndLitigationInfo(Integer coalId, Integer year) {
        ColleryAccidentAndLitigationVO vo = new ColleryAccidentAndLitigationVO();
        //设置统计年份
        vo.setYear(year.toString() + YEAR_UNIT);
        //设置煤矿安全事故标题
        vo.setAccidentTitle(GUIZHOU_COLLERY_ACCIDENT_TITLE);
        //设置煤矿诉讼数量标题
        vo.setLitigationTitle(GUIZHOU_COLLERY_LITIGATION_TITLE);
        //设置煤矿安全事故数量信息
        vo.setAccidentNum(safetMapper.getColleryAccidentNumByYearAndCoalId(year, coalId));
        //设置煤矿诉讼数量信息
        vo.setLitigationNum(legalMapper.getColleryLitigationNumByYearAndCoalId(year, coalId));
        return vo;
    }

    @Override
    public ColleryMortgageVO queryColleryMortgageInfo(Integer coalId, Integer year) {
        ColleryMortgageVO vo = new ColleryMortgageVO();
        //设置统计的年份
        vo.setYear(year.toString() + YEAR_UNIT);
        //设置抵押标题
        vo.setTitle(GUIZHOU_COLLERY_MORTGAGE_TITLE);
        //设置抵押数量
        vo.setMortgageNum(mortgageMapper.getMortgageNumByYearAndCoalId(year, coalId));
        return vo;
    }


    /**
     * @param coalId
     * @return
     */
    private List<CommonVO> setListProductionRangeInfo(Integer coalId) {
        List<CommonVO> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        Integer month = calendar.get(calendar.MONTH);
        Integer year = calendar.get(calendar.YEAR);
        for (int i = 0; i < DIFF_MONTH; i++) {//产量波动统计默认6个月
            CommonVO curVo = productionMapper.getColleryProductionRangeInfoByCoalId(year, month + 1, coalId);
            list.add(curVo);
            calendar.add(calendar.MONTH, UNIT_DIFF_MONTH);
            month = calendar.get(calendar.MONTH);
            year = calendar.get(calendar.YEAR);
        }
        return list;
    }


    /**
     * @param groupId
     * @return
     * @description 返回 煤矿分析 --> 煤企画像 --> 产能总量 信息
     */
    private List<CommonVO> setListTotalCapacityInfo(Integer groupId, Integer year) {
        List<CommonVO> list = productionMapper.listTotalCapacityInfoByGroupId(groupId, year);
        return list;
    }

    /**
     * 返回煤企分析 --> 煤企画像 --> 系统默认6个月的煤企产量信息
     *
     * @param groupId
     * @return
     */
    private List<CommonVO> setListProductionRangeVOInfo(Integer groupId) {
        List<CommonVO> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        Integer month = calendar.get(calendar.MONTH);
        Integer year = calendar.get(calendar.YEAR);
        for (int i = 0; i < DIFF_MONTH; i++) {//产量波动统计默认6个月
            CommonVO curVo = productionMapper.getGroupProductionByYearAndMonth(year, month + 1, groupId);
            if ( null == curVo ) {
                curVo = new CommonVO();
                curVo.setType(String.valueOf(month + 1) + MONTH_UNIT);
                curVo.setCount("0");
            }
            list.add(curVo);
            calendar.add(calendar.MONTH, -1);
            month = calendar.get(calendar.MONTH);
            year = calendar.get(calendar.YEAR);
        }
        return list;
    }


}
