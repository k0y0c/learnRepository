package cn.itcast.day08.demo03;
/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在类，多个对象共享
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖",19);
        one.room = "101教室";             //不推荐这样使用
        System.out.println("姓名：" + one.getName()
                +",年龄：" + one.getAge() + ",教室是：" + one.room + ",学号：" + one.getId());
        Student two = new Student("黄蓉",16);
        System.out.println("姓名：" + two.getName()
                +"年龄：" + two.getAge() + ",教室是：" + two.room + ",学号：" + two.getId());

    }
}
