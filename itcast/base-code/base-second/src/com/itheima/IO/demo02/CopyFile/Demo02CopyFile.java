package com.itheima.IO.demo02.CopyFile;

import java.io.*;

/*
    文件复制练习：一读一写
    明确：
        数据源：E:\mycode\base-code\base-second\src\com\itheima\IO\1.jpg
        数据的目的地：E:\mycode\base-code\base-second\src\com\itheima\IO\demo02\CopyFile\1.jpg
    文件复制的步骤：
        1.创建字节缓冲输入流对象，构造方法中传递字节输入流
        2.创建字节缓冲输出流对象，构造方法中传递字节输出流
        3.使用字节缓冲输入流对象中的方法read读取文件
        4.使用字节缓冲输出流对象中的方法write，把读取到的数据写入到内部缓冲区
        5.释放资源(会先把缓冲区中的数据，刷新到文件中)
 */
public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //1.创建字节缓冲输入流对象，构造方法中传递字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\mycode\\base-code\\base-second\\src\\com\\itheima\\IO\\1.jpg"));
        //2.创建字节缓冲输出流对象，构造方法中传递字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\mycode\\base-code\\base-second\\src\\com\\itheima\\IO\\demo02\\CopyFile\\1.jpg"));
        //3.使用字节缓冲输入流对象中的方法read读取文件
        /*int len = 0;
        while((len = bis.read())!=-1){
            //4.使用字节缓冲输出流对象中的方法write，把读取到的数据写入到内部缓冲区
            bos.write(len);
        }*/
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        //5.释放资源(会先把缓冲区中的数据，刷新到文件中)
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时：" + (e-s) + "毫秒");
    }
}
