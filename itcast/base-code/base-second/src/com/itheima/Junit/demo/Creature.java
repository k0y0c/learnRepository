package com.itheima.Junit.demo;

import java.io.Serializable;

public class Creature<T>implements Serializable {
    private char gender;  //性别
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }
    public void eat(){
        System.out.println("米西米西");
    }
}
