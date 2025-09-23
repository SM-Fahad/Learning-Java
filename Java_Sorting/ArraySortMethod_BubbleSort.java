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
public class ArraySortMethodBubbleSort {
    public static int [] sortArray (int [] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num [i] > num [j]) {
                int temp = num [j];
                num [j] = num [i];
                num[i] = temp;
                }
            }
        }
        return num;
    }
    
    public static void main(String[] args) {
         int[][] arr = {
            {9, 2, 8, 4},
            {6, 7, 9, 5, 1},
            {1, 1, 9, 2, 4},
            {1, 7, 4, 6}
        };
        for (int[] array : arr) {
            sortArray(array);
            System.out.println(Arrays.toString(array));
        }
        
         //Using Arrays sort
        for (int[] array : arr) {
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        }
    }
}



       