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
public class BubbleSort2DArray {
    
    public static void main(String[] args) {
        int[][] arr = {
            {9, 2, 8, 4},
            {6, 7, 9, 5, 1},
            {1, 1, 9, 2, 4},
            {1, 7, 4, 6}
        };

        // Flatten the 2D array into a 1D array
        int totalLength = 0;
        for (int[] row : arr) {
            totalLength += row.length;
        }

        int[] flatArr = new int[totalLength];
        int index = 0;
        for (int[] row : arr) {
            for (int num : row) {
                flatArr[index++] = num;
            }
        }

        // Bubble Sort on the 1D array
        for (int i = 0; i < flatArr.length - 1; i++) {
            for (int j = 0; j < flatArr.length - 1 - i; j++) {
                if (flatArr[j] > flatArr[j + 1]) {
                    // Swap the elements
                    int temp = flatArr[j];
                    flatArr[j] = flatArr[j + 1];
                    flatArr[j + 1] = temp;
                }
            }
        }

        // Place the sorted numbers back into the 2D array
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = flatArr[index++];
            }
        }

        // Print the sorted 2D array
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}

