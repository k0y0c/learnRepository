package com.itheima.ListAndSet.demo01.List;

import java.util.LinkedList;

/*
    java.util.LinkedList集合： implement List接口
    LinkedList集合的特点：
        1.底层是一个链表结构：查询慢，增删快
        2.里边包含了大量操作首尾元素的方法
        注意：使用LinkedList集合特有的方法，不能使用多态

        public void addFirst(E e) :将指定元素插入此列表的开头。
        public void addLast(E e) :将指定元素添加到此列表的结尾。   此方法等效于add();
        public void push(E e) :将元素推入此列表所表示的堆栈。      此方法等效于addFirst(E)。

        public E getFirst() :返回此列表的第一个元素。
        public E getLast() :返回此列表的最后一个元素。

        public E removeFirst() :移除并返回此列表的第一个元素。
        public E removeLast() :移除并返回此列表的最后一个元素。
        public E pop() :从此列表所表示的堆栈处弹出一个元素。      此方法相当于removeFirst

        public boolean isEmpty() ：如果列表不包含元素，则返回true。

 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }
    /*
        public void addFirst(E e) :将指定元素插入此列表的开头。
        public void addLast(E e) :将指定元素添加到此列表的结尾。 此方法等效于add();
        public void push(E e) :将元素推入此列表所表示的堆栈。  此方法等效于addFirst(E)。
     */
    private static void show01() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);     //[a, b, c]

        //public void addFirst(E e) :将指定元素插入此列表的开头。
        linked.addFirst("www");
        //linked.push("www");
        System.out.println(linked);     //[www, a, b, c]
        linked.addLast("com");
        System.out.println(linked);     //[www, a, b, c, com]
    }

    /*
        public E getFirst() :返回此列表的第一个元素。
        public E getLast() :返回此列表的最后一个元素。
     */
    private static void show02() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);     //[a, b, c]

        //linked.clear();     //清空集合中的元素

        //public boolean isEmpty() ：如果列表不包含元素，则返回true。
        if(!linked.isEmpty()){                   //清空集合中的元素，在获取集合中的元素会抛出 NoSuchElementException
            String first = linked.getFirst();
            System.out.println(first);          //a
            String last = linked.getLast();
            System.out.println(last);           //c
        }
    }

    /*
        public E removeFirst() :移除并返回此列表的第一个元素。
        public E removeLast() :移除并返回此列表的最后一个元素。
        public E pop() :从此列表所表示的堆栈处弹出一个元素。      此方法相当于removeFirst
     */
    private static void show03() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);     //[a, b, c]

        String f = linked.removeFirst();
        System.out.println("被移除的第一个元素：" + f);
        String l = linked.removeLast();
        System.out.println("被移除的最后一个元素：" + l);
        //String pop = linked.pop();
        //System.out.println("被移除的第一个元素：" + pop);

    }
}
