package com.itheima.FileAndRecursion.demo01.File;
import java.io.File;
/*
    java.io.File 类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。
    我们可以使用File类的方法
        创建一个文件/文件夹
        删除文件/文件夹
        获取文件/文件夹
        判断文件/文件夹是否存在
        对文件夹进行遍历
        获取文件的大小
    File类是一个与系统无关的类，任何的操作系统都可以使用这个类中的方法

    重点：记住三个单词
        file：文件
        directory：文件/文件夹
        path：路径
 */
public class Demo01File {
    public static void main(String[] args) {
        /*
            static String pathSeparator 与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
            static char pathSeparatorChar 与系统有关的路径分隔符。

            static String separator 与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
            static char separatorChar 与系统有关的默认名称分隔符。

            操作路径：路径不能写死了
            C:\develop\a\a.txt   windows
            C:/develop/a/a.txt   linux
            "C:" + File.separator + "develop" + File.separator + "a" + File.separator + "a.txt"
         */
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);      //路径分隔符 windows：分号;    linux：冒号:

        String separator = File.separator;
        System.out.println(separator);          //文件名称分隔符 windows：反斜杠\   linux：正斜杠/
    }
}
