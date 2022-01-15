package com.itheima.Junit.demo;


public class Person1 extends Creature<String>implements Comparable<String>,MyInterface{
    private String name;
    private int age;
    private int id;

    Person1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person1(String name) {
        this.name = name;
    }

    Person1(String name, int age) {
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
