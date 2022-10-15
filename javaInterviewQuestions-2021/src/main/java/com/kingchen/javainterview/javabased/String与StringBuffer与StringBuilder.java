package com.kingchen.javainterview.javabased;

public class String与StringBuffer与StringBuilder {
    public static void main(String[] args){

        /**
         *  @author: 熊猫煮茶
         *  @Date: 2022/2/16 21:00
         *  @Description:
         * String是final修饰的，不可变，每次操作都会产生新的String对象
         * StringBuffer和StringBuilder都是在原对象上操作
         * StringBuffer是线程安全的，StringBuilder线程不安全的
         * StringBuffer方法都是synchronized修饰的
         * 性能：StringBuilder > StringBuffer > String
         * 场景：经常需要改变字符串内容时使用后面两个
         * 优先使用StringBuilder，多线程使用共享变量时使用StringBuffer
         */
        String str = new String();
        str = "lxn";
        str = str + "cjx";

        StringBuffer stringBuffer = new StringBuffer();

        StringBuilder stringBuilder = new StringBuilder();
    }
}
