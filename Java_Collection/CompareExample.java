/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author A-2
 */

class student2 {
    String name;
    int age;

    public student2(String name, int id) {
        this.name = name;
        this.age = age;
    }
    

    @Override
    public String toString() {
        return "student2{" + "name=" + name + ", age=" + age + '}';
    }
    
      
    
}
public class CompareExample {
    public static void main(String[] args) {
        
        List <student2> stu2 = new ArrayList<>();
        stu2.add(new student2("Fahad", 25));
        stu2.add(new student2("Ryhan", 28));
        stu2.add(new student2("Reyad", 27));
        stu2.add(new student2("Sakib", 26));
        
        Collections.sort(stu2, (student2 s1, student2 s2) -> Integer.compare(s1.age, s2.age)); //integer compare
        System.out.println("---------" + stu2);
        Collections.sort(stu2, (student2 s1, student2 s2) -> s1.name.compareTo(s2.name)); // String compare
        System.out.println("---------" + stu2);
        
        
    }
 
}
