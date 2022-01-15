package cn.itcast.day04.demo02;
/*
题目要求：定义一个方法，用来【求出】两个数之和。（方法帮忙算，算完之后把结果告诉我。）
题目变形：定义一个方法，用来【打印】两个数之和。（方法帮忙算，算完之后自己负责显示结果，不用告诉我）
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(10,20);
        System.out.println("返回值是："+ num);
        printSum(15,25);
    }
    public static int getSum(int a,int b){
        int result = a + b;
        return result;
    }
    public static void printSum(int a,int b){
        int result = a + b;
        System.out.println("结果是："+ result);
    }
}
