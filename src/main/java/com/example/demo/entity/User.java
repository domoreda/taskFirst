package com.example.demo.entity;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.boot.SpringApplication;

/**
 * user对象实体
* */
public class User {

    private long ID;
    private String name;
    private String password;
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
    public User(long ID,
                String name,
                String password){
        this.ID = ID;
        this.name = name;
        this.password = password;
    }

}
