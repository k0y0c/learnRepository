package com.itheima.IOAndProperties.demo02.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
/*
    java.io.InputStream :字节输入流
    此抽象类是表示字节输入流的所有类的超类

    定义了所有子类共性的方法：
        public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
        public abstract int read() ： 从输入流读取数据的下一个字节。
        public int read(byte[] b) ： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。

    java.io.FileInputStream extends InputStream
    FileInputStream：文件字节输入流
    作用：把硬盘文件中的数据，读取到内存中使用

    构造方法：
        FileInputStream(File file) ： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系 统中的 File对象 file命名。
        FileInputStream(String name) ： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件 系统中的路径名 name命名。
        构造方法作用：
            1.会创建一个FileInputStream对象
            2.会把FileInputStream对象指定构造方法中要读取的文件
    读取数据的原理(硬盘-->内存)
        java程序-->JVM-->OS-->OS读取数据的方法-->读取文件
    字节输入流的使用步骤(重点)：
        1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        2.使用FileInputStream对象中的方法read，读取文件
        3.释放资源
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("base-second\\src\\com\\itheima\\IOAndProperties\\a.txt");
        //2.使用FileInputStream对象中的方法read，读取文件
        //int read() ：读取文件中的一个字节并返回，读取到文件末尾返回-1
        /*int read = fis.read();
        System.out.println(read);   //97
        read = fis.read();
        System.out.println(read);   //98
        read = fis.read();
        System.out.println(read);   //99
        read = fis.read();
        System.out.println(read);   //-1
        read = fis.read();
        System.out.println(read);   //-1*/

        /*
            发现以上读取文件是一个重复的过程，所以可以使用循环优化
            不知道文件中有多少字节，使用while循环
            while循环结束条件，读取到-1的时候结束

            布尔表达式(len = fis.read())!=-1
                1.fis.read():读取一个字节
                2.len = fis.read():把读取到的字节赋值给变量len
                3.(len = fis.read())!=-1：判断变量len是否不等于-1
         */
        int len = 0;
        while((len = fis.read())!=-1){
            System.out.print((char) len);     //abc
        }

        //3.释放资源
        fis.close();
    }
}
