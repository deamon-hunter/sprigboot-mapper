package com.gmsj.mapper;

import java.util.List;

import com.gmsj.common.vo.colleryAnalyse.MapItemVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gmsj.common.vo.industryAnaylse.CoalSpreadMapVO;
import com.gmsj.model.CollieryInformation;

@Mapper
public interface CollieryInformationMapper extends
		MyBaseMapper<CollieryInformation> {

	List<CollieryInformation> listALLCoalByYear(
			@Param("currentYear") Integer currentYear);

	List<CoalSpreadMapVO> listAllLatitudeAndlongitudeByYear(
			@Param("currentYear") Integer currentYear);

    List<MapItemVO> listGroupMapByGroupIdAndYear(
			@Param("groupId") Integer groupId,
			@Param("year") Integer year);

    MapItemVO getMapByCoalIdAndYear(
    		@Param("coalId") Integer coalId);

}