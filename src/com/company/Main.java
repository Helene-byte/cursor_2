package com.company;

import com.company.RobotUI.RobotUI;
import com.company.RobotUI.robotA;
import com.company.RobotUI.robotB;
import com.company.RobotUI.robotC;

import java.util.Random;


public class Main {

    private final static int FormA = 1;
    private final static int FormB = 2;
    private final static int FormC = 3;

    public static void main(String[] args) {

        Random robotChoice = new Random();
        int planetNumber = robotChoice.nextInt(3);

        RobotUI Form = null;
        if (planetNumber == FormA) {
            Form = new robotA();
        }
        if (planetNumber == FormB) {
            Form = new robotB();
        }
        if (planetNumber == FormC) {
            Form = new robotC();
        }

    }
}

