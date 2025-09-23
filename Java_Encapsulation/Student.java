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
public class Student {
    private int id,age;
    private String name, address, department;
    private LocalDate dob; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    
    public void displaydetails (){
        System.out.println("Stuent ID       : " + id);
        System.out.println("Student Name    : " + name);
        System.out.println("Student age     : " + age);
        System.out.println("Department      : " + department);
        System.out.println("Address         : " + address);
        System.out.println("Date of Birth   : " + dob);
    }
    
}
