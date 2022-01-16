package com.itheima.FileAndRecursion.demo02.Recursion;
import java.io.File;
/*
    练习：
        递归打印多级目录
    需求：
        遍历E:\mycode\base-code\base-second\src\com\itheima\FileAndRecursion文件夹的子文件夹
 */
public class Demo04Recursion {
    public static void main(String[] args) {
        File file = new File("E:\\mycode\\base-code\\base-second\\src\\com\\itheima\\FileAndRecursion");
        getAllFile(file);
    }
    /*
        定义一个方法，参数传递File类型的目录
        方法中对目录进行遍历
     */
    /*public static void getAllFile(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
            if(file.isDirectory()){
                getAllFile(file);
            }
        }
    }*/
    public static void getAllFile(File dir){
        System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            }else{
                System.out.println(file);
            }
        }
    }
}
