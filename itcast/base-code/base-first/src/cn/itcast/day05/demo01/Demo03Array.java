package cn.itcast.day05.demo01;
/*
静态初始化标准格式：数据类型[] 数组名称 = new 数据类型[] {元素1，元素2，...}；
静态初始化省略格式：数组类型[] 数组名称 = {元素1，元素2，...}；
注意事项：
1.静态以及动态初始化可以拆分成两个步骤
2.静态初始化省略格式不能拆分成两个步骤

建议：
如果不确定数组中的具体内容，用动态初始化；否则确定数组中的内容用静态初始化
 */
public class Demo03Array {
    public static void main(String[] args) {
        //省略格式的静态初始化
        int[] arrayA = {10,20,30};

        //静态初始化可以拆分成两个步骤
        int[] arrayB;
        arrayB = new int[] {11,21,31};

        //动态初始化可以拆分成两个步骤
        int[] arrayC;
        arrayC=new int[5];

        //静态初始化省略格式不能拆分成两个步骤
        /*int[] arrayD;
        arrayD = {10,20,30};*/
    }
}
