package cn.itcast.day05.demo01;
/*
直接打印数组名称，得到的是数组对应的：内存地址哈希值

访问数组元素格式：数组名称[索引值]
 */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        int[] array = {10,20,30};

        System.out.println(array);          //内存地址 [I@71e7a66b

        //直接打印数组当中的元素
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //也可以将数组当中的某一个单个元素，赋值给变量
        int num = array[1];
        System.out.println(num);
    }
}
