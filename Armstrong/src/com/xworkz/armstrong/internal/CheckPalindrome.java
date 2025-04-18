package com.xworkz.armstrong.internal;

public class CheckPalindrome {
    public boolean isPalindrome(int num){
        int original = num;
        int result = 0;
        int digit = 0;
        while(num != 0){
            digit = num % 10;
            result = result * 10 + digit;
            num /= 10;

        }
        return (original == result);

    }
}
