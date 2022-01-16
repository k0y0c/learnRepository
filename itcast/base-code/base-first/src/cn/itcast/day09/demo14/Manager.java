package cn.itcast.day09.demo14;

import java.util.ArrayList;

//群主类
public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList redlist = new ArrayList();

        //判断余额是否充足
        int leftmoney = super.getMoney();       //群主当前余额
        if(leftmoney < totalMoney){
            System.out.println("余额不足！");
            return redlist;                     //返回空集合
        }
        //扣钱，重新设置余额
        super.setMoney(leftmoney - totalMoney);

        //发红包需要平均拆分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;       //余数，除不开的零头，包在最后一个红包中
        for (int i = 0; i < count; i++) {
            if(i == count-1){
                redlist.add(avg + mod);
            }else{
                redlist.add(avg);
            }
        }
        return redlist;
    }
}
