package com.gmsj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gmsj.common.vo.CommonVO;
import com.gmsj.model.SecurityCheck;

@Mapper
public interface SecurityCheckMapper extends MyBaseMapper<SecurityCheck> {

	List<CommonVO> listSecurityClassifyByYear(
			@Param("currentYear") Integer currentYear);

    List<CommonVO> listSecurityClassifyByGroupId(
    		@Param("groupId") Integer groupId,
			@Param("year") Integer year);
}