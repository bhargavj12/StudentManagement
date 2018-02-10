package com.bhargav.student.controllers;

import com.bhargav.student.dao.StudentDAO;

import java.util.Scanner;

/**
 * Created by Bhargav on 2/8/2018.
 */
public class StudentManagementController {

    public void studentEntry(){

        StudentDAO dao = new StudentDAO();

        System.out.println("Enter Student details in the format Roll-Number,Name,Department. Example: 001,John,CSE");

        Scanner input = new Scanner(System.in);

        String entry;



        entry = input.next();

        input.close();



        String candidate[] = entry.split(",");
        dao.setRollNum(Integer.valueOf(candidate[0]));
        dao.setName(candidate[1]);
        dao.setDepartment(candidate[2]);



        System.out.print(dao.toString());
    }


}
