package com.itheima.IO.demo03.ReverseStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
    java.io.InputStreamReader extends Reader
    InputStreamReader：是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符。(解码)
    继承自父类的共性方法：
        public void close() ：关闭此流并释放与此流相关联的任何系统资源。
        public int read() ： 从输入流读取一个字符。
        public int read(char[] cbuf) ： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。
    构造方法：
        InputStreamReader(InputStream in)创建一个使用默认字符集的 InputStreamReader。
        InputStreamReader(InputStream in, String charsetName)创建使用指定字符集的 InputStreamReader。
        参数：
            InputStream in：字节输入流，用来读取文件中保存的字节
            String charsetName：指定的编码表名称，不区分大小写，可以是utf-8/UTF-8,gbk/GBK,...不指定默认使用UTF-8
    使用步骤：
        1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        2.使用InputStreamReader对象的方法read读取文件
        3.释放资源
    注意事项：
        构造方法中指定的编码表要和文件的编码相同，否则会乱码
 */
public class Demo03InputStreamReader {
    public static void main(String[] args) throws IOException {
        //read_utf_8();
        read_gbk();
    }
    /*
        使用InputStreamReader读取UTF-8格式的文件
     */
    private static void read_utf_8() throws IOException {
        //1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("base-second\\src\\com\\itheima\\IO\\demo03\\ReverseStream\\utf_8.txt"),"UTF-8");
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("base-second\\src\\com\\itheima\\IO\\demo03\\ReverseStream\\utf_8.txt")); //不指定默认为UTF-8
        //2.使用InputStreamReader对象的方法read读取文件
        int len = 0;
        while((len = isr.read())!=-1){
            System.out.print((char) len);
        }
        //3.释放资源
        isr.close();
    }
    /*
        使用InputStreamReader读取GBK格式的文件
     */
    private static void read_gbk() throws IOException {
        //1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("base-second\\src\\com\\\\itheima\\IO\\demo03\\ReverseStream\\gbk.txt"),"UTF-8"); //���
        InputStreamReader isr = new InputStreamReader(new FileInputStream("base-second\\src\\com\\\\itheima\\IO\\demo03\\ReverseStream\\gbk.txt"),"GBK");
        //2.使用InputStreamReader对象的方法read读取文件
        int len = 0;
        while((len = isr.read())!=-1){
            System.out.print((char) len);
        }
        //3.释放资源
        isr.close();
    }
}
