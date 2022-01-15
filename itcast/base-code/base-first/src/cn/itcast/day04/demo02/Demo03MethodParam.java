package cn.itcast.day04.demo02;

/*
有参调用与无参调用
*/

public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(5,10);
        method2();
    }
    //有参调用，两个数字相乘
    public static void method1(int a,int b) {
        int result = a * b;
        System.out.println("结果是：" + result);
    }

    //无参调用，打印10次文本字符串
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!"+ i);
        }
    }
}
