package cn.itcast.day07.demo03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(10);       //实际范围是0~9
            System.out.println(num);
        }
    }
}
