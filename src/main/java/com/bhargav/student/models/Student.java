package com.bhargav.student.models;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by rohit on 2/10/2018.
 */

@Component

public class Student {
    private int rollNum;
    private String name;
    private String department;

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
