package cn.itcast.day08.demo03;

public class Person {
    static{
        System.out.println("静态代码执行！");
    }

    public Person(){
        System.out.println("构造方法执行！");
    }
}
