package com.gmsj.mapper;

import com.gmsj.common.vo.forecastAnaylse.DynamicDetailVO;
import com.gmsj.model.IndustryDynamic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IndustryDynamicMapper extends MyBaseMapper<IndustryDynamic> {
    List<DynamicDetailVO> listDynamicInfo(@Param("rowNum") Integer rowNum);
}