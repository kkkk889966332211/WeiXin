package com.school.student_leave.controller;


import com.school.student_leave.bean.StudentState;
import com.school.student_leave.repository.StateRepository;
import com.school.student_leave.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class StateController {
    @Autowired
    private StateService stateService;

    @RequestMapping("/State")
    public List<StudentState> getAllState()
    {
        List<StudentState> list=stateService.getAllState();
        return list;
    }

    @RequestMapping("/State/getBySno")
    public StudentState SgetbySno(String sno)
    {
        StudentState s=stateService.SgetbySno(sno);
        return  s;
    }

    @RequestMapping("/State/getByState")
    public List<StudentState> SgetByState(String state)
    {
        List<StudentState> list=stateService.SgetByState(state);
        return  list;
    }

    @RequestMapping("/State/updateState")
    public void updateOne(@RequestParam("state") String state) {
        StudentState student = new StudentState();
        student.setState(state);
        stateService.save(student);//实现数据更新
    }
}
