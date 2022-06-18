package com.example.advertisingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient

@SpringBootApplication
public class AdvertisingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvertisingServiceApplication.class, args);
    }

}
