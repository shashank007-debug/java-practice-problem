package com.xworkz.sortArray;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        Integer[] arr = {10, 20 , 30, 40, 50, 60, 70, 80, 90, 99};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("[ ");
        for(int number : arr){
            System.out.print(" "+number+", ");
        }
        System.out.print(" ]");
    }
}
