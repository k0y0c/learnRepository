package cn.itcast.day05.demo04;
/*
数组可以作为方法的参数。当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值
 */
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        printArray(array);
    }
    public static void printArray(int[] array){
        System.out.println("printArray收到的参数是：");
        System.out.println(array);              //地址值  [I@71e7a66b

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
