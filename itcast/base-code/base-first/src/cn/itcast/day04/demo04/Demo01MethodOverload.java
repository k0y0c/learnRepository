package cn.itcast.day04.demo04;
/*
方法的重载(Overload):多个方法的名称一样，但参数列表不一样。

方法重载与下列因素相关：
1.参数个数不同
2.参数类型不同
3.参数的多类型顺序不同
方法重载与下列因素无关：
1.与参数的名称无关
2.与方法的返回值类型无关
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }
    public static int sum(int a,int b){
        System.out.println("有两个参数的方法执行了");
        return a+b;
    }
    public static int sum(int a,int b,int c){
        System.out.println("有三个参数的方法执行了");
        return a + b + c;
    }
    public static int sum(int a,int b,int c,int d){
        System.out.println("有四个参数的方法执行了");
        return a + b + c +d;
    }

    //方法参数类型不同
    public static int sum(int a,double b){
        return (int)(a+b);
    }
    //方法的多类型顺序不同
    public static int sum(double a,int b){
        return (int)(a+b);
    }

    //错误写法，与参数的名称无关
    /*public static int sum(int x, int y) {
        return x + y;
    }*/

    //错误写法！与返回值类型无关
    /*public static double sum(int a,int b){
        return a + b +0.0;
    }*/
}
