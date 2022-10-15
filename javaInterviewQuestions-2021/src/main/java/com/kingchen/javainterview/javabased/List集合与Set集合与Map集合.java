package com.kingchen.javainterview.javabased;

import java.util.*;

public class List集合与Set集合与Map集合 {

    public static void main(String[] args){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new Vector<>();

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();
        Set<String> set3 = new LinkedHashSet<>();

        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new TreeMap<>();
        Map<String,String> map3 = new Hashtable<>();

        list1.add("test1");
        list1.add("test2");
        System.out.println("&操作结果：" + (15 & 1));

        set1.add("1");
        set1.iterator();

        System.out.println(("test1".hashCode()) ^ ("test1".hashCode() >>> 16));

//        int   MAX_VALUE = 10;
//        int MAX_ARRAY_SIZE = MAX_VALUE + (MAX_VALUE >> 1);
//
//        float DEFAULT_LOAD_FACTOR = 0.75f;
//        System.out.println("长度:"+ DEFAULT_LOAD_FACTOR);
//        set1.add("1");
//        set1.add("2");
//        set1.add("3");
//
//        Iterator<String> it = set1.iterator();
//        while(it.hasNext()){
//            System.out.println("第" + it.next() + "个值");
//        }
//
//        int n = 16 - 1;
//        n |= n >>> 1;
//        n |= n >>> 2;
//        n |= n >>> 4;
//        n |= n >>> 8;
//        n |= n >>> 16;
//        System.out.println("值是多少" + ((n < 0) ? 1 : (n >= (1 << 30)) ? (1 << 30) : n + 1));
//
//
//        //转换为小写
//        String str = "https://666...".toLowerCase();
//        String regex = "^((https|http|ftp|rtsp|mms)?://)"  //https、http、ftp、rtsp、mms
//                + "?(([0-9a-z_!~*'().&=+$%-]+: )?[0-9a-z_!~*'().&=+$%-]+@)?" //ftp的user@
//                + "(([0-9]{1,3}\\.){3}[0-9]{1,3}" // IP形式的URL- 例如：199.194.52.184
//                + "|" // 允许IP和DOMAIN（域名）
//                + "([0-9a-z_!~*'()-]+\\.)*" // 域名- www.
//                + "([0-9a-z][0-9a-z-]{0,61})?[0-9a-z]\\." // 二级域名
//                + "[a-z]{2,6})" // first level domain- .com or .museum
//                + "(:[0-9]{1,5})?" // 端口号最大为65535,5位数
//                + "((/?)|" // a slash isn't required if there is no file name
//                + "(/[0-9a-z_!~*'().;?:@&=+$,%#-]+)+/?)$";
//        boolean result = str.matches(regex);
//        System.out.println(result);
    }
}
