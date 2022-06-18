package com.example.reviewservie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ReviewServieApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewServieApplication.class, args);
    }

}
