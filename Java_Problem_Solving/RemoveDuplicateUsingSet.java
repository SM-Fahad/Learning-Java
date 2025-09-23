/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author A-2
 */
public class RemoveDuplicateUsingSet {

    public static void main(String[] args) {
        Integer [] x = {1,2,3,5,7,9,3,4,3,3,3,5,4,6,7};
        int [] unique0 =  getUniqueArray(x);
        System.out.println("List: " + Arrays.toString(unique0));
        
        
        
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 1, 3, 1, 3, 4, 5, 6, 4, 9, 4);
        List<Integer> unique = uniqueArray(nums);
        System.out.println("Unique List: " + unique);

        List <String> str = Arrays.asList("ABC","XYZ","ABC","XYZ");
        List <String> unique2 = uniqueArray(str);
        System.out.println("Unique List: " + unique2);
    }

    public static <T> List<T> uniqueArray(List<T> x) {
        Set<T> set = new HashSet<>(x);
        return new ArrayList<>(set);
    }
    
    public static int [] getUniqueArray(Integer[] arr) {
        Set <Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        
        int [] result = new int [set.size()];
        int index = 0 ;
        for (int num : set) {
            result [index++] = num;
        }
        return result;
    }
}
