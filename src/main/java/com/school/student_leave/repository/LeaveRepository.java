package com.school.student_leave.repository;

import com.school.student_leave.bean.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaveRepository extends JpaRepository<Leave,String> {

    List<Leave> findAll();
    Leave findBySno(String sno);
    List<Leave> findByDays(int days);
    Leave save(Leave leave);
}
