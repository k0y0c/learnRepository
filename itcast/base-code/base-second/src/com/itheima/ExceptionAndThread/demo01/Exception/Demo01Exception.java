package com.itheima.ExceptionAndThread.demo01.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable:类是Java语言中所有错误或异常的超类。
        Exception：编译期异常，进行编译（写代码）java程序出现的问题
            RuntimeException：运行期异常，java程序运行过程中出现的问题
            异常就相当于程序得了一个小毛病，把异常处理掉，程序可以继续执行
        Error：错误
            错误就相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能继续执行
 */
public class Demo01Exception {
    public static void main(String[] args) /* throws ParseException */ {
        //Exception：编译期异常，进行编译（写代码）java程序出现的问题
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");    //用来格式化日期
        Date date = null;
        try {
            date = sdf.parse("1999-0909");    //把字符串格式的日期，解析为Date格式的日期
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);*/

        //RuntimeException：运行期异常，java程序运行过程中出现的问题
        /*int[] arr = {1,2,3};
        //System.out.println(arr[0]);
        try{
            //可能会出现异常的代码
            System.out.println(arr[3]);
        }catch (Exception e){
            //异常的处理逻辑
            System.out.println(e);
        }*/

        //Error：错误
        //int[] arr = new int[1024*1024*1024];    //内存溢出的错误OutOfMemoryError
        //必须修改代码，创建的数组小一点
        int[] arr = new int[1024*1024];
        System.out.println("后续代码");

    }
}
