package com.school.student_leave.service;

import com.school.student_leave.bean.Leave;
import com.school.student_leave.repository.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LeaveService {
    @Autowired
    private LeaveRepository leaveRepository;

    public List<Leave> getLeave(){
        List<Leave> list=leaveRepository.findAll();
        return list;
    }

    public Leave findBySno(String sno){
        Leave l=leaveRepository.findBySno(sno);
        return l;
    }

    public List<Leave> findByDays(int days){
        List<Leave> list=leaveRepository.findByDays(days);
        return list;
    }

    public Leave save(Leave leave){
        return leaveRepository.save(leave);
    }

}
