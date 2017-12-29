package com.gmsj.mapper;

import com.gmsj.common.vo.colleryAnalyse.MapItemVO;
import org.apache.ibatis.annotations.Mapper;

import com.gmsj.model.DownstreamEnterprisesMap;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DownstreamEnterprisesMapMapper extends MyBaseMapper<DownstreamEnterprisesMap> {
    List<MapItemVO> listDownstreamMap(
            @Param("preLongitude") Float preLongitude,
            @Param("nexLongitude") Float nexLongitude,
            @Param("preLatitude") Float preLatitude,
            @Param("nexLatitude") Float nexLatitude);
}