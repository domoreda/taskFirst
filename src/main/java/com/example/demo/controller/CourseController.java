package com.example.demo.controller;

import com.example.demo.entity.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/course")
public class CourseController {

    @GetMapping(value = "/show",produces = "application/json;charset=utf-8")
    public List<Course> show(){

        List<Course> list = new ArrayList<>();
        Course course_1 = new Course(2,"数学",55,"教学1");
        Course course_2 = new Course(3,"语文",55,"教学1");
        list.add(course_1);
        list.add(course_2);
        return list;
    }
}
//设置问题吗  刚不是说那个Recoll
//这个知识点有点懵
//看来自己理解的都是错的
//！！！！！！！！
//那估计是啥都不会
//嗯嗯 得看
//给今晚布置点任务
//对了，GIT一直没用过/