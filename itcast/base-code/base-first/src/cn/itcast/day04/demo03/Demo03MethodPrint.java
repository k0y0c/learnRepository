package cn.itcast.day04.demo03;

import cn.itcast.day04.demo01.HelloWorld;

/*
题目要求：用来打印指定次数的HelloWorld。
三要素：
返回值：void
方法名称：printCount
参数列表：int a
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWorld");
        }
    }
}
