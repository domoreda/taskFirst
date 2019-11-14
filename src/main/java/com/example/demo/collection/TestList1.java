package com.example.demo.collection;

import java.util.ArrayList;
import java.util.List;

/*
把如下元素存入List集合
“aaa” “bbb” “aaa” “abc”“xyz” “123” “xyz”去掉重复元素
 */
public class TestList1 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("abc");
        list.add("xyz");
        list.add("123");
        list.add("xyz");
        System.out.println("去重前： " + list);
        List<String> list1 = new ArrayList<String>();
        for (int i= 0; i < list.size();i++){
            //遍历list，如果此元素没有相同的元素，则将它加入到list1中
            String s = list.get(i) ;
            if(!list1.contains(s) )
                list1.add(s);
        }
        System.out.println("去重后： " +list1);

    }

}