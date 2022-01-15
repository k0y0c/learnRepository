package cn.itcast.day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        //根据phone类，创建一个名为one的对象
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("==============");

        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        one.call("乔布斯");
        one.sendMessage();

    }
}
