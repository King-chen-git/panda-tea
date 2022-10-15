package com.kingchen.javainterview.javabased;

import java.util.*;

public class 重载和重写区别_父类 {

    /**
     * @Author 熊猫煮茶
     * @Date 2021/9/1 23:03
     * @Description
     * 重载： 发生在同一个类中，方法名必须相同，参数类型不同、个数不同、顺序不同，方法返回值和访问修饰符可以不同，发生在编译时。
     * 重写： 发生在父子类中，方法名、参数列表必须相同，返回值范围小于等于父类，抛出的异常范围小于等于父类，访问修饰符范围大于等于父类；如果父类方法访问修饰符为private则子类就不能重写该方
     * 法。
     * @Param
     * @Return
     * @Exception
     */
    public Integer add(int a, String b) {
        return 0;
    }

    public int add(int a, String b, String c) {
        return 0;
    }

    public static  void main(String[] args) {
        List<String> str = new ArrayList<String>();
        Map<String,String> map = new HashMap<String,String>();
        Map<String,String> table = new Hashtable<String, String>();
    }
}
