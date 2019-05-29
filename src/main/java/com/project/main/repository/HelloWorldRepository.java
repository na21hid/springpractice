package com.project.main.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "salam")
public class HelloWorldRepository implements Repository {
    @Override
    public void printAll() {
        System.out.println("Hello Helllo guys");
    }
}

