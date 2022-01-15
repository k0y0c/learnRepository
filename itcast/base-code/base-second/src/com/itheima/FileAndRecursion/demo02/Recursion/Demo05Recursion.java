package com.itheima.FileAndRecursion.demo02.Recursion;
import java.io.File;
/*
    练习：
        递归打印多级目录,只要.java结尾的文件
    需求：
        遍历E:\mycode\base-code\base-second\src\com\itheima\FileAndRecursion文件夹的子文件夹
        只要.java结尾的文件
 */
public class Demo05Recursion {
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
        //System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            }else{
                /*
                    只要.java结尾的文件
                    1.把File对象file，转为字符串对象
                 */
                //String name = file.getName();   //得到文件名称的字符串 Demo05Recursion.java
                //String path = file.getPath();   //返回路径名称的字符串 E:\mycode\base-code\base-second\src\com\itheima\FileAndRecursion\demo02\Recursion\Demo05Recursion.java
                String s = file.toString();     //调用的就是getPath方法
                //把字符串，转化为小写
                s = s.toLowerCase();
                //2.调用String类中的方法endsWith判断字符串是否是以.java结尾
                boolean b = s.endsWith(".java");
                //3.如果是以.java结尾的文件，则输出
                if (b){
                    System.out.println(file);
                }

                //省略方式
                if (file.getName().toLowerCase().endsWith(".java")){
                    System.out.println(file);
                }
            }
        }
    }
}
