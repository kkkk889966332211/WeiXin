package com.school.student_leave.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name="lleave")
@Entity
@Data
public class Leave {
    @Id
    private String sno;
    private Date start_date;
    private Date end_date;
    private int days;
    private String place;
    private String reason;

}
