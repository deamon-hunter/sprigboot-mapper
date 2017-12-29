package com.gmsj.mapper;

import com.gmsj.common.vo.industryAnaylse.ColleryProfitVO;
import org.apache.ibatis.annotations.Mapper;

import com.gmsj.model.FinancialStanding;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FinancialStandingMapper extends MyBaseMapper<FinancialStanding> {
    ColleryProfitVO queryProfitInfoByYear( @Param("currentYear") Integer currentYear);
}