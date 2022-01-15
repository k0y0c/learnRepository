package cn.itcast.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

//普通成员
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包当中随便抽取一个，给我自己。
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引编号，从集合当中删除，并且得到被删除的红包，给我自己。
        int remove = list.remove(index);
        //当前成员本来的余额
        int leftMoney = super.getMoney();
        //加法，重新设置余额
        super.setMoney(leftMoney + remove);
    }
}
