package com.itheima.Junit.demo;

@MyAnnotation
public class Person extends Creature<String>implements Comparable<String>,MyInterface{
    private String name;
    int age;
    public int id;

    @MyAnnotation(value = "hi")
     public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private String show(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }
    @MyAnnotation
    public String display(String interest){
        return interest;
    }

    @Override
    public void info() {
        System.out.println("我是一个人");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
