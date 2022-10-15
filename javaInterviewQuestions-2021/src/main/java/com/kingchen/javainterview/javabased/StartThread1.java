package com.kingchen.javainterview.javabased;


/**
 *  @author: 熊猫煮茶
 *  @Date: 2021/9/23 22:46
 *  @Description:创建线程的方式一：1.继承Thread类，重新run方法；2.启动线程：创建子类对象+调用start()方法
 */
public class StartThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("戳妮");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("小熊熊");
        StartThread1 startThread1 = new StartThread1();
        startThread1.start();
        System.out.println("熊猫煮茶");
        startThread1.wait();
    }
}
