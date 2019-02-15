package com.school.student_leave.service;

import com.school.student_leave.bean.User;
import com.school.student_leave.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserserviceImpl implements Userservice {
    @Autowired
    private UserDao userDao;
    @Override
    public void save(User user){
        userDao.save(user);
    }
}
