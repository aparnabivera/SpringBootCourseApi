package io.phoenix.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

    public static void main(String[] args ){

        SpringApplication.run(CourseApiApp.class, args);//create servlet container and host this application in servelet container and me this available
    }

}
