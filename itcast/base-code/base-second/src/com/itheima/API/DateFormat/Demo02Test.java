package com.itheima.API.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
练习：请使用日期时间相关的API，计算一个人出生了多少天。
分析：
    1.使用Scanner类中的方法next，获取出生日期
    2.使用DateFormat类中的方法parse，把字符串解析为Date格式
    3.把Date格式的出生日期转换为毫秒值
    4.获取当前的日期，转换为毫秒值
    5.使用当前日期的毫秒值-出生日期的毫秒值
    6.把毫秒值的差值转换为天（s/1000/60/60/24）
 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        //1.使用Scanner类中的方法next，获取出生日期
        System.out.println("请输入你的出生日期，格式：yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String birthdayDateString = sc.next();
        //2.使用DateFormat类中的方法parse，把字符串解析为Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
        //3.把Date格式的出生日期转换为毫秒值
        long birthdayDateTime = birthdayDate.getTime();
        //4.获取当前的日期，转换为毫秒值
        Date date =new Date();
        long todayTime = date.getTime();
        //5.使用当前日期的毫秒值-出生日期的毫秒值
        long time = todayTime - birthdayDateTime;
        //6.把毫秒值的差值转换为天（s/1000/60/60/24）
        System.out.println(time/1000/60/60/24);
    }
}
