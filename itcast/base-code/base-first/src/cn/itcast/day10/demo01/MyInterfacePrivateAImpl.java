package cn.itcast.day10.demo01;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA{

    public void methodAnother(){
        //不用private修饰，直接访问到了接口中的默认方法，这是错误的！
//        methodCommon();
    }
}
