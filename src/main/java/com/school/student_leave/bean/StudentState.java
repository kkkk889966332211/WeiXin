package com.school.student_leave.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="StudentState")
@Entity
@Data
public class StudentState {
    @Id
    @GeneratedValue
    private String sno;
    private String state;
    private String note;


}
