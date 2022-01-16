package com.itheima.API.Integer;


import java.util.ArrayList;

/*
自动装箱与自动拆箱
 */
public class Demo02Integer {
    public static void main(String[] args) {
        /*
        自动装箱：直接把int类型的整数赋值包装类
        Integer in = 1; 就相当于 Integer in = new Integer(1);
         */
        Integer in = 1;
        /*
        自动拆箱：in是包装类，无法直接参与运算，可以自动转换为基本数据类型，在进行计算
        in+2; 就相当于 in.intvalue() +2 = 3
        in = in.intvalue() + 2 = 3  有是一个自动装箱
         */
        in = in+2;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);        //自动装箱 list.add(new Integer(1));
        int a = list.get(0);        //自动拆箱 list.get(0).intvalue();
    }
}
