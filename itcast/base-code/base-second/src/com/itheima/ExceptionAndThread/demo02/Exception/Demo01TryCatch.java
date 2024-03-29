package com.itheima.ExceptionAndThread.demo02.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    try...catch:异常处理的第二种方式，自己处理异常
    格式：
        try{
            可能会出现异常的代码
        }catch(异常类型 变量名){     //参数接收try中抛出的异常对象
            异常处理逻辑，产生异常对象之后，怎么处理异常对象
            一般在工作中，会把异常的信息记录到一个日志中
        }
        ...
        catch(异常类型 变量名){
            ...
        }
    注意：
        1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
        2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的逻辑，继续执行try...catch之后的代码
          如果try中没有产生异常，那么就不会执行catch中异常的处理逻辑，执行完try中的代码，继续执行try...catch之后的代码
 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        try{
            //可能产生异常的代码
            readFile("d:\\a.tx");
        }catch (IOException e){         //try抛出什么异常对象，catch就定义什么异常变量，用来接收这个异常对象
            //异常处理逻辑，产生异常对象之后，怎么处理异常对象
            //System.out.println("catch -传递的文件后缀不是.txt");
            /*
                Throwable类定义了3个异常处理的方法
                    public String getMessage() :获取异常的描述信息,原因(提示给用户的时候,就提示错误原因。
                    public String toString() :获取异常的类型和异常描述信息(不用)。
                    public void printStackTrace() :打印异常的跟踪栈信息并输出到控制台。
                    包含了异常的类型,异常的原因,还包括异常出现的位置,在开发和调试阶段,都得使用printStackTrace。
             */
            //System.out.println(e.getMessage());     //文件的后缀名不对
            //System.out.println(e.toString());       //java.io.IOException: 文件的后缀名不对
            //System.out.println(e);                    //同上，直接打印对象，就是调用toString
            e.printStackTrace();                /*java.io.IOException: 文件的后缀名不对
                                                    at com.itheima.ExceptionAndThread.demo02.Exception.Demo01TryCatch.readFile(Demo01TryCatch.java:53)
                                                    at com.itheima.ExceptionAndThread.demo02.Exception.Demo01TryCatch.main(Demo01TryCatch.java:28)*/

        }
        System.out.println("后续代码");
    }
    /*
        如果传递的文件，不是.txt结尾
        那么我们就抛出IO异常对象，告知方法的调用者，文件后缀名不对
     */
    public static void readFile(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
