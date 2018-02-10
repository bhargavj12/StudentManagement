package com.bhargav.student.controllers;

import com.bhargav.student.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bhargav on 2/8/2018.
 */
@RestController
public class StudentManagementController {

    @Autowired
    Student student;

    @RequestMapping("/add")
    public Student studentEntry(){
        student.setDepartment("Cse");
        student.setName("bhargav");
        student.setRollNum(55);
        return student;
    }


}
