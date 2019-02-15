package com.school.student_leave;

import com.school.student_leave.bean.StudentState;
import com.school.student_leave.bean.Leave;
import com.school.student_leave.repository.StateRepository;
import com.school.student_leave.repository.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@ServletComponentScan
@EnableScheduling
@RestController
public class StudentLeaveApplication {


    public static void main(String[] args) {
        SpringApplication.run(StudentLeaveApplication.class, args);
    }
}
