package com.gmsj.mapper;

import com.gmsj.common.vo.CommonVO;
import org.apache.ibatis.annotations.Mapper;

import com.gmsj.model.LegalProceedings;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LegalProceedingsMapper extends MyBaseMapper<LegalProceedings> {

    List<CommonVO> listLegalProceedingsByYear(@Param("currentYear") Integer currentYear);

    Integer getTotalLitigationNumByYear(@Param("curYear") Integer curYear, @Param("groupId") Integer groupId);

    Integer getColleryLitigationNumByYearAndCoalId(@Param("year") Integer year, @Param("coalId") Integer coalId);
}