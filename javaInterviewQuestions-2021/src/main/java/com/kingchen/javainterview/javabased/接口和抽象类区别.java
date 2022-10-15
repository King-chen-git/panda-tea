package com.kingchen.javainterview.javabased;

public abstract class 接口和抽象类区别 {

    /**
     *  @author: 熊猫煮茶
     *  @Date: 2022/1/25 7:15
     *  @Description:
     *  这道题的思路是先从总体解释抽象类和接口的基本概念，然后再比较两者的语法细节，最后再说两者的应用区别。
     *  比较两者语法细节区别的条理是：先从一个类中的构造方法、普通成员变量和方法（包括抽象方法），
     *  静态变量和方法，继承性等6个方面逐一去比较回答，接着从第三者继承的角度的回答，
     *  特别是最后用了一个典型的例子来展现自己深厚的技术功底。
     */


    /**
     *  @author: 熊猫煮茶
     *  @Date: 2022/1/25 7:25
     *  @Description:
     *  ①基本概念
     *  抽象类：使用abstract修饰的类都是抽象类，abstract类不能创建实例对象，
     *  含有abstract方法的类必须定义为abstract class，抽象类中的方法不必是抽象的；
     *  接口：使用interface修饰的类是接口，接口中的所有方法都必须是抽象的，
     *  接口中的方法定义默认为public abstract类型，接口中的成员变量类型默认为public static final
     */


    /**
     *  @author: 熊猫煮茶
     *  @Date: 2022/1/25 10:29
     *  @Description:
     *下面比较一下两者的语法区别：
     * 1.抽象类可以有构造方法，接口中不能有构造方法。
     *
     * 2.抽象类中可以有普通成员变量，接口中没有普通成员变量
     *
     * 3.抽象类中可以包含非抽象的普通方法，接口中的所有方法必须都是抽象的，不能有非抽象的普通方法。
     *
     * 4. 抽象类中的抽象方法的访问类型可以是public，protected和（默认类型,虽然
     *
     * eclipse下不报错，但应该也不行），但接口中的抽象方法只能是public类型的，并且默认即为public abstract类型。
     *
     * 5. 抽象类中可以包含静态方法，接口中不能包含静态方法
     *
     * 6. 抽象类和接口中都可以包含静态成员变量，抽象类中的静态成员变量的访问类型可以任意，但接口中定义的变量只能是public static final类型，并且默认即为public static final类型。
     *
     * 7. 一个类可以实现多个接口，但只能继承一个抽象类。
     */

    public abstract String test1();
//    public String test2();
}
