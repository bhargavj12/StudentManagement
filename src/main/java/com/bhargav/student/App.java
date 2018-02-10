package com.bhargav.student;

import com.bhargav.student.controllers.StudentManagementController;
import com.bhargav.student.dao.StudentDAO;

/**
 * Created by Bhargav on 2/8/2018.
 */
public class App {

    public static void main(String[] args){

        StudentManagementController smc = new StudentManagementController();


        smc.studentEntry();


    }
}
