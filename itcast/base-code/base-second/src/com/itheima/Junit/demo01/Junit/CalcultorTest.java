package com.itheima.Junit.demo01.Junit;

public class CalcultorTest {
    public static void main(String[] args) {
        //创建对象
        Calcultor c = new Calcultor();
        //调用方法
        /*int result = c.add(1, 2);
        System.out.println(result);*/

        int result = c.sub(1, 2);
        System.out.println(result);
    }
}
