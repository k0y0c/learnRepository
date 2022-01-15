package com.itheima.API.Integer;
/*
基本类型与字符串之间的转换
基本类型转换为String
    1.基本类型的值+""    最简单的方法（工作中常用）
    2.包装类的静态方法toString(参数)，不是Object类的toString
        static String toString(int i )  返回一个表示整数的String对象。
    3.String类的静态方法valueOf(参数)
        static String valueOf(int i)  返回int参数的字符串表示形式。
String转换成对应的基本类型
    除了Character类之外，其他所有包装类都具有parseXxx静态方法可以将字符串参数转换为对应的基本类型：
        public static int parseInt(String s)：将字符串参数转换为对应的int基本类型。
        public static double parseDouble(String s)：将字符串参数转换为对应的double基本类型。
 */
public class Demo03Integer {
    public static void main(String[] args) {
        //基本类型转换为String
        int i1 = 100;
        String s1 =i1 + "";
        System.out.println(s1 + 200);   //100200

        String s2 = Integer.toString(100);
        System.out.println(s2 + 200);       //100200

        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);       //100200

        //String转换成对应的基本类型
        int i = Integer.parseInt(s1);
        System.out.println(i-10);

        //int a = Integer.parseInt("a");
        //System.out.println(a);      //NumberFormatException
    }
}
