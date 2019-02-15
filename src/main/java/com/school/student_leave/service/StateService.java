package com.school.student_leave.service;

import com.school.student_leave.bean.StudentState;
import com.school.student_leave.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<StudentState> getAllState()
    {
        return stateRepository.findAll();
    }

    public StudentState SgetbySno(String sno)
    {
        return stateRepository.findBySno(sno);
    }

    public List<StudentState> SgetByState(String state)
    {
        return stateRepository.findByState(state);
    }

    public StudentState save(StudentState state){
        return stateRepository.save(state);
    }

    public void StateUpdate(StudentState state)
    {
        jdbcTemplate.update("update student_state set state=?",state.getState());
    }
}
