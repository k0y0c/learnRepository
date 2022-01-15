package cn.itcast.day06.demo01;
/*
定义一个类，用来模拟“学生”事物。其中就有两个部分；
属性（是什么）：
        姓名
        年龄
行为（能做什么）
        吃饭
        睡觉
        学习

对应到java的类中：
成员变量（属性）：
    String name；
    int age；
成员方法（行为）：
    public void eat(){}
    public void sleep(){}
    public void study(){}

注意事项：
1.成员变量是直接定义在类中，在方法外边。
2.成员方法不要写static关键字。
 */
public class Student {
    //成员变量
    String name;
    int age;
    //成员方法
    public void eat(){
        System.out.println("吃饭饭！");
    }
    public void sleep(){
        System.out.println("睡觉觉！");
    }public void study(){
        System.out.println("学习！");
    }

}
