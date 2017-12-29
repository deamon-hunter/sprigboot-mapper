package com.gmsj.mapper;

import com.gmsj.common.vo.CommonVO;
import com.gmsj.common.vo.industryAnaylse.CommonInfoVO;
import com.gmsj.common.vo.industryAnaylse.ScaleChangeVO;
import com.gmsj.common.vo.industryAnaylse.TopTenCollieryVO;
import com.gmsj.model.ColleryProduction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ColleryProductionMapper extends
        MyBaseMapper<ColleryProduction> {

    List<CommonInfoVO> listProductionChange(
            @Param("startYear") String startYear,
            @Param("endYear") String endYear);

    Float getAllProductionByYear(
            @Param("currentYear") Integer currentYear);

    List<TopTenCollieryVO> listTopTenCollery(
            @Param("currentYear") Integer currentYear,
            @Param("rowNum") Integer rowNum);

    List<CommonVO> listTotalStockByYear(
            @Param("preYear") Integer preYear,
            @Param("currentYear") Integer currentYear);

    CommonVO getGroupProductionByYearAndMonth(
            @Param("year") Integer year,
            @Param("month") Integer month,
            @Param("groupId") Integer groupId);

    List<CommonVO> listTotalCapacityInfoByGroupId(
            @Param("groupId") Integer groupId,
            @Param("year") Integer year);

    Long getTotalCapacityByGroupId(
            @Param("groupId") Integer groupId,
            @Param("curYear") Integer curYear);

    CommonVO getColleryProductionRangeInfoByCoalId(
            @Param("year") Integer year,
            @Param("month") Integer month,
            @Param("coalId") Integer coalId);

    Float getHigherNumByYear(
            @Param("year") Integer year,
            @Param("standardProduction") Long standardProduction);

    Float getLowerNumByYear(
            @Param("year") Integer year,
            @Param("standardProduction") Long standardProduction);
}