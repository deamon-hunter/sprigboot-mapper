package com.gmsj.service.colleryAnalyse;

import com.gmsj.common.vo.colleryAnalyse.CoalVO;
import com.gmsj.common.vo.colleryAnalyse.ColleryEnterpriseVO;

public interface ColleryAnalyseService {


    /**
     * @description 返回 煤矿分析 --> 查询煤企画像 信息
     * @return
     */
    ColleryEnterpriseVO queryColleryEnterpriseInfo(Integer groupId);


    /**
     * @description 返回 煤矿分析 --> 查询煤矿画像 信息
     * @return
     */
    CoalVO queryColleryInfo(Integer coalId) throws IllegalAccessException;
}
