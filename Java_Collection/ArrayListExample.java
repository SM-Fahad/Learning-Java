
package CollectionExample;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author A-2
 */



public class ArrayListExample {

    public static void main(String[] args) {

        //crate and initialize
        ArrayList<String> lan = new ArrayList<>();

        lan.add("Java");
        lan.add("Python");
        lan.add("C++");

        System.out.println("Languages: " + lan);

        //add element in specific index
        lan.add(1, "JavaScript");
        System.out.println("After Adding Languages: " + lan);

        //access element
        System.out.println("Element at index 1: " + lan.get(1));

        //modify
        lan.set(3, "GO");
        System.out.println("After modify: " + lan);

        //remove
        lan.remove("Python");
        lan.remove(2);
        System.out.println("After removing: " + lan);

        //size check
        System.out.println("Size: " + lan.size());

        //contains
        System.out.println("Is it contains JAVA? " + lan.contains("Java"));

        //iterate - For loop
        System.out.println("For Loop: ");
        for (int i = 0; i < lan.size(); i++) {
            System.out.println(lan.get(i) + " ");
        }
        System.out.println("");

        //for-each
        System.out.println("For each");

        for (String lang : lan) {
            System.out.println(lang + " ");
        }
        System.out.println("");

        //foreach + lambda
        System.out.println("foreach + lambda");
        lan.forEach(x -> System.out.println(x + " "));
        System.out.println("");
        lan.forEach(x -> {
            System.out.println(x + " ");
            System.out.println("");
            System.out.println(x + " 50");
        });

        //array sort
        Integer[] arr = {4, 5, 1, 6, 4, 8, 4, 6, 9, 4, 3, 5};
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(num);
        System.out.println("Sorted Array: " + num);

        //sort in reverse
        Collections.reverse(num);
        System.out.println("Reserve: " + num);

        //sort in desending
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("Desending: " + num);

        //clone
        ArrayList<String> clone = (ArrayList<String>) lan.clone();
        System.out.println("Cloned List: " + clone);

        //clear
        clone.clear();
        System.out.println("Cloned List clear: " + clone);

        // convert to another array
        String[] langArr = lan.toArray(new String[0]);
        System.out.println("Converted to Array: " + Arrays.toString(langArr));

        //Nested ArrayList
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        matrix.add(num);
        ArrayList<Integer> arrr = new ArrayList<>(Arrays.asList(5, 5, 9));
        matrix.add(arrr);
        System.out.println("Matrix: " + matrix);

        //Custom Object in ArryList
        ArrayList<Student> stu = new ArrayList<>();
        stu.add(new Student(1, "Fahad"));
        stu.add(new Student(2, "Reyad"));
        stu.add(new Student(3, "Ryhan"));

        for (Student s : stu) {
            System.out.println("Student: " + s);
        }
        
        //isEmpty
        System.out.println("isCloned List empty: " + clone.isEmpty());
        
        //Sublist
        ArrayList <String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Kiwi", "Mango"));
        List<String> sub = fruits.subList(1, 4);
        System.out.println("Sublist: (1-3): " + sub);
        
        //Equals
        ArrayList <String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList <String> list2 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        System.out.println("Are list1 and list2 equals? :" + list1.equals(list2));
        
        
        
    }
}

class Student {

        private int id;
        private String name;

       public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "student{" + "id=" + id + ", name=" + name + '}';
        }

    }
