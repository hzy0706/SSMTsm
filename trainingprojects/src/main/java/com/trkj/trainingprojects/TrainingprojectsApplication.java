package com.trkj.trainingprojects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TrainingprojectsApplication {
    public static void main(String[] args) {
        SpringApplication.run(TrainingprojectsApplication.class, args);
    }
}
