package com.gmsj.mapper;

import com.gmsj.common.vo.forecastAnaylse.ItemDetailVO;
import com.gmsj.model.InfluenceFactor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InfluenceFactorMapper extends MyBaseMapper<InfluenceFactor> {
    List<ItemDetailVO> listInfo(@Param("factorType") Integer factorType);
}