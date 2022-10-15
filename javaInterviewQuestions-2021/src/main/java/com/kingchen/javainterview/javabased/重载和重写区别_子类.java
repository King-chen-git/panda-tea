package com.kingchen.javainterview.javabased;

import java.lang.reflect.Array;
import java.util.*;

public class 重载和重写区别_子类 extends 重载和重写区别_父类{

    public int add(int a){
        return a;
    }

    public static void main(String[] args){
        System.out.println(new 重载和重写区别_子类().add(10));

        List<String> list = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();
        Set<String> set = new HashSet<String>();
        Set<String> set2 = new TreeSet<String>();
        Map<String,String> map = new HashMap<>();


    }
}
