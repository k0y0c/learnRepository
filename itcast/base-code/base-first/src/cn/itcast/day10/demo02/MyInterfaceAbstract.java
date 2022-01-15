package cn.itcast.day10.demo02;

//如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么实现类就必须是一个抽象类。

public abstract class MyInterfaceAbstract implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {

    }

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {

    }

}
