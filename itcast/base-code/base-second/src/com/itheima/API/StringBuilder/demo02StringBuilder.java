package com.itheima.API.StringBuilder;
/*
StringBuilder常用的方法有2个：
public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
public String toString()：将当前StringBuilder对象转换为String对象。
 */
public class demo02StringBuilder {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this，调用方法的对象
        StringBuilder bu2 = bu.append("abc");       //把bu的地址值赋值给了bu2
        System.out.println(bu);     //abc
        System.out.println(bu2);    //abc
        System.out.println(bu==bu2);        //比较的是地址值 true

        //使用append方法无需接收返回值
        bu.append("abc");
        bu.append(1);
        bu.append(true);
        bu.append(8.8);
        bu.append('中');
        System.out.println(bu);         //abcabc1true8.8中

        /*
        链式编程：方法返回值是一个对象，可以继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase());
        bu.append("abc").append(1).append(true).append(8.8).append('中');
        System.out.println(bu);
    }
}
