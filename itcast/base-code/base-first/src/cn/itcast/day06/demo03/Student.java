package cn.itcast.day06.demo03;
/*
对于基本类型当中的boolean值，Getter方法一定要写成isXxx，而Serter方法规则不变为setXxx。
 */
public class Student {
    private String name;        //姓名
    private  int age;           //年龄
    private  boolean male;      //性别

    public void setName(String str){
        name = str;
    }
    public String getName(){
        return name;
    }

    public void setAge(int num){
        age = num;
    }
    public int getAge(){
        return age;
    }

    public void setMale(boolean b){
        male = b;
    }
    public boolean isMale(){
        return male;
    }
}
