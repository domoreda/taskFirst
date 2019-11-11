package com.example.demo.entity;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.boot.SpringApplication;

import java.util.List;

/**
 * user对象实体
* */
public class User {

    private long ID;
    private String name;
    private String password;
    private List<Course> courses;
  // get和seu
    public void setID(long id) {
        this.ID = id;
    }
    public long getID(){
        return ID;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public User(){

    }

    public List<Course > getCourse() {
        return courses;
    }

    public void setCourse(List<Course> course) {
        this.courses = course;
    }

    public User(long ID,
                String name,
                String password,
                List<Course > courses){
        this.ID = ID;
        this.name = name;
        this.password = password;
        this.courses  = courses;
    }

}
