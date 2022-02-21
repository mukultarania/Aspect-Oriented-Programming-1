package com.example;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    public Employee(){
        System.out.println("------------EMP---------");
    }
    public void study(){
        System.out.println("I am Exploring !!");
    }
}
