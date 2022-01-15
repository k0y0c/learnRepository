package cn.itcast.day04.demo03;
/*
题目要求：定义一个方法，用来判断两个数字是否相同
三要素：
返回值：boolean
方法名称：isCame
参数列表：int a，int b
 */
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(5,10));
        System.out.println(isSame(20,20));
    }
    public static boolean isSame(int a,int b){
        /*if(a==b){
            return true;
        }else {
            return false;
        }*/
       /* boolean same = a==b ?true:false;
        return same;*/

       return a==b;
    }
}
