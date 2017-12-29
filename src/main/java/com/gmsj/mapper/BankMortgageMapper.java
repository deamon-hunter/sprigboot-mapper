package com.gmsj.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.gmsj.model.BankMortgage;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BankMortgageMapper extends MyBaseMapper<BankMortgage> {
    Integer getTotalMortgageNum(
            @Param("groupId") Integer groupId,
            @Param("curYear") Integer curYear);

    Integer getMortgageNumByYearAndCoalId(
            @Param("year") Integer year,
            @Param("coalId") Integer coalId);
}