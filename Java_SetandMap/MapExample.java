/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetandMap;

import java.util.*;
import java.util.Map;


/**
 *
 * @author A-2
 */
public class MapExample {
    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap<>();
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");
        map.put(5, "Orange");
        
        System.out.println(map.values());
        System.out.println(map.keySet());
        
        System.out.println("Iterating Hashmap......");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
       
        Map <String, Integer> scores =  new HashMap<>();
        
        scores.put("Fahad", 50);
        scores.put("Raihan", 60);
        scores.put("Sakib", 100);
        scores.put("Reyad", 59);
        scores.put("Arif", 69);
        // get value by key
        System.out.println("Fahad's Score: " + scores.get("Fahad"));
        
        // check key or value
        System.out.println("Fahad exists: " + scores.containsKey("Fahad"));
        
        // remove an entry
        scores.remove("Arif");
        
        // replace value
        scores.replace("Fahad", 100);
        
        // add if key is absent
        scores.putIfAbsent("Pagla Sujon", 0);
        
        System.out.println("\n All entreies");
        for (Map.Entry f : scores.entrySet()) {
            System.out.println(f.getKey() + " => " + f.getValue());
        }
        
        // Loop through keys
        System.out.println("\n Keys: " + scores.keySet());
        
        // Loop through values
        System.out.println("\n Vales: " + scores.values());
        
        // map size
        System.out.println("\n Keys: " + scores.size());
        
        // clear
        scores.clear();
        
        System.out.println("Is map Empty after clear? " + scores.isEmpty());
        
    }
}
