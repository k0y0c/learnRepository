package cn.itcast.day05.demo03;
/*
遍历数组。说的就是对数组当中的每一个元素逐一，挨个处理。
快捷键：数组名称.fori
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {15,25,30,40,50};
        
        //使用循环，次数其实就是数组的长度
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
