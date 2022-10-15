package com.kingchen.javainterview.javabased;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class interviewQuestions {
    public static void main(String[] args){
        //定义一个List，插入100个随机数字。对该List进行去重，并按照从小到大排序。（去重和排序不允许使用list自带方法，用单个元素操作实现）
        List<Integer> list = new ArrayList<Integer>();
        int temp = 100;
        for(int i=0;i<temp;i++ ){
            list.add((int)Math.round(Math.random()*100));
        }
        System.out.println("集合元素"+list.toString());
        //去重
        for(int i=0;i<temp;i++ ){
            for(int j=i+1;j<temp;j++){
                int a = list.get(i);
                int b = list.get(j);
                if(a==b){
                    list.remove(j);
                    j--;
                    temp--;
                }else if(a>b){
                    list.set(j,a);
                    list.set(i,b);
                }
            }
        }
        System.out.println("去重排序后list："+list.toString());

        //Java中递归实现1 2 3 4 …. 100
        int number = 100;
        int total = getSum(number);
        System.out.println("递归后总数为：" + total);

        String str1 = "abc,def,ghi";
        String str2 = "adc";
        System.out.println("比较后数值：" + str1.indexOf(str2));


        //如下表,请用一条sql写出，选出表中NAME相同的记录大于等于3条的对应ID集合
        //表T
        //ID NAME
        //1 A
        //2 B
        //3 B
        //4 B
        //5 C
        //6 D
        //7 D
        //8 D
        
    }

    public static int getSum(int number){
        if (number==1){
            return 1;
        }else{
            return number + getSum(number-1);
        }
    }
}