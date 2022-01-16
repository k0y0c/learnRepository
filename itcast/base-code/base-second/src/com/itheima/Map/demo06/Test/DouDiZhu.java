package com.itheima.Map.demo06.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
    斗地主综合案例：有序版本
    1.准备牌
    2.洗牌
    3.发牌
    4.排序
    5.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义两个集合，存储花色和牌的序号
        List<String> colors = List.of("♥","♠","♦","♣");
        List<String> numbers = List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
        //创建一个Map集合，存储牌的索引和组装好的牌
        HashMap<Integer,String> poker = new HashMap<>();
        //创建一个list集合，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //把大王和小王存储到集合中
        poker.put(0,"大王");
        poker.put(1,"小王");
        //循环嵌套遍历两个集合，组装52张牌，存储到集合中
        int i = 2;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(i,color+number);
                ++i;
            }
        }
        //存储牌的索引
        for (int i1 = 0; i1<54 ;i1++){
            pokerIndex.add(i1);
        }
        //System.out.println(poker);
        //System.out.println(pokerIndex);

        // 2.洗牌
        Collections.shuffle(pokerIndex);
        //System.out.println(pokerIndex);

        //发牌
        //定义四个集合，存储玩家牌的索引，和底牌的索引
        ArrayList<Integer> play01 = new ArrayList<>();
        ArrayList<Integer> play02 = new ArrayList<>();
        ArrayList<Integer> play03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        //遍历存储牌索引的List集合，获取每一个牌的索引
        for (Integer index : pokerIndex) {
            if (index >= 51){
                dipai.add(index);
            }else if (index%3==0){
                play01.add(pokerIndex.get(index));
            } else if (index%3==1){
                play02.add(pokerIndex.get(index));
            } else if (index%3==2){
                play03.add(pokerIndex.get(index));
            }
        }
        //System.out.println(play01);
        //System.out.println(play02);
        //System.out.println(play03);
        //System.out.println(dipai);

        //4.排序
        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(play03);
        Collections.sort(dipai);
        //System.out.println(play01);
        //System.out.println(play02);
        //System.out.println(play03);
        //System.out.println(dipai);

        //5.看牌 调用看牌的方法
        lookPoker("玩家1",poker,play01);
        lookPoker("玩家2",poker,play02);
        lookPoker("玩家3",poker,play03);
        lookPoker("底牌",poker,dipai);
    }
    /*
    定义一个看牌的方法，提高代码的复用性
    参数：
        String name：玩家名称
        HashMap<Integer，String> poker：存储牌的poker集合
        ArrayList<Integer> list:存储玩家和底牌的list集合
    查表法：
        遍历玩家或者底牌集合，获取牌的索引
        使用牌的索引，去Map集合中找到对应的牌
    */
    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        //输出玩家名称，不换行
        System.out.print(name + ":");
        for (Integer key : list) {
            System.out.println(key);
            String value = poker.get(key);
            System.out.print(value + "  ");
        }
        System.out.println();   //打印完一个玩家换行
    }
}
