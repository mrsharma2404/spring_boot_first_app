package com.example.spring_boot_first_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.spring_boot_first_app")
public class SpringBootFirstAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFirstAppApplication.class, args);
    }
}
