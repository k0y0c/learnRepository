package com.itheima.API.Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /*
        Date类的空参数构造方法
        Date()获取当前系统的日期和时间
     */
    private static void demo01(){
        Date date = new Date();
        System.out.println(date);   //Sun Apr 04 14:41:14 CST 2021
    }

    /*
       Date类的带参数构造方法
       Date(long date):传递毫秒值，把毫秒值转换为Date日期
    */
    private static void demo02(){
        Date date = new Date(0L);
        System.out.println(date);   //Thu Jan 01 08:00:00 CST 1970
    }

    /*
      long getTime() 把日期转换为毫秒值（相当于System.currentTimeMillis()）
   */
    private static void demo03(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

}
