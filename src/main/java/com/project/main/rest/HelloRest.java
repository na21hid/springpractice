package com.project.main.rest;

import com.project.main.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HelloRest {


        @Autowired
        @Qualifier(value = "salam")
        Repository repository;


        @PostConstruct
        public void amir(){

            repository.printAll();
        }
}
