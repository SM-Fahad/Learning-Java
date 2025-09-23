/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionExample;

/**
 *
 * @author A-2
 */
public class GenericUtils {
    //Generic Method
    
    public static <F> void printArray (F[] array) {
        for (F item: array){
            System.out.print(item + " ");
        }
        System.out.println();
    } 
}
