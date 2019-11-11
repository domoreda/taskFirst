package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController //定义当前类为接口类
@RequestMapping("/user")
public class UserController {
    // 实现一个简单的接口类   restController=controller+ @ResponseBody(把当前对象序列化，进行网络传输)
    //    /user/show
    @GetMapping(value = "/show",produces = "application/json;charset=utf-8")
    public Map<String,Integer> show(){

        List<Course> course =new ArrayList<Course>();

        Course course_1 = new Course();
        course_1.setCourseName("数学");
        course_1.setcount(55);
        course_1.setID(1);
        course_1.setPlace("教学1");
        Course course_2 = new Course();
        course_2.setCourseName("语文");
        course_2.setcount(55);
        course_2.setID(1);
        course_2.setPlace("教学1");
        Course course_3 = new Course();
        course_3.setCourseName("数学");
        course_3.setcount(45);
        course_3.setID(1);
        course_3.setPlace("教学1");

        course.add(course_1);
        course.add(course_2);
        course.add(course_3);

        // 数学:100
        // 语文:55 key :          value=get(key)
        Map<String,Integer> map = new HashMap<>();
        // 第一种for循环  //map集合K值不能重复，所以需要判断是否存在相同K值
        for(int i=0;i<course.size();i++){

        }
        // 第二种 迭代
        for(Course course1:course){
            if(map.containsKey(course1.getCourseName() ) ){
                int count = map.get(course1.getCourseName())  ;
                int count1 = course1.getCount() + count;
                map.put(course1.getCourseName() ,count1 );
            }
            else
                map.put(course1.getCourseName() ,course1.getCount() );

        }
        return map;


    }
}
