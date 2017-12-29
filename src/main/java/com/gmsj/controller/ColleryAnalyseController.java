package com.gmsj.controller;

import com.gmsj.common.config.security.annotation.RoleCheck;
import com.gmsj.common.vo.colleryAnalyse.*;
import com.gmsj.service.colleryAnalyse.ColleryAnalyseIndexService;
import com.gmsj.service.colleryAnalyse.ColleryAnalyseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "煤矿分析模块", description = "煤矿分析模块返回信息")
@RequestMapping(value = "/collery")
public class ColleryAnalyseController {

    @Autowired
    private ColleryAnalyseService colleryAnalyseService;

    @Autowired
    private ColleryAnalyseIndexService indexService;


    //----------------------------------- 煤企画像 ------------------------------------------//
    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 煤企画像 ", notes = "get single enterprise page info ", response = ColleryEnterpriseVO.class, httpMethod = "GET")
    @RequestMapping(value = "/enterprise/{groupId}", method = RequestMethod.GET)
    public ColleryEnterpriseVO querySingleColleryEnterpriseInfo(@PathVariable("groupId") Integer groupId) {
        ColleryEnterpriseVO vo = colleryAnalyseService.queryColleryEnterpriseInfo(groupId);
        return vo;
    }

    //----------------------------------- 煤矿画像 ----------------------------------------//
    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 煤矿画像 ", notes = "get collery page info", response = CoalVO.class, httpMethod = "GET")
    @RequestMapping(value = "/coal/{coalId}")
    public CoalVO queryColleryInfo(@PathVariable("coalId") Integer coalId) throws IllegalAccessException {
        CoalVO vo = colleryAnalyseService.queryColleryInfo(coalId);
        return vo;
    }


