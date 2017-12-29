package com.gmsj.mapper;

import com.gmsj.common.vo.CommonVO;
import com.gmsj.common.vo.industryAnaylse.CommonInfoVO;
import com.gmsj.model.Certificates;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CertificatesMapper extends MyBaseMapper<Certificates> {

    List<CommonVO> listCollieryType(Integer year);

    Integer listColleryNumChange(@Param("year") Integer year);

    List<CommonInfoVO> listCoalNumChange(
            @Param("startYear") String startYear,
            @Param("endYear") String endYear);

    Integer getAllCoalCountByYear(
            @Param("currentYear") Integer currentYear);

    Float getTotalStock();

}