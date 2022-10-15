package com.kingchen.javainterview.javabased;


/**
 *  @author: 熊猫煮茶
 *  @Date: 2021/9/24 0:00
 *  @Description:创建线程的方式2:1.实现Runnable接口，重写run()方法;2.创建代理类对象，然后该对象调用start()方法启动线程
 */
public class StartThread2 implements Runnable{
    public void run() {
        System.out.println("戳妮");
    }

    public static void main(String[] args){
        StartThread2 startThread2 = new StartThread2();
        Thread thread = new Thread(startThread2);
        thread.start();
        System.out.println("小熊熊");
    }
}
