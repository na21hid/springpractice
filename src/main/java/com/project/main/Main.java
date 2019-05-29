package com.project.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.project.*")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
