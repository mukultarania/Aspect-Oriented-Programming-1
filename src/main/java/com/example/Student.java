package com.example;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public Student(){
        System.out.println("------------STU ---------");
    }
    public int study(int x, int y) {
        System.out.println("I am in schooll and studying right now !!");
        return 500;
    }
    
    public String doSomething() {
        throw new MyException("Custom EXP");
    }

    public int rankOfVideo(int noOfView, int watchTime){
        System.out.println("Rank of Video is: ");
        return (noOfView*watchTime)-(noOfView-watchTime);
    }

}
