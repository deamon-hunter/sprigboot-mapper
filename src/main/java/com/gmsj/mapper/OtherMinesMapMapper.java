package com.gmsj.mapper;

import com.gmsj.common.vo.colleryAnalyse.MapItemVO;
import org.apache.ibatis.annotations.Mapper;

import com.gmsj.model.OtherMinesMap;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OtherMinesMapMapper extends MyBaseMapper<OtherMinesMap> {
    List<MapItemVO> listNonCoalMap(
            @Param("preLongitude") Float preLongitude,
            @Param("nexLongitude") Float nexLongitude,
            @Param("preLatitude") Float preLatitude,
            @Param("nexLatitude") Float nexLatitude);
}