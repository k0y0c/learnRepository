package cn.itcast.day08.demo02;
/*
字符串的截取方法：
public String substring(int index):截取从参数位置一直到字符串末尾，返回新字符串
public String substring(int begin,int end):截取begin开始，一直到end结束，中间的字符串。[begin，end)：包含左边，不包含右边
 */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);   //HelloWorld 原封不动
        System.out.println(str2);       //World ，新字符串
        System.out.println("===============");

        String str3 = str1.substring(4,7);
        System.out.println(str3);       //oWo
        System.out.println("===============");

        //下面这两种写法，字符串的内容任然是没有改变的
        //strA中保存的是地址值。本来地址值是Hello的0x666，后来变成Java的0x999
        String strA = "Hello";
        System.out.println(strA);   //Hello
        strA = "Java";
        System.out.println(strA);   //Java
    }
}
