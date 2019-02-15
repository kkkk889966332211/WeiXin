package com.school.student_leave.controller;


import com.school.student_leave.bean.Leave;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;
import java.util.HashMap;
@RestController
public class DeleteController {
    private final Map<String,Object> params=new HashMap<String,Object>();

    @DeleteMapping("/del")
    public Object del(String sno){
        params.clear();
        params.put("sno",sno);
        return params;
    }

}
