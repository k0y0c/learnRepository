package cn.itcast.day10.demo01;

public interface MyInterfacePrivateB {
    public static void methodStatic1(){
        System.out.println("默认方法1");
        methodCommon();
    }
    public static void methodStatic2(){
        System.out.println("默认方法2");
        methodCommon();
    }
    private static void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
