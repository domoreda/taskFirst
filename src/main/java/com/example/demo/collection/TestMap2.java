package com.example.demo.collection;

import java.util.HashMap;
import java.util.Map;

/*
1 分析以下需求，并用代码实现：
(1)统计每个单词出现的次数
(2)有如下字符串"If you want to change your fate I think you must come to the ujiuye to learn java"(用空格间隔)
(3)打印格式：
to=3
think=1
you=2
 */
public class TestMap2 {

    public static void main(String[] args){

//        定义字符串
        String str = "If you want to change your fate I think you must come to the ujiuye to learn java";
//        空格分隔
        String[] arr = str.split(" ");
        Map<String,Integer> map = new  HashMap<String,Integer>();
        for(String key:arr){
            if(!map.containsKey(key) ){
                map.put(key,1);
            }else{
                map.put(key,map.get(key)+1);
            }
        }
        System.out.println( "to = "+ map.get("to"));
        System.out.println( "think = "+ map.get("think"));
        System.out.println( "you = "+ map.get("you"));

    }
}
