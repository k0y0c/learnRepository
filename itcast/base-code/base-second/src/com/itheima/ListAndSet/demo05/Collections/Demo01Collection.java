package com.itheima.ListAndSet.demo05.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
java.utils.Collections 是集合工具类，用来对集合进行操作。部分方法如下：
    public static <T> boolean addAll(Collection<T> c, T... elements) :往集合中添加一些元素。
    public static void shuffle(ListAndSet<?> list) 打乱顺序 :打乱集合顺序。
    public static <T> void sort(ListAndSet<T> list) :将集合中元素按照默认规则排序。
    public static <T> void sort(ListAndSet<T> list，Comparator<? super T> ) :将集合中元素按照指定规则排序。
 */
public class Demo01Collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加多个元素
        /*list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");*/

        //public static <T> boolean addAll(Collection<T> c, T... elements) :往集合中添加一些元素。
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);       //[a, b, c, d, e]

        //public static void shuffle(ListAndSet<?> list) 打乱顺序 :打乱集合顺序。
        Collections.shuffle(list);
        System.out.println(list);       //[e, b, c, a, d]
    }
}
