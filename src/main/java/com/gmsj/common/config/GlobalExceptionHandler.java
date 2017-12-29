/**
 * 创建人： Ovrille
 * 包名字： com.gmsj.controller
 * 创建时间：2017/8/14
 * 描述：TODO
 * Copyright @ 2014-2017 bicitech.cn
 */
package com.gmsj.common.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import javax.servlet.http.HttpServletRequest;

/**
 * 创建人： Ovrille
 * 创建时间：2017/12/6
 *  *类名：GlobalExceptionHandler
 * 描述：全局异常处理
 * Copyright @ 2014-2017
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    //TODO 待完善异常处理机制
    @ExceptionHandler(value = Exception.class)
    public static String defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        //把错误信息打印到控制台
        e.printStackTrace();
        //System.out.println("把错误信息打印到控制台");
        return e.getMessage();
    }

}
