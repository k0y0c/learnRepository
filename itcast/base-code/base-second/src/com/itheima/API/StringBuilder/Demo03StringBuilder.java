package com.itheima.API.StringBuilder;
/*
StringBuilder和String可以相互转换：
    String-->StringBuilder：可以使用StringBuilder的构造方法
        public StringBuilder(String str)：构造一个StringBuilder容器，并将字符串添加进去。
    StringBuilder-->String：可以使用StringBuilder中的toString方法
        public String toString()：将当前StringBuilder对象转换为String对象。
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        //String-->StringBuilder
        String str = "hello";
        System.out.println("str:" + str);
        StringBuilder bu = new StringBuilder(str);
        //往StringBuilder中添加数据
        bu.append("world");
        System.out.println("bu:" + bu);

        //StringBuilder-->String
        String s = bu.toString();
        System.out.println("s:" + s);
    }
}
