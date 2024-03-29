package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
题目：定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}括起集合，使用@分隔每个元素
格式参考： {元素@元素@元素}
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("张翠山");
        System.out.println(list);       //[张三丰, 宋远桥, 张无忌, 张翠山]

        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list){
        //{元素@元素@元素}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i == list.size()-1){
                System.out.print(name + "}");
            }else{
                System.out.print(name + "@");
            }
        }
    }
}
