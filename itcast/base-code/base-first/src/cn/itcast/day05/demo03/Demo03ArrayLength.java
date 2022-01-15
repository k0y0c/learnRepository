package cn.itcast.day05.demo03;
/*
获取数组的长度格式：  数组名称.length

数组一旦创建，程序运行期间，长度不可改变。
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = {10,20,30,2,0,15,2,16,23,156,15,213,15,15,153,53,12,155};
        int len = arrayA.length;
        System.out.println("arrayA的长度是：" + len);

        int[] arrayB = new int[3];              //在堆中创建了一个数组
        System.out.println(arrayB.length);      //3
        System.out.println(arrayB);             //[I@e580929
        arrayB = new int[5];                    //在堆中又重新创建了一个数组，并把地址交给了arrayB
        System.out.println(arrayB.length);      //5
        System.out.println(arrayB);             //[I@1cd072a9
    }
}
