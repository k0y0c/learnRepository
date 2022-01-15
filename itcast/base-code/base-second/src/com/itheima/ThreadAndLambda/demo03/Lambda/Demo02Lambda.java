package com.itheima.ThreadAndLambda.demo03.Lambda;
/*
    Lambda表达式的标准格式，有三部分组成：
        a.一些参数
        b.一个箭头
        c.一段代码
    Lambda表达式的标准格式为：
        (参数类型 参数名称) ‐> { 一些重写方法的代码 }
    格式说明：
        ()：接口中抽象方法的参数列表，没有参数，则留空；有参数就写出参数，多个参数则用逗号分隔。
        -> 传递的意思，把参数传递给方法体{}。
        {}：重写接口的抽象方法的方法体。
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式，实现多线程
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新的线程创建了");
            }
        }).start();

        //使用Lambda表达式，实现多线程
        new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "新的线程创建了");
            }
        ).start();

        //优化省略Lambda
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "新的线程创建了")).start();
    }
}
