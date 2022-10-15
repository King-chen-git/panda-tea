package com.kingchen.javainterview.javabased;


import java.text.SimpleDateFormat;
import java.util.*;

/**
 *  @author: 熊猫煮茶
 *  @Date: 2021/8/27 17:02
 *  @Description:Java软件开发面试题
 */
public class equals比较 {

    public static void main(String[] args){
        //1. Java中 == 和 equals 的区别
        javeInterview1();
        

    }


    public static void javeInterview1(){
        /**
         *  1. Java中 == 和 equals 的区别
         *  针对引用数据类型：
         *  ①当使用 == 比较的时候，比较的是栈中的值，如果是基本数据类型，就比较值，如果是引用数据类型，栈中存放的是引用数据类型在堆中的地址，所以比较的是存放地址
         *  ②当使用 equals 比较时，Object的equals方法中是采用==来进行比较的，
         *  但在一些诸如String,Integer,Date类中把equals这个方法覆盖了（相当于重写了equals方法），作用被覆盖为比较内容是否相同，
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


        String hashStr1 = "陈金雄";
        String hashStr2 = "梁雪妮";
        System.out.println("陈金雄的hashCode值：" + hashStr1.hashCode());
        System.out.println("梁雪妮的hashCode值：" + hashStr2.hashCode());

        System.out.println("类变量：" + final面试题.num);


        Object obj = new Object();



        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();

        //过去七天
        c.setTime(new Date());
        c.add(Calendar.DATE, - 14);
        Date d = c.getTime();
        String day = format.format(d);
        System.out.println("过去七天："+day);

        StringJoiner stringJoiner = new StringJoiner(",");

    }

    public  static void javeInterview2(){

    }
}
