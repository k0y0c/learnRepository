package com.itheima.FileAndRecursion.demo03.Filter;
import java.io.File;
/*
    练习：
        递归打印多级目录,只要.java结尾的文件
    需求：
        遍历E:\mycode\base-code\base-second\src\com\itheima\FileAndRecursion文件夹的子文件夹
        只要.java结尾的文件
    我们可以使用过滤器来实现
    在File类中有两个和ListFiles重载的方法，方法的参数传递的就是过滤器
    File[] listFiles(FileFilter filter)  返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
    java.io.FileFilter接口：用于抽象路径名(File对象)的过滤器
        作用：用来过滤文件的(File对象)
        抽象方法：用来过滤文件的方法
            boolean accept(File pathname)测试指定抽象路径名是否应该包含在某个路径名列表中。
            参数：File pathname：使用ListFiles方法遍历目录，得到的每一个文件对象
    File[] listFiles(FilenameFilter filter) 返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
    java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
        作用：用于过滤文件名称
        抽象方法：用来过滤文件的方法
            boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件列表中。
            参数：File dir：构造方法中传递的被遍历的目录
                  String name：使用ListFiles方法遍历目录，得到的每一个文件/文件夹名称
    注意：两个过滤器接口是没有实现类的，需要我们自己写实现类，重写过滤的方法accept，在方法中自己定义过滤的规则
 */
public class Demo01Filter {
    public static void main(String[] args) {
        File file = new File("E:\\mycode\\base-code\\base-second\\src\\com\\itheima\\FileAndRecursion");
        getAllFile(file);
    }
    /*
        定义一个方法，参数传递File类型的目录
        方法中对目录进行遍历
     */
    public static void getAllFile(File dir){
        File[] files = dir.listFiles(new FileFilterImpl());     //传递过滤器对象
        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            }else{
                System.out.println(file);
            }
        }
    }
}
