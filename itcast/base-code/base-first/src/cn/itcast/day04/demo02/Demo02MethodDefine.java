package cn.itcast.day04.demo02;
/*
方法其实就是若干语句的功能集合。

方法定义的完整格式：
修饰符 返回值类型 方法名称(参数类型 参数名称，...){
    方法体；
    return 返回值；
}
方法名称：规则和变量一样，小驼峰
参数如果有多个，使用逗号进行分隔
return：两个作用，第一停止当前方法，第二将后面的结果数据返回值还给调用出
return后面的“返回值”，必须和方法名称前面的“返回值类型”，保持对应。

三要素：返回值类型 方法名称 参数列表

方法的三种调用格式：
1.单独调用： 方法名称（参数）；
2.打印调用：System.out.println(方法名称(参数));
3.赋值调用： 数据类型 变量名称 = 方法名称(参数)；

无返回值的方法，只能单独调用，不能进行打印调用或赋值调用
*/
public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        sum(10,20);
        //打印调用
        System.out.println(sum(10,20));
        //赋值调用
        int number =sum(15,25);
        System.out.println("变量的值："+ number);
    }
    public static int sum(int a,int b){
        System.out.println("方法执行了");
        int result = a+b;
        return result;
    }
}
