/**
 * 创建人： Ovrille
 * 包名字： com.gmsj.config
 * 创建时间：2017/7/13
 * 描述：TODO
 * Copyright @ 2014-2017 bicitech.cn
 */
package com.gmsj.common.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 创建人： Ovrille
 * 包名字： com.gmsj.config
 * 创建时间：2017/12/6
 * 描述：mybatis分页专用配置
 * Copyright @ 2014-2017
 */
@Configuration
public class PageHelperConfig {

    @Bean
    public PageHelper pageHelper() {
        System.out.println("MyBatisConfiguration.pageHelper()");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }

}
