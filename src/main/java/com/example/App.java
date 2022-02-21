package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
        Student xs = con.getBean("student", Student.class);
        // xs.study(1, 2);
        // xs.doSomething();
        System.out.println(xs.rankOfVideo(1555, 1000));

        // Employee xe = con.getBean("employee", Employee.class);
        // xe.study();
    }
}
