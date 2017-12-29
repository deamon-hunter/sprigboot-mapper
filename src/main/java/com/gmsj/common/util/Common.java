package com.gmsj.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common{

	 private static long orderNum = 0l;  
	 private static String date ;  
	 /** 
     * 生成订单编号 
     * @return 
     */  
    public static synchronized String getOrderNo() {  
        String str = new SimpleDateFormat("yyMMddHHmm").format(new Date());  
        if(date==null||!date.equals(str)){  
            date = str;  
            orderNum  = 0l;  
        }  
        orderNum ++;  
        long orderNo = Long.parseLong((date)) * 10000;  
        orderNo += orderNum;;  
        return orderNo+"";  
    }  
    
    public static void main(String[] args) {
		System.out.println(getOrderNo());
	}
    public static String dateToStr(Date date) {
    	  
    	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	   String str = format.format(date);
    	   return str;
    	}

    	/**
    	* 字符串转换成日期
    	* @param str
    	* @return date
    	*/
    	public static Date strToDate(String str) {
    	  
    	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	   Date date = null;
    	   try {
    	    date = format.parse(str);
    	   } catch (Exception e) {
    	    e.printStackTrace();
    	   }
    	   return date;
    	}
    
}
