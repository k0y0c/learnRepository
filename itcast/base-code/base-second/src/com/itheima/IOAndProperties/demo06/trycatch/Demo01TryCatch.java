package com.itheima.IOAndProperties.demo06.trycatch;
import java.io.FileWriter;
import java.io.IOException;
/*
    在jdk1.7之前使用try catch finally 处理流中的异常
    格式：
        try{
            可能会产生异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }finally{
            一定会执行的代码
            资源释放
        }
 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        //提高变量的作用域，让finally可以使用
        //变量在定义的时候，可以没有值，但是使用的时候必须有值
        //fw = new FileWriter("E:\mycode\base-code\base-second\src\com\itheima\IOAndProperties\g.txt",true); 执行失败，fw没有值，fw.close会报错
        FileWriter fw = null;
        try{
            //可能会产生异常的代码
            fw = new FileWriter("H:\\mycode\\base-code\\base-second\\src\\com\\itheima\\IOAndProperties\\g.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("HelloWorld" + i + "\r\n");
            }
        }catch (IOException e){
            //异常的处理逻辑
            System.out.println(e);
        }finally {
            //一定会执行的代码
            //创建对象失败了，fw的默认值是null，null是不能调用方法的，会抛出NullPointerException，需要增加一个判断，不是null再把资源释放
            if(fw!=null){
                try {
                    //fw.close方法声明抛出了IOException异常对象，所以我们就必须处理这个异常对象，要么throws，要么try catch
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
