package cn.itcast.day05.demo03;
/*
不使用新数组，用原来的数组实现数组逆置
 */
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int min =0,max=array.length-1;min<max;min++,max--){
            int temp=array[min];
            array[min]=array[max];
            array[max]=temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
