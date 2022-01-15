package cn.itcast.day09.demo14;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);

        manager.show();     //100
        one.show();         //0
        two.show();         //0
        three.show();       //0
        System.out.println("==================================");

        //群主总共发20元，分成3个红包
        ArrayList list = manager.send(20,3);
        System.out.println(list);
        //三个成员收红包
        one.receive(list);
        two.receive(list);
        three.receive(list);

        manager.show();     //80
        //6、6、8随机分给三个人
        one.show();
        two.show();
        three.show();
    }
}
