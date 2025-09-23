/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myprojrct;

import java.time.LocalDate;

/**
 *
 * @author A-2
 */
public class encapsulationExample {
    public static void main(String[] args) {
        Student stu = new Student(); 
        stu.setId(100);
        stu.setAge(20);
        stu.setName("Fahad");
        stu.setAddress("Dhaka, Bangladesh");
        stu.setDepartment("Biochemistry");
        stu.setDob(LocalDate.of(1998, 5, 15));
        
        
        System.out.println("Student Info    : ");
        System.out.println("Stuent ID       : " + stu.getId());
        System.out.println("Student Name    : " + stu.getName());
        System.out.println("Student age     : " + stu.getAge());
        System.out.println("Department      : " + stu.getDepartment());
        System.out.println("Address         : " + stu.getAddress());
        System.out.println("Date of Birth   : " + stu.getDob());
        
        System.out.println("");
        
        stu.displaydetails();
        
    }

    
    }
