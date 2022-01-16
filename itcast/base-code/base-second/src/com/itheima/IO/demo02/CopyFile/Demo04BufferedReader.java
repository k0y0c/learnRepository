package com.itheima.IO.demo02.CopyFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
    java.io.BufferedReader extends Reader
    继承自父类的共性方法：
        public void close() ：关闭此流并释放与此流相关联的任何系统资源。
        public int read() ： 从输入流读取一个字符。
        public int read(char[] cbuf) ： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中 。
    构造方法：
        BufferedReader(Reader in) 创建一个使用默认大小输入缓冲区的缓冲字符输入流。
        BufferedReader(Reader in, int sz) 创建一个使用指定大小输入缓冲区的缓冲字符输入流。
    特有的成员方法：
        String readLine() 读取一个文本行。读取一行数据
            行的终止符号：通过下列字符之一即可认为某行已终止：换行('\n')、回车('\r')或回车后直接跟着换行('\r\n')
            返回值：
                包含该行内容的字符串，不包含任何行终止符，如果已达到流末尾，则返回null
    使用步骤：
        1.创建字符缓冲输入流对象，构造方法中传递字符输入流
        2.使用字符缓冲输入流对象中的方法read/readLine读取文本
        3.释放资源
 */
public class Demo04BufferedReader {
    public static void main(String[] args) throws IOException {
        //1.创建字符缓冲输入流对象，构造方法中传递字符输入流
        BufferedReader br = new BufferedReader(new FileReader("E:\\mycode\\base-code\\base-second\\src\\com\\itheima\\IO\\c.txt"));
        //2.使用字符缓冲输入流对象中的方法read/readLine读取文本
        /*String line = br.readLine();
        System.out.println(line);   //传智播客1
        line = br.readLine();
        System.out.println(line);   //传智播客2
        line = br.readLine();
        System.out.println(line);   //传智播客3
        line = br.readLine();
        System.out.println(line);   //null*/
        /*
            以上读取是一个重复过程，所以可以使用循环优化
            不知道文件中有多少行数据，所以使用while循环
            while的结束条件，读取到null结束
         */
        String line ;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        //3.释放资源
        br.close();
    }
}
