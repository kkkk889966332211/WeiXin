package com.school.student_leave.repository;

import com.school.student_leave.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student,String>{
    List<Student> findAll();
    Student findBySno(String sno);
    List<Student> findBySdept(String sdept);
    Student findBySname(String sname);
    //List<Student> findByInstructor(String jno_1);

}
