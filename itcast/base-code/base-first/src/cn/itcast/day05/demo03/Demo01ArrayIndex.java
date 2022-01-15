package cn.itcast.day05.demo03;
/*
如果访问数组元素的时候，索引编号并不存在，那么将会发生数组索引越界异常：ArrayIndexOutOfBoundsException
 */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array = {15,25,35};

        System.out.println(array[0]);       //15
        System.out.println(array[1]);       //25
        System.out.println(array[2]);       //35

        //错误  并不存在3号元素，所以发生异常
        System.out.println(array[3]);
    }
}
