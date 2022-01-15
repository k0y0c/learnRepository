package cn.itcast.day05.demo01;
/*
数组的概念：是一种容器，可以同时存放多个数据值。

数组的特点：
1.数组是一种引用数据类型
2.数组当中的多个数据，类型必须统一
3.数组的长度在程序运行期间不可改变

数组的初始化：在内存当中创建一个数组，并且向其中赋予一些默认值。

两种常见的初始化方式：
1.动态初始化（指定长度）  格式： 数据类型[] 数组名称 = new 数据类型[数据长度]；
2.静态初始化（指定内容）  格式： 数据类型[] 数组名称 = new 数据类型[] {元素1，元素2，...}；
 */

public class Demo01Array {
    public static void main(String[] args) {
        //创建一个数组，里面可以存放300个int数据
        int[] arrayA = new int[300];

        //创建一个数组，里面可以存放20个double数据
        double[] arrayB = new double[20];

        //创建一个数组，里面可以存放5个字符串
        String[] arrayC = new String[5];
    }
}
