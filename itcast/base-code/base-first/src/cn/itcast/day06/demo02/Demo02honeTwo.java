package cn.itcast.day06.demo02;

public class Demo02honeTwo {
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

        //根据phone类，创建一个名为two的对象
        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("==============");

        two.brand = "三星";
        two.price = 5999.0;
        two.color = "蓝色";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        two.call("欧巴");
        two.sendMessage();

    }
}
