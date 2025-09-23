/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IoExample;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author A-2
 */
public class IoExample {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        System.out.println("Enter Your name: ");
        String name = input.nextLine();
        
        System.out.println("Enter Your age: ");
        int age = input.nextInt();
        
        try {
            PrintWriter writer = new PrintWriter("C:\\Users\\A-2\\Desktop\\myData.txt");
            
            writer.println("User Information");
            writer.println("Name: " + name);
            writer.println("Age: " + age);
            
            writer.close();
            System.out.println("Data has been written");
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
