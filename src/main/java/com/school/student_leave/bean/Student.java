package com.school.student_leave.bean;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="student")
@Data
@Entity
public class Student implements Serializable{
    @Id
    @GeneratedValue
    private  String  sno;
    private  String sname;
    private String sdept;
    private int jno_1;
    private int jno_2;

}


