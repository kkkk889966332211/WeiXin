package com.school.student_leave.service;

import com.school.student_leave.bean.Student;
import com.school.student_leave.bean.StudentState;
import com.school.student_leave.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private StudentRepository repository;

    public List<Student> getAll(){
        return repository.findAll();
    }

    public Student getBySno(String sno){
        return repository.findBySno(sno);
    }

    public Student getByName(String sname){
        return repository.findBySname(sname);
    }

    public List<Student> getBySdept(String Sdept){
        return repository.findBySdept(Sdept);
    }

}
