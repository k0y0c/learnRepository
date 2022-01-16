package com.itheima.Junit.test;

import com.itheima.Junit.demo.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class test {
    @Test
    public void test1() throws Exception {
        Class clazz = Class.forName("com.itheima.Junit.demo.Person");

        Person person = (Person) clazz.newInstance();
        System.out.println(person);
        //设置指定的属性,set():参数1：指明设置哪个参数的属性  参数2：指明参数属性值设置为多少
        Field id = clazz.getField("id");
        id.set(person,1001);
        //获取当前属性的参数值
        int pid = (int) id.get(person);
        System.out.println(pid);
    }
}
