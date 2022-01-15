package cn.itcast.day11.demo03;

public class Demo02InnerClass {
    public static void main(String[] args) {
        //直接使用内部类
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }
}
