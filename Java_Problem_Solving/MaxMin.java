/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myprojrct;

import java.util.Scanner;

/**
 *
 * @author A-2
 */
public class MaxMin {

    public static void main(String[] args) {
        System.out.println("Enter Three Numbers: ");
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        input.close();
        int min = Math.min(x, y);
        if (min<z) {
            System.out.println("Min:  " + min);
        } else {
            min = z;
            System.out.println("Min:  " + min);
        }
        
        int max = Math.max(x, y);
        if (max>z) {
            System.out.println("Max:  " + max);
        } else {
            max = z;
            System.out.println("Max:  " + max);
        }
        
    }

}
