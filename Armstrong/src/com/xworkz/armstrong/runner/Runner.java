package com.xworkz.armstrong.runner;

import com.xworkz.armstrong.internal.CheckArmstrong;
import com.xworkz.armstrong.internal.CheckPalindrome;

public class Runner {
    public static void main(String[] args) {
        int num = 252;
        CheckArmstrong checkArmstrong = new CheckArmstrong();
        System.out.println(checkArmstrong.isArmstrong(num));
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        System.out.println(checkPalindrome.isPalindrome(252));
    }
}
