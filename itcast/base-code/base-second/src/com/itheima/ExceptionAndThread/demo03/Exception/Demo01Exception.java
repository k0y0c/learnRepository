package com.itheima.ExceptionAndThread.demo03.Exception;

import java.util.List;

/*
    异常的注意事项
 */
public class Demo01Exception {
    public static void main(String[] args) {
        /*
            多个异常使用捕获又该如何处理呢？
            1.多个异常分别处理
            2.多个异常一次捕获，多次处理
                一个try多个catch注意事项：
                    catch里边定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上边，否则就会报错
            3.多个异常一次捕获一次处理。
         */
        //1.多个异常分别处理
        /*try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);     //ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            ListAndSet<Integer> list = ListAndSet.of(1, 2, 3);
            System.out.println(list.get(3));    //IndexOutOfBoundsException
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }*/


        //2.多个异常一次捕获，多次处理
        //ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException 两个catch不能调换，否则会报错
        /*try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);     //ArrayIndexOutOfBoundsException
            ListAndSet<Integer> list = ListAndSet.of(1, 2, 3);
            System.out.println(list.get(3));    //IndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }*/


        //3.多个异常一次捕获一次处理。
        /*try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);     //ArrayIndexOutOfBoundsException
            ListAndSet<Integer> list = ListAndSet.of(1, 2, 3);
            System.out.println(list.get(3));    //IndexOutOfBoundsException
        }catch (Exception e){                   //Throwable重写了toString方法
            System.out.println(e);
        }*/

        //运行时异常被抛出可以不处理。即不捕获也不声明抛出
        //默认给虚拟机处理，终止程序，什么时候不抛出运行时异常了，再来继续执行程序
        /*int[] arr = {1,2,3};
        System.out.println(arr[3]);     //ArrayIndexOutOfBoundsException
        ListAndSet<Integer> list = ListAndSet.of(1, 2, 3);
        System.out.println(list.get(3));    //IndexOutOfBoundsException*/


        System.out.println("后续代码！");
    }
}
