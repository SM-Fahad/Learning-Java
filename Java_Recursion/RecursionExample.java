/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author A-2
 */
public class RecursionExample {
    public static void main(String[] args) {
        printData(5);
    }
    
    static void printData(int num){
        System.out.println("Hello World " + num);
        printData(num);
    }
}
