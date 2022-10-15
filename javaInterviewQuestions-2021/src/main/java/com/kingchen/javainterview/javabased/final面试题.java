package com.kingchen.javainterview.javabased;

public class final面试题 {
    //final修饰静态变量(类变量)，在声明的时候赋值或者在静态代码块中赋值,只能执行一次
    //final修饰实例变量(成员变量)，可以在非静态初始化块、声明该变量或者构造器中执行初始值，必须要赋值，否则会编译报错
    public final static int num;
    private final String str;
    static {
        num=5;
    }

    final面试题(){
        str="陈金雄";
    }

    public static void main(String[] args){
        //final修饰局部变量，可以在定义时指定默认值（后面的代码不能对变量再赋值），也可以不指定默认值，而在后面的代码中对final变量赋初值（仅一次）
        final String str2;
        str2 = "梁雪妮";
//        str2 = "liang";

        //final修饰基本数据类型和引用数据类型
        //基本数据类型：数值一旦在初始化之后便不能更改
        //数据类型引用：初始化之后便不能再让其指向另一个对象。但是引用的值是可变的

        final int[] iArr={1,2,3,4};
        int[] jArr = new int[4];
        iArr[2]=-3;//合法
        jArr = iArr;
        // iArr=null;//非法，对iArr不能重新赋值
        //final Person p = new Person(25); p.setAge(24);//合法 p=null;//非法
    }
}
