package cn.itcast.day06.demo02;
/*
当使用一个对象类型作为方法的返回值时：返回值其实就是对象的地址值。
 */
public class Demo05PhoneReturn {
    public static void main(String[] args) {

    }

    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "玫瑰金";
        return one;
    }
}
