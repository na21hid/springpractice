package com.project.main.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "khodafez")
public class GoodByeRepository implements Repository {
    @Override
    public void printAll() {

        System.out.println("Goodbye goodbye bacheha");
    }
}
