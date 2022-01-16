package com.itheima.IOAndProperties.demo05.Writer;
import java.io.FileWriter;
import java.io.IOException;
/*
    续写和换行
    续写，追加写：使用两个参数的构造方法
        FileWriter(File file, boolean append) 根据给定的 File 对象构造一个 FileWriter 对象。
        FileWriter(String fileName, boolean append) 根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
    换行：换行符
        windows：\r\n
        linux:/n
        mac:/r
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("base-second\\src\\com\\itheima\\IOAndProperties\\g.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("HelloWorld" + i + "\r\n");
        }
        fw.close();
    }
}
