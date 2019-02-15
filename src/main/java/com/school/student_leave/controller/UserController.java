package com.school.student_leave.controller;


import com.school.student_leave.bean.User;
import com.school.student_leave.service.UserserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserserviceImpl userservice;

    @RequestMapping("/save")
    public String save(String name,String word){
        User user =new User(name,word);
        userservice.save(user);
        return "save sucessfully!";
    }
}
