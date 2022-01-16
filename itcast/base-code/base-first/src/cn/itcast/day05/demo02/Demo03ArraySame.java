package cn.itcast.day05.demo02;
/*
两个变量指向一个数组:对一个变量进行操作会影响另一个变量
*/
public class Demo03ArraySame {

    public static void main(String[] args) {
        int[] arrayA = new int[3];         //动态初始化
        System.out.println(arrayA);        //地址值
        System.out.println(arrayA[0]);     //0
        System.out.println(arrayA[1]);     //0
        System.out.println(arrayA[2]);     //0

        //改变数组当中的元素
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);        //地址值
        System.out.println(arrayA[0]);     //0
        System.out.println(arrayA[1]);     //10
        System.out.println(arrayA[2]);     //20

        int[] arrayB = arrayA;         //地址值
        System.out.println(arrayB);        //地址值
        System.out.println(arrayB[0]);     //0
        System.out.println(arrayB[1]);     //10
        System.out.println(arrayB[2]);     //20

        //改变数组当中的元素
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);        //地址值
        System.out.println(arrayB[0]);     //0
        System.out.println(arrayB[1]);     //100
        System.out.println(arrayB[2]);     //200

        System.out.println(arrayA[0]);     //0
        System.out.println(arrayA[1]);     //100
        System.out.println(arrayA[2]);     //200
    }
}
