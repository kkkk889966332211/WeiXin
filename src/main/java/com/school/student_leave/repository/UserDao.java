package com.school.student_leave.repository;


import com.school.student_leave.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.rowset.JdbcRowSet;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(User user){
        jdbcTemplate.update("insert into user value (?,?)",user.getUsername(),user.getPassword());
    }
}
