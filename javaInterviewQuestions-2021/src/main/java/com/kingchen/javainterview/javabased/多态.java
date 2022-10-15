package com.kingchen.javainterview.javabased;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 多态 {

    /**
     *  @author: 熊猫煮茶
     *  @Date: 2022/2/15 21:28
     *  @Description:多态
     *  多态概念：基于对象所属类的不同，外部对同一个方法的调用，实际执行的逻辑不同
     *  多态三大条件：继承（继承对象或者接口）、重写、父类引用指向子类对象（即：父类类型 变量名 = new 子类类型()）
     *  多态的作用：可以降低代码的耦合度，提高代码的扩展性，增强代码的健壮性
     *
     */




    /**
     *  @author: 熊猫煮茶
     *  @Date: 2022/2/15 21:47
     *  @Description:多态以集合为例子
     * ArrayList是List的数组实现，它的特点是是查询快，增删慢；而LinkedList是List的链表实现，它的特点是增删快，查询慢
     * ArrayList、LinkedList都是implements List<E>
     * 无法调用子类特有的功能：多态中调用方法时是调用子类重写的方法，如果我们的某个模块需要更换，我们只需要再写一个子类并做方法重写，然后进行多态调用，原来的类还能保留，当又需要之前的功能时直接进行修改即可
     */
    List<String> list = new ArrayList<String>();
    List<String> list2 = new LinkedList<String>();
    /**
     *  @author: 熊猫煮茶
     *  @Date: 2022/2/15 21:47
     *  @Description:多态以方法参数为例子
     *  前面的例子可能并不能太好的体现多态的好处，其实实际应用中使用的最多的是——将多态运用到方法参数中，比如我写添加功能，
     *  它们的参数分别是：int，String，long，这时我可能需要定义三个add（int）、add（String）、add（long)方法，
     *  这样难免显得累赘。这时可能定义一个add（Object obj），根据多态的父类引用指向子类对象，这里的add（Object obj）
     *  就可以分别接受int，String，long。
     */
}
