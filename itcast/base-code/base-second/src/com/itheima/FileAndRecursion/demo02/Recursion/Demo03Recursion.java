package com.itheima.FileAndRecursion.demo02.Recursion;
/*
    练习：
        使用递归计算阶乘
 */
public class Demo03Recursion {
    public static void main(String[] args) {
        int jiecheng = jc(5);
        System.out.println(jiecheng);
    }
    /*
        定义一个方法使用递归计算阶乘
        n*(n-1)*(n-2)*....*1
        使用递归必须明确：
            1.递归的结束条件
                获取到1的时候结束
            2.递归的目的
                获取下一个被乘的数字(n-1)
     */
    public static int jc(int n) {
        //获取到1的时候结束
        if (n==1){
            return 1;
        }
        //2.递归的目地  获取下一个被加的数字(n-1)
        return n * jc(n-1);
    }
}
