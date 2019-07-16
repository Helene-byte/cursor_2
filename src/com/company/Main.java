package com.company;

import com.company.RobotUI.RobotUI;
import com.company.RobotUI.RobotA;
import com.company.RobotUI.RobotB;
import com.company.RobotUI.RobotC;

import java.util.Random;


public class Main {

    private final static int Form_A = 1;
    private final static int Form_B = 2;
    private final static int Form_C = 3;


    public static void main(String[] args) {

        Random robotChoice = new Random();
        int planetNumber = robotChoice.nextInt(3)+1;

        if (planetNumber == Form_A) {
            RobotA robotA = new RobotA();
            robotA.act();
        }
        if (planetNumber == Form_B) {
            RobotB robotB = new RobotB();
            robotB.act();
        }
        if (planetNumber == Form_C) {
            RobotC robotC = new RobotC();
            robotC.act();
        }

    }
}

