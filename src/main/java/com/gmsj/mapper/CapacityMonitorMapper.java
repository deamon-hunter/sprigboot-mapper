package com.gmsj.mapper;

import com.gmsj.common.vo.CommonVO;
import com.gmsj.model.CapacityMonitor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CapacityMonitorMapper extends MyBaseMapper<CapacityMonitor> {
    List<CommonVO> listCapacityDetectionInfoByCoalId(@Param("coalId") Integer coalId,@Param("year") Integer year);
}