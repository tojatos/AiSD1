package com.tosware;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        println(list.size());
        println(list.isEmpty());
        list.add(5);
        list.add(7);
        list.add(-24);
        println(list.isEmpty());
        println(list.size());
        println(list.get(2));
        println(list.get(0));
        list.remove(1);
        println(list.size());
        println(list.get(0));
        println(list.get(1));

        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(-24);
        list.add(7);
        list.add(-24);
        list.add(7);
        list.add(-24);
        list.add(7);
        list.add(-24);
        list.add(7);
        list.add(-24);
        list.add(7);
        list.add(-24);
        list.add(7);
        list.add(-24);
        list.add(7);
        list.add(-24);
        list.add(7);
        list.add(-24);
        println(list.size());
        println(list.get(15));
        println(list.contains(17));
        list.set(15, 17);
        println(list.contains(17));
        println(list.get(15));
        show(list.iterator());
        list.clear();
        println(list.size());



    }
    private static void println(Object o) {
        System.out.println(o);
    }
    private static void show(Iterator iterator) {
        while(iterator.hasNext()) {
            println(iterator.next());
        }

    }
}
