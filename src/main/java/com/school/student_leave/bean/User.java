package com.school.student_leave.bean;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user")
@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private String Username;
    private String password;
    public User(String name,String word)
    {
        Username=name;
        password=word;
    }



}
