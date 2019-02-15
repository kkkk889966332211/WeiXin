package com.school.student_leave.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PostController {
    /*功能描述：
    * 输入账号和密码*/
    private final Map<String,Object> params=new HashMap<String, Object>();

    @RequestMapping("/login")
    public Object login(String username,String password){
        params.clear();
        params.put("username",username);
        params.put("password",password);
        return params;
    }

}
