package com.school.student_leave.repository;

import com.school.student_leave.bean.StudentState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<StudentState,String> {
    List<StudentState> findAll();
    List<StudentState> findByState(String State);
    StudentState findBySno(String sno);
    StudentState save(StudentState state);
}
