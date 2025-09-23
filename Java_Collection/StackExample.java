
package CollectionExample;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author A-2
 */



public class StackExample {

    public static void main(String[] args) {

        //stack
        Stack <String> stack  = new Stack<>();
        
        stack.push("A");
        stack.push("B");
        stack.push("C");
        
        System.out.println("Stack: " + stack);
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        
        System.out.println("-------------------------");
        
    }
}