    //----------------------------------- 指标池 -------------------------------------------//

    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 指标池 --> 设置煤企产量波动（当前月的前6个月） ", notes = "get collery page info", response = CoalVO.class, httpMethod = "GET")
    @RequestMapping(value = "/index/range/{groupId}")
    public ProductionRangeVO queryEnterpriseProductionRangeInfo(
            @PathVariable("groupId") Integer groupId) {
        ProductionRangeVO vo = indexService.queryEnterpriseDefaultProductionRangeInfo(groupId);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 指标池 --> 设置煤企产能总量 ", notes = "get enterprise total production page info", response = TotalCapacityVO.class, httpMethod = "GET")
    @RequestMapping(value = "/index/capacity/{groupId}/{year}")
    public TotalCapacityVO queryEnterpriseTotalCapacityInfo(
            @PathVariable("groupId") Integer groupId,
            @PathVariable("year") Integer year) {
        TotalCapacityVO vo = indexService.queryEnterpriseTotalCapacityInfo(groupId, year);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 指标池 --> 设置煤企安全隐患数 ", notes = "get enterprise safety danger page info", response = SafetyDangerVO.class, httpMethod = "GET")
    @RequestMapping(value = "/index/safety/{groupId}/{year}")
    public SafetyDangerVO queryEnterpriseSafetyDangerInfo(
            @PathVariable("groupId") Integer groupId,
            @PathVariable("year") Integer year) {
        SafetyDangerVO vo = indexService.querySafetyDangerInfo(groupId, year);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 指标池 --> 设置煤企安全事故和集团诉讼数据数 ", notes = "get enterprise safety accident and litigation page info", response = AccidentAndLitigationVO.class, httpMethod = "GET")
    @RequestMapping(value = "/index/accident/{groupId}/{year}")
    public AccidentAndLitigationVO queryEnterpriseAccidentAndLitigationInfo(
            @PathVariable("groupId") Integer groupId,
            @PathVariable("year") Integer year) {
        AccidentAndLitigationVO vo = indexService.queryEnterpriseAccidentAndLitigationInfo(groupId, year);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 指标池 --> 设置煤企抵押数 ", notes = "get enterprise morgage page info", response = MortgageVO.class, httpMethod = "GET")
    @GetMapping(value = "/index/mortgage/{groupId}/{year}")
    public MortgageVO queryEnterpriseMortgageInfo(
            @PathVariable("groupId") Integer groupId,
            @PathVariable("year") Integer year) {
        MortgageVO vo = indexService.queryEnterpriseMortgageInfo(groupId, year);
        return vo;
    }
    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 指标池 --> 设置煤企抵押数 ", notes = "get enterprise map page info", response = GroupMapVO.class, httpMethod = "GET")
    @GetMapping(value = "/index/map/{groupId}/{year}")
    public GroupMapVO queryEnterpriseMapInfo(
            @PathVariable("groupId") Integer groupId,
            @PathVariable("year") Integer year) {
        GroupMapVO vo = indexService.queryEnterpriseMapInfo(groupId,year);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 指标池 --> 设置煤矿生产评分 ", notes = "get collery produce score page info", response = ProduceScoreVO.class, httpMethod = "GET")
    @RequestMapping(value = "/index/score/{coalId}/{year}")
    public ProduceScoreVO queryColleryProduceScoreInfo(
            @PathVariable("coalId") Integer coalId,
            @PathVariable("year") Integer year) {
        ProduceScoreVO vo = indexService.queryColleryProduceScoreInfo(coalId, year);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 指标池 --> 设置煤矿产量波动(默认当前月的前6个月) ", notes = "get collery production range page info", response = ProductRangeVO.class, httpMethod = "GET")
    @RequestMapping(value = "/index/coalRange/{coalId}/{year}")
    public ProductRangeVO queryColeryProductRangeInfo(
            @PathVariable("coalId") Integer coalId) {
        ProductRangeVO vo = indexService.queryColleryDefaultProductioinRangInfo(coalId);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 指标池 --> 设置煤矿产能检测 ", notes = "get collery capacity detection page info", response = ColleryCapacityDetectionVO.class, httpMethod = "GET")
    @RequestMapping(value = "/index/detection/{coalId}/{year}")
    public ColleryCapacityDetectionVO queryColleryCapacityDetectionInfo(
            @PathVariable("coalId") Integer coalId,
            @PathVariable("year") Integer year) {
        ColleryCapacityDetectionVO vo = indexService.queryColleryCapacityDetectionInfo(coalId, year);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 指标池 --> 设置煤矿安全事故和诉讼数据 ", notes = "get collery accident and litigage page info", response = ColleryAccidentAndLitigationVO.class, httpMethod = "GET")
    @RequestMapping(value = "/index/coalAccident/{coalId}/{year}")
    public ColleryAccidentAndLitigationVO queryColleryAccidentAndLitigationInfo(
            @PathVariable("coalId") Integer coalId,
            @PathVariable("year") Integer year) {
        ColleryAccidentAndLitigationVO vo = indexService.queryColleryAccidentAndLitigationInfo(coalId, year);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 指标池 --> 设置煤矿抵押数 ", notes = "get collery mortgage page info", response = ColleryMortgageVO.class, httpMethod = "GET")
    @RequestMapping(value = "/index/coalMortgage/{coalId}/{year}")
    public ColleryMortgageVO queryColleryMortgageInfo(
            @PathVariable("coalId") Integer coalId,
            @PathVariable("year") Integer year) {
        ColleryMortgageVO vo = indexService.queryColleryMortgageInfo(coalId, year);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "煤矿分析 --> 指标池 --> 设置煤矿抵押数 ", notes = "get collery mortgage page info", response = ColleryMortgageVO.class, httpMethod = "GET")
    @RequestMapping(value = "/index/coalMap/{coalId}/{nonCoalId}/{downStreamId}")
    public CollerySpreadMapVO queryColleryMapInfo(
            @PathVariable("coalId") Integer coalId,
            @PathVariable("nonCoalId") Integer nonCoalId,
            @PathVariable("downStreamId") Integer downStreamId) {
        CollerySpreadMapVO vo = indexService.queryColleryMapInfo(coalId,nonCoalId,downStreamId);
        return vo;
    }

}
