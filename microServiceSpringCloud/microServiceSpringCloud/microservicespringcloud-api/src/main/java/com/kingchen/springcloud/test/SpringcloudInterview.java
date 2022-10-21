package com.kingchen.springcloud.test;


/**
 *  @author: 熊猫煮茶
 *  @Date: 2021/8/27 17:02
 *  @Description:Java软件开发面试题
 */
public class SpringcloudInterview {

    public static void main(String[] args){
        //1. Java中 == 和 equals 的区别
        javeInterview1();

    }


    public static void javeInterview1(){
        /**
         *  1. Java中 == 和 equals 的区别
         *  针对引用数据类型：
         *  ①当使用 == 比较的时候，比较的是 他们在内存中的存放地址
         *  ②当使用 equals 比较时，这个方法的初始行为是比较对象在堆内存中的地址，
         *  但在一些诸如String,Integer,Date类中把Object中的这个方法覆盖了（相当于重写了equals方法），作用被覆盖为比较内容是否相同，
         *  从而进行的是内容的比较，而不再是地址的比较。当然，基本类型是进行值的比较。
         *
         *  简单来说，"=="比较的是地址，equals比较的是地址内的内容。
         */
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = str2;
        String str4 = "hello";
        System.out.println("str1 == str2 :" + (str1 == str2));
        System.out.println("str1 == str4 :" + (str1 == str4));
        System.out.println("str1 == str3 :" + (str1 == str3));
        System.out.println("str2 == str3 :" + (str2 == str3));

        System.out.println("str1 equals str3 :" + (str1.equals(str3)));
        System.out.println("str2 equals str3 :" + (str2.equals(str3)));
        System.out.println("str1 equals str4 :" + (str1.equals(str4)));

    }

    public  static void javeInterview2(){

    }
}
