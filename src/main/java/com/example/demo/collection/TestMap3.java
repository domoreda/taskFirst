package com.example.demo.collection;

import java.util.*;

/*
案例2：已知 List<String> list = new ArrayList<String>();
list .add("张三丰,北京");
list .add("李四丰,上海");
list .add("王二小,北京");
list .add("小明,河北");
list .add("小毛,北京");
list .add("王五,北京");
要求：求出每个地区有多少人，都是谁？
例如： 北京 4人   张三丰 王二小 小毛 王五
 */
public class TestMap3 {

    public static void main(String[] args){

        List<String> list = new ArrayList<String>();
        list .add("张三丰,北京");
        list .add("李四丰,上海");
        list .add("王二小,北京");
        list .add("小明,河北");
        list .add("小毛,北京");
        list .add("王五,北京");
        Map<String,List<String>> mapList=new HashMap<>();
        // 第一步：循环list，以逗号进行分割字符串。
        for(String li:list ){
            String[] str = li.split(",");
            int count = 0;
            if(!mapList.containsKey(str[1])){
                List<String> list1=new ArrayList<>();
                list1.add(str[0]);
                mapList.put(str[1],list1);
            }else {
                List<String> oldList=mapList.get(str[1]);
                oldList.add(str[0]);
                mapList.put(str[1],oldList);
            }
        }

        for(Map.Entry<String,List<String>> entry:mapList.entrySet() ){
            String key=entry.getKey();
            List<String> value=entry.getValue();
            String name="";
            // 遍历list集合，得到里面的全部人的名字
            for(String s:value){
                name=name+" "+s;
            }
            System.out.println(key+"  "+value.size()+"人"+"  "+name);
        }

    }
}
