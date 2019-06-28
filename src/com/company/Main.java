package com.company;

import com.company.RobotUI.RobotUI;
import com.company.RobotUI.robotA;
import com.company.RobotUI.robotB;
import com.company.RobotUI.robotC;

import java.util.Random;


public class Main {

    public static void main(String[] args) {


        RobotUI robotC = new robotC();
        RobotUI robotA = new robotA();
        RobotUI robotB = new robotB();
        Random robot_choice = new Random();

                robotA.activity();
                robotB.activity();
                robotC.activity();


        int n = robot_choice.nextInt(12);
            n+=1;
            System.out.println(n);
        if (n>=1 && n<=3){
            System.out.println("robot A form is implemented");
}
        else if (n>=4 && n<=8){
            System.out.println("robot B form is implemented");
}
        else if (n>=9){
            System.out.println("robot C form is implemented");

    }


    }
}
