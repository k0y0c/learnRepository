package com.itheima.IOAndProperties.demo01.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
    追加写/续写：使用两个参数的构造方法
        public FileOutputStream(File file, boolean append) ： 创建文件输出流以写入由指定的 File对象表示的文件。
        public FileOutputStream(String name, boolean append) ： 创建文件输出流以指定的名称写入文件
        参数：
            String name，File file:写入数据的目的地
            boolean append：追加写开关
                true：创建对象不会覆盖原文件，继续在文件的末尾追加写数据
                false：创建一个新文件，覆盖原文件
    写换行：写换行符
        windows：\r\n
        linux:/n
        mac:/r
 */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("base-second\\src\\com\\itheima\\IOAndProperties\\c.txt",true);
        for (int i = 1; i <= 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();

    }
}
