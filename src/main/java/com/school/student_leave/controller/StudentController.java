package com.school.student_leave.controller;

import com.school.student_leave.bean.Student;
import com.school.student_leave.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping("/")
    public List<Student> getAll(){
        return service.getAll();
    }

    @RequestMapping("/getBySno")
    public Student getBySno(String sno){
        return service.getBySno(sno);
    }

    @RequestMapping("/getByName")
    public Student getByName(String sname){
        return service.getByName(sname);
    }

    @RequestMapping("/getBySdept")
    public List<Student> getBySdept(String Sdept){
        return service.getBySdept(Sdept);
    }

}
