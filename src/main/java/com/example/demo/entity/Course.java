package com.example.demo.entity;

import java.io.Serializable;

public class Course{

    private long ID;
    private String courseName;
    private int count;
    private String place;

    public void setID(long id){
        this.ID = id;
    }
    public long getID(){
        return ID;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setcount(int count){
        this.count = count;
    }
    public int getCount(){
        return count;
    }
    public void setPlace(String place){
        this.place = place;
    }
    public String getPlace(){
        return place;
    }
    //构造函数无参 想起来了
    public Course(){

    }
    public Course(long ID,
                  String courseName,
                  int count,
                  String place){
        this.ID = ID;
        this.courseName = courseName;
        this.count = count;
        this.place = place;
    }
}
