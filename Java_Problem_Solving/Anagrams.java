/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolving;

import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author A-2
 */
public class Anagrams {
    public static void main(String[] args) {
        System.out.println("Input two words: ");
        Scanner input = new Scanner(System.in);
        
        String x = input.nextLine();
        String y = input.nextLine();
        
        if (x.length()== y.length()){
            char [] arr1 = x.toCharArray();
            char [] arr2 = y.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
            System.out.println("TRUE");
            } else {
            System.out.println("FALSE");
            }
        } else {
            System.out.println("FALSE");
        }
    }
}
