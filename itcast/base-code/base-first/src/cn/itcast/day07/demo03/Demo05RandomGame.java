package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/*
改良：5次没猜中就算输
 */
public class Demo05RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;        //[1,100]
       // System.out.println(randomNum);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = scanner.nextInt();

            if (guessNum > randomNum) {
                System.out.println("太大了，请重试。");
            } else if (guessNum < randomNum) {
                System.out.println("太小了，请重试");
            } else {
                System.out.println("恭喜你，猜中了");
                break;
            }

            if(i==4){
                System.out.println("你输了");
                break;
            }
        }


    }
}
