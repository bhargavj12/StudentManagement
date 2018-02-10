package com.bhargav.student;

import com.bhargav.student.controllers.StudentManagementController;
import com.bhargav.student.dao.StudentDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

/**
 * Created by Bhargav on 2/8/2018.
 */
@SpringBootApplication
public class App {

    public static void main(String[] args){
//        System.getProperties().put( "server.port", 8090 );
        SpringApplication.run(App.class, args);

    }
}
