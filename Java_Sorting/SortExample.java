/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingExample;

import java.util.Arrays;

/**
 *
 * @author A-2
 */
public class SortExample {
    
    public static void main(String[] args) {
        int[] array = {1,5,6,89,4,2,6,7,6,1,3,9,4,3,5};
        
//        bubbleSort(array);

//        insertionSort(array);

        selectionSort(array);

//        System.out.println("Sorted Array: " + Arrays.toString(x));
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
   
    
    //bubble sort
    public static int [] bubbleSort(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr [j] > arr [i]) {
                    int temp = arr [j];
                    arr[j] = arr[i];
                    arr [i] = temp;
                }
            }
        }
        return arr;
    }
    
    public static void insertionSort (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr [i];
//            System.out.println("key " + key);
            int j = i - 1;
//            System.out.println("j" + j);
            
            while (j >= 0 && arr[j] > key) {
                arr [j+1] = arr [j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    public static void selectionSort (int [] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[i]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
