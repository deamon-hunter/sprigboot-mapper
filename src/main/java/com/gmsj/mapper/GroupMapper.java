package com.gmsj.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.gmsj.model.Group;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GroupMapper extends MyBaseMapper<Group> {
    Integer listGroupNumChangeByRangeYear(
            @Param("year") Integer year);
}