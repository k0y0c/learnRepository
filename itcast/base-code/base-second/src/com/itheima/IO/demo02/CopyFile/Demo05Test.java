package com.itheima.IO.demo02.CopyFile;
import java.io.*;
import java.util.HashMap;
/*
    练习：
        对文本的内容进行排序
        按照（1,2,3...）顺序排序
    分析：
        1.创建HashMap集合对象，key：存储每行文本的序号(1,2,3...);value:存储每行的文本
        2.创建字节缓冲输入流对象，构造方法中绑定字符输入流
        3.创建字符缓冲输出流对象，构造方法绑定字符输出流
        4.使用字符缓冲输入流中的方法readline，逐行读取文本
        5.对读取到的文本进行切割，获取行中的序号和文本内容
        6.把切割好的序号和文本的内容存储到HashMap集合中（key序号是有序的，会自动排序1,2,3...）
        7.遍历HashMap集合，获取每一个键值对
        8.把每一个键值对，拼接为一个文本行
        9.把拼接好的文本，使用字符缓冲输出流中的方法write，写入到文本中
        10.释放资源
 */
public class Demo05Test {
    public static void main(String[] args) throws IOException {
        //1.创建HashMap集合对象，key：存储每行文本的序号(1,2,3...);value:存储每行的文本
        HashMap<String,String> map = new HashMap<>();
        //2.创建字节缓冲输入流对象，构造方法中绑定字符输入流
        BufferedReader br = new BufferedReader(new FileReader("E:\\mycode\\base-code\\base-second\\src\\com\\itheima\\IO\\demo02\\CopyFile\\in.txt"));
        //3.创建字符缓冲输出流对象，构造方法绑定字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\mycode\\base-code\\base-second\\src\\com\\itheima\\IO\\demo02\\CopyFile\\out.txt"));
        //4.使用字符缓冲输入流中的方法readline，逐行读取文本
        String line;
        while ((line = br.readLine())!=null){
            //5.对读取到的文本进行切割，获取行中的序号和文本内容
            String[] arr = line.split("\\.");
            //6.把切割好的序号和文本的内容存储到HashMap集合中（key序号是有序的，会自动排序1,2,3...）
            map.put(arr[0],arr[1]);
        }
        //System.out.println(map.toString());
        //7.遍历HashMap集合，获取每一个键值对
        for (String key : map.keySet()){
            String value = map.get(key);
            //8.把每一个键值对，拼接为一个文本行
            line = key + "." + value;
            //9.把拼接好的文本，使用字符缓冲输出流中的方法write，写入到文本中
            bw.write(line);
            bw.newLine();       //readline不会把换行符读入，所以写的时候要写换行
        }
        //10.释放资源
        bw.close();
        br.close();
    }
}
