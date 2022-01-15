package cn.itcast.day09.demo07;

public class Zi extends Fu {
    public Zi(){
        //super();        //调用父类无参构造
        super(20);      //调用父类重载有参构造
        System.out.println("子类构造方法");
    }

    public void method(){
        //super();          //错误写法，只有子类构造方法才能调用父类构造方法。
    }
}
