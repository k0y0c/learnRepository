package cn.itcast.day09.demo13;

public class DemoMain {
    public static void main(String[] args) {
        //Animal animal = new Animal();       //错误
        //Dog dog = new Dog();        //错误

        Dog2Ha ha = new Dog2Ha();       //这是普通类，可以直接new
        ha.sleep();
        ha.eat();

        DogGolden golden = new DogGolden();
        golden.sleep();
        golden.eat();
    }
}
