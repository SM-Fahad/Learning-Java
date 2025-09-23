/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionExample;

import CollectionExample.GenericClass.Box;

/**
 *
 * @author A-2
 */
public class GenericTesting {
    public static void main(String[] args) {
        Integer [] intArr = {1,2,3,4};
        String [] strArr = {"Fahad","Reyad","Ryhan","Sakib"};
    
        GenericUtils.printArray(intArr);
        GenericUtils.printArray(strArr);
        
        
        //class testing
//        Box<Integer> intBox = new Box<>();
//        intBox.set(100);
//        System.out.println(intBox.get());
    }
    
}
