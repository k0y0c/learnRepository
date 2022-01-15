package com.itheima.API.Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
java.lang.Object类
 */
public class Demo01ToString {
    public static void main(String[] args) {
        /*
        Person类默认继承了Object类，所以可以使用Object类中的toString方法
        public String toString()：返回该对象的字符串表示。
         */
        Person p = new Person("张三",18);
        String s = p.toString();
        System.out.println(s);      //Person@71e7a66b

        //直接打印对象的名字，其实就是调用对象的toString方法 p.toString()
        System.out.println(p);      //Person@71e7a66b

        /*
        看一个类是否重写了toString方法，直接打印这个类对应对象的名字即可
            如果没有重写toString方法，那么打印的就是对象的地址值(默认)
            如果重写了toString方法，那么就按照重写的方法打印
         */
        Random random = new Random();
        System.out.println(random);         //未重写toString方法

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);             //重写了toString方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);           //[1, 2] 重写了toString方法



    }
}
