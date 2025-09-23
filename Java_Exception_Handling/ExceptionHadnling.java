/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myprojrct;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author A-2
 */
public class ExceptionHadnling {
     //Arithmetic Exception via method
    static void calculate (int a, int b) {
        try {
            int result = a/b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
          e.printStackTrace();
        }
        System.out.println("Arithmetic Exception validated");
    }
    
    // Null Point Exception 
     static void nullPoint (String name) {
        try {
            String s = name;
            s.length();
            System.out.println("Length: " + s.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        } catch (Exception e) {
          System.out.println("Null Pointer Exception: " + e.getMessage());
        }
        System.out.println("Null Exception validated");
    } 
     
    // Array out of bound Exception 
     static void arrayExp (int [] arr) {
        try {
            System.out.println(arr[5]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array ot of bound Exception: " + e.getMessage());
        } catch (Exception e) {
          System.out.println("Array ot of bound Exception: " + e.getMessage());
        }
        System.out.println("Array Exception validated");
    } 
     
    // String out of bound Exception 
     //unfinished
//     static void stringExp (String name) {
//        try {
//            String str = name;
//            System.out.println(arr[5]);
//            
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("String out of bound Exception: " + e.getMessage());
//        } catch (Exception e) {
//          System.out.println("String out of bound Exception: " + e.getMessage());
//        }
//        System.out.println("String Exception validated");
//    } 
     
    // String out of bound Exception 
     static void numberExp (String num) {
        try {
            int x = Integer.parseInt(num);
            System.out.println("NUmber: " + x);
            
        } catch (NumberFormatException e) {
            System.out.println("Number format Exception: " + e.getMessage());
        } catch (Exception e) {
           System.out.println("Number format Exception: " + e.getMessage());
        }
        System.out.println("Number Exception validated");
    } 
     
    // Class Exception 
//     static void classExp (int num) {
//        try {
//            Object obj = new Integer(5);
//            String s = (String) obj;
//            System.out.println("Class: " + s);
//            
//        } catch (ClassCastException e) {
//            System.out.println("Class format Exception: " + e.getMessage());
//        } catch (Exception e) {
//           System.out.println("Class format Exception: " + e.getMessage());
//        }
//        System.out.println("Class Exception validated");
//    } 
     
    public static void customThrowExample (int age) {
            throw new IllegalArgumentException("Age must be positive");
        }
     
    // Class Exception 
     static void IOExp() {
        try {
            BufferedReader reader = new BufferedReader (new FileReader("nonexistent.txt"));
            reader.readLine();
            
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        } catch (Exception e) {
           System.out.println("IO Exception: " + e.getMessage());
        }
        System.out.println("IO Exception validated");
    } 
    
    public static void main(String[] args) {
        
        //Arithmetic Exception
        try {
            int result = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        //Arithmetic Exception
        calculate(10,0);
        System.out.println("");
        
        //Null point Exception via method
        nullPoint(null);
        System.out.println("");
        
        //Array Exception via method
        int [] arr = new int [3];
        arr [0] = 1;
        arr [1] = 4;
        arr [2] = 5;
        arrayExp(arr);
        System.out.println("");
        
        //Number format
        numberExp ("Fahad");
        
        System.out.println("");
        //Class Cast
//        classExp (5);
        System.out.println("");
        
        //IO exception
        IOExp();
        
//        customThrowExample (8);
    }
}
