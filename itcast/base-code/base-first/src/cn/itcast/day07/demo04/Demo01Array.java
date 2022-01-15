package cn.itcast.day07.demo04;
/*
题目：定义一个数组，用来存储3个Person对象。
数组有一个缺点，一旦创建，程序运行期间长度不可以改变
 */
public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面用来存放Person类型的名称
        Person[] array = new Person[3];
        System.out.println(array[0]);   //null

        //创建三个Person对象
        Person one = new Person("古力娜扎",18);
        Person two = new Person("迪丽热巴",28);
        Person three = new Person("玛尔扎哈",38);
        System.out.println(one);        //对象地址值
        System.out.println(two);
        System.out.println(three);
        System.out.println("=============================");

        //将对象地址值赋值给数组
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);   //地址值
        System.out.println(array[1]);   //地址值
        System.out.println(array[2]);   //地址值

        System.out.println(array[1].getName());     //迪丽热巴

    }
}
