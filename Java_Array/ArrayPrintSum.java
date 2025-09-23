/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myprojrct;

import java.util.Arrays;

/**
 *
 * @author A-2
 */
public class ArrayPrintSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        
        System.out.println("Array: " + Arrays.toString(arr));
        
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr [i];
        }
        System.out.println("Sum: " + sum);
    }
}
