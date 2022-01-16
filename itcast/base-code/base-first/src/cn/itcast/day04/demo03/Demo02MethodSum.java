package cn.itcast.day04.demo03;
/*
题目要求：定义一个女方法，用来求出1-100之间所有数字的和值。
三要素：
返回值：int
方法名称：getSum
参数列表：无
 */
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是"+ getSum());
    }
    public static int getSum(){
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            sum =sum+i;
        }
        return sum;
    }
}
