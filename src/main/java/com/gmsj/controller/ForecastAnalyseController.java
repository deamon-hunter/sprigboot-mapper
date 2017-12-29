package com.gmsj.controller;

import com.gmsj.common.config.security.annotation.RoleCheck;
import com.gmsj.common.vo.forecastAnaylse.ForecastAnalyseVO;
import com.gmsj.service.forecastAnalyse.ForecastAnalyseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/forecast")
@Api(value = "预测分析模块", description = "预测分析模块返回信息")
public class ForecastAnalyseController {


    @Autowired
    private ForecastAnalyseService forecastService;

    @RoleCheck
    @ApiOperation(value = "返回预测分析信息", notes = "get forecast analyse page info ", response = ForecastAnalyseVO.class, httpMethod = "GET")
    @GetMapping(value = "/{year}")
    public ForecastAnalyseVO queryForecastAnalyseInfo(@PathVariable("year") Integer year) {
        ForecastAnalyseVO vo = forecastService.queryForecastAnalyseInfo(year);
        return vo;
    }


}
