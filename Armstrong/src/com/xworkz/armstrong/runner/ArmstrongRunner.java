package com.xworkz.armstrong.runner;

import com.xworkz.armstrong.internal.CheckArmstrong;

public class ArmstrongRunner {
    public static void main(String[] args) {
        int num = 253;
        CheckArmstrong checkArmstrong = new CheckArmstrong();
        System.out.println(checkArmstrong.isArmstrong(num));
    }
}
