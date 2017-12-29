package com.gmsj.mapper;

import com.gmsj.common.vo.CommonVO;
import com.gmsj.model.ProductionScore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductionScoreMapper extends MyBaseMapper<ProductionScore> {
    List<CommonVO> listProductionScoreByCoalId(@Param("coalId") Integer coalId,
                                               @Param("year") Integer year);
}