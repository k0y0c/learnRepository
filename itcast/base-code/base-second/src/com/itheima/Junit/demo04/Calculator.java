package com.itheima.Junit.demo04;

/**
 * 小明定义的计算机类
 */
public class Calculator {
    //加法
    @Check
    public void add(){
        System.out.println("1 + 0 = " + (1+0));
    }
    //减法
    @Check
    public void sub(){
        System.out.println("1 - 0 = " + (1-0));
    }
    //乘法
    @Check
    public void mul(){
        System.out.println("1 * 0 = " + (1*0));
    }
    //除法
    @Check
    public void div(){
        System.out.println("1 / 0 = " + (1/0));
    }
    public void show(){
        System.out.println("永无bug。。。");
    }
}
