/**
 * Copyright (c) 2017 
 *.gmsj.
 */
package com.gmsj.service;


import com.gmsj.common.vo.LoginTokenDataVO;
import org.springframework.stereotype.Service;


/**
 * 
 * @author hehaiyang 2017-07-12 11:02:48 
 * @version 1.0
 */
public interface VisualUserService {


    LoginTokenDataVO authenticate(String userName,String password);

    void modifyPwd(String userName, String password, String newPassword);
}