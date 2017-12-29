package com.gmsj.mapper;

import com.gmsj.model.SafetyAccident;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SafetyAccidentMapper extends MyBaseMapper<SafetyAccident> {
    Integer getTotalAccidentNumByYear(
            @Param("curYear") Integer curYear,
            @Param("groupId") Integer groupId);

    Integer getColleryAccidentNumByYearAndCoalId(
            @Param("year") Integer year,
            @Param("coalId") Integer coalId);
}