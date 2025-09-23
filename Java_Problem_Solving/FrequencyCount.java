/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author A-2
 */
public class FrequencyCount {
    public static void main(String[] args) {
        String str = "banana";
        Map <Character, Integer> f = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            f.put(c, f.getOrDefault(c, 0) + 1);
        } 
        System.out.println("Map"  + f);
    }
}
