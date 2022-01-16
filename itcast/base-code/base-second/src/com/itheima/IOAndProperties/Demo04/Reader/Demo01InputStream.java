package com.itheima.IOAndProperties.Demo04.Reader;

import java.io.FileInputStream;
import java.io.IOException;
/*
    使用字节流读取中文文件
    1个中文
        GBK：占两个字节
        UTF-8：占3个字节
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\mycode\\base-code\\base-second\\src\\com\\itheima\\IOAndProperties\\c.txt");
        int len = 0;
        while((len = fis.read())!=-1){
            System.out.println((char)len);
        }
        /*byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }*/
        fis.close();
    }
}
