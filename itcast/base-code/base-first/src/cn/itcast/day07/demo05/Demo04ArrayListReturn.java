package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
分析：
1. 需要创建一个大集合，用来存储int数字 ：<Integer>
2.随机数字用Random.nextInt
3.循环20次，把随机数字放入大集合：for循环 add方法
4.定义一个方法，用来筛选
筛选：根据大集合，筛选符合要求的元素，得到小集合
5.判断（if）是偶数 num % 2 == 0
6.如果是偶数，就放到小集合当中，否则不放
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100) + 1;  //范围1~100
            bigList.add(num);
        }
        System.out.println(bigList);

        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println(smallList);

    }

    //这个方法接受大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num % 2 ==0){
                smallList.add(num);
            }
        }
        return smallList;
    }

}
