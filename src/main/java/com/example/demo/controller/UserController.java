package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController //定义当前类为接口类
@RequestMapping("/user")
public class UserController {
    // 实现一个简单的接口类   restController=controller+ @ResponseBody(把当前对象序列化，进行网络传输)
    //    /user/show
    @GetMapping("/show")
    public List<User> show(){
        List<User> result=new ArrayList<>();
        User user_1=new User(121,"test1","123456");
        User user_2=new User(122,"test2","123556");
        result.add(user_1);
        result.add(user_2);
        return result;
    }
}
