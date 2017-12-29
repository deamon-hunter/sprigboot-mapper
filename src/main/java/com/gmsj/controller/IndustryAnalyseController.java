package com.gmsj.controller;

import com.gmsj.common.vo.industryAnaylse.*;
import com.gmsj.service.industryAnalyse.CurrentOverviewService;
import com.gmsj.service.industryAnalyse.DevelopOverviewService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmsj.common.config.security.annotation.RoleCheck;
import com.gmsj.common.vo.CommonVO;
import com.gmsj.service.industryAnalyse.IndexPoolService;

/**
 * @author 刘江
 * @date 2017-12-11
 * @description 行业分析页面
 */
@Api(value = "行业分析模块", description = "行业分析controller")
@RequestMapping("/industry")
@RestController
public class IndustryAnalyseController {

    @Autowired
    private DevelopOverviewService developService;

    @Autowired
    private CurrentOverviewService currentService;

    @Autowired
    private IndexPoolService indexService;

    // ------------------ 发展总览 ---------------------------//
    @RoleCheck
    @GetMapping(value = "/develop")
    @ApiOperation(value = "行业分析  --> 发展总览页面", notes = "get develop overview page info", response = DevelopOverviewVO.class, httpMethod = "GET")
    public DevelopOverviewVO queryDevelopOverviewInfo() {
        DevelopOverviewVO vo = developService.queryDevelopOverviewInfo();
        return vo;
    }

    // ------------------ 现状总览 ---------------------------//
    @RoleCheck
    @GetMapping(value = "/current")
    @ApiOperation(value = "行业分析 --> 现状总览页面", notes = "get current overview page info", response = CurrentOverviewVO.class, httpMethod = "GET")
    public CurrentOverviewVO queryCurrentOverviewInfo() {
        CurrentOverviewVO vo = currentService.queryCurrentOverviewInfo();
        return vo;
    }

    // ------------------ 指标池 ---------------------------//
    @RoleCheck
    @GetMapping(value = "/index/classify/{year}")
    @ApiOperation(value = "行业分析  --> 指标池 --> 煤矿分类页面", notes = "get colliery classify info", response = CommonVO.class, httpMethod = "GET")
    public EnterpriseTypeVO queryCollieryClassifyInfo(
            @PathVariable("year") String year) {
        return indexService
                .queryCollieryClassifyInfo(Integer.valueOf(year));
    }

    @RoleCheck
    @GetMapping(value = "/index/numDevelop/{startYear}/{endYear}")
    @ApiOperation(value = "行业分析 --> 指标池 --> 煤矿数量变化页面", notes = "get colliery num change info ", response = IndustryCommonVO.class, httpMethod = "GET")
    public ColleryAndGroupNumChangeVO queryCollieryNumChangeInfo(
            @PathVariable("startYear") String startYear,
            @PathVariable("endYear") String endYear) {
        ColleryAndGroupNumChangeVO vo = indexService
                .queryCollieryNumChangeInfo(startYear, endYear);
        return vo;
    }

    @RoleCheck
    @GetMapping(value = "/index/scaleChange/{startYear}/{endYear}")
    @ApiOperation(value = "行业分析 --> 指标池 --> 煤矿规模变化页面", notes = "get colliery sacle change info ", response = ScaleChangeVO.class, httpMethod = "GET")
    public ColleryScaleChangeVO queryScaleChangeInfo(
            @PathVariable("startYear") String startYear,
            @PathVariable("endYear") String endYear) {
        ColleryScaleChangeVO vo = indexService.queryScaleChangeInfo(
                startYear, endYear);
        return vo;
    }

    @RoleCheck
    @GetMapping(value = "/index/productChange/{startYear}/{endYear}")
    @ApiOperation(value = "行业分析 --> 指标池 --> 煤矿产量变化页面", notes = "get colliery production change info", response = ProductionChangeVO.class, httpMethod = "GET")
    public ColleryPorductionChangeVO queryProductionChangeInfo(
            @PathVariable("startYear") String startYear,
            @PathVariable("endYear") String endYear) {
        ColleryPorductionChangeVO vo = indexService
                .queryProductionChangeInfo(startYear, endYear);
        return vo;
    }

    @RoleCheck
    @GetMapping(value = "/index/rateGrow/{startYear}/{endYear}")
    @ApiOperation(value = "行业分析 --> 指标池 --> 煤矿增长率和产量增长率页面", notes = "get colliery and production grow rate info", response = RateGrowVO.class, httpMethod = "GET")
    public ColleryNumAndProductionGrowRateVO queryRateGrowInfo(
            @PathVariable("startYear") String startYear,
            @PathVariable("endYear") String endYear) {
        ColleryNumAndProductionGrowRateVO vo = indexService.queryRateGrowInfo(
                startYear, endYear);
        return vo;
    }


    @RoleCheck
    @ApiOperation(value = "行业分析 --> 指标池 --> 煤矿产量前10煤企页面", notes = "get top ten colliery info", response = ColleryTopTenVO.class, httpMethod = "GET")
    @GetMapping(value = "/index/topTen/{year}")
    public ColleryTopTenVO queryColleryTopTenInfo(@PathVariable("year") Integer year) {
        ColleryTopTenVO vo = indexService.queryTopTenCollieryInfo(year);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "行业分析 --> 指标池 --> 矿点分布图页面", notes = "get colliery spread info", response = CollerySpreadVO.class, httpMethod = "GET")
    @GetMapping(value = "/index/spread/{year}")
    public CollerySpreadVO queryCollerySpreadInfo(@PathVariable("year") Integer year) {
        CollerySpreadVO vo = indexService.queryCollerySpreadInfo(year);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "行业分析 --> 指标池 --> 安全分类信息页面", notes = "get safety calssify info", response = SafetyClassifyVO.class, httpMethod = "GET")
    @GetMapping(value = "/index/safety/{year}")
    public SafetyClassifyVO querySafetyClassifyInfo(@PathVariable("year") Integer year) {
        SafetyClassifyVO vo = indexService.querySafetyClassifyInfo(year);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "行业分析 --> 指标池 --> 诉讼分类页面信息", notes = "get litigate page info", response = LitigateClassifyVO.class, httpMethod = "GET")
    @RequestMapping(value = "/index/litigate/{year}")
    public LitigateClassifyVO queryLitigateClassifyVOInfo(@PathVariable("year") Integer year) {
        LitigateClassifyVO vo = indexService.queryLitigateClassifyVOInfo(year);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "行业分析 --> 指标池 --> 煤矿开采率页面信息", notes = "get exploitation rate page info", response = ColleryExploitationRateVO.class, httpMethod = "GET")
    @RequestMapping(value = "/index/rate/{startYear}/{endYear}")
    public ColleryExploitationRateVO queryExploitationRateInfo(
            @PathVariable("startYear") Integer startYear,
            @PathVariable("endYear") Integer endYear) {
        ColleryExploitationRateVO vo = indexService.queryExploitationRateInfo(startYear, endYear);
        return vo;
    }

    @RoleCheck
    @ApiOperation(value = "行业分析 --> 指标池 --> 盈利情况页面信息", notes = "get profit page info", response = ColleryGainProfitVO.class, httpMethod = "GET")
    @RequestMapping(value = "/index/profit/{year}")
    public ColleryGainProfitVO queryGainProfitVOInfo(@PathVariable("year") Integer year) {
        ColleryGainProfitVO vo = indexService.queryGainProfitInfo(year);
        return vo;
    }



}
