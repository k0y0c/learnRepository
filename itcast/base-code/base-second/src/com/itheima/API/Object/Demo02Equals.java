package com.itheima.API.Object;

import java.util.ArrayList;

public class Demo02Equals extends Object {
    public static void main(String[] args) {
        /*
        Person类默认继承了Object类，所以可以使用Object类中的equals方法
        public boolean equals(Object obj)：指示其他某个对象是否与此对象“相等”
        equals方法源码：
            public boolean equals(Object obj) {
            return (this == obj);}
            参数分析：
                Object obj:可以传递任意的对象
                "=="比较运算符，返回的是一个布尔值
                基本数据类型：比较的是值
                引用数据类型：比较的是两个对象的地址值
                this是谁？ 那个对象调用的方法，方法中的this就是那个对象
         */
        Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("古力娜扎",19);
        Person p3 = new Person("迪丽热巴",18);
        System.out.println("p1:" + p1);     //p1:Person@27f674d
        System.out.println("p2:" + p2);     //p2:Person@1d251891

        boolean b1 = p1.equals(p2);
        boolean b2 = p1.equals(p3);
        System.out.println(b1);
        System.out.println(b2);

        ArrayList<Integer> list = new ArrayList<>();
        boolean b3 = p1.equals(list);           //ClassCastException:类型转换异常
        System.out.println(b3);
    }
}
