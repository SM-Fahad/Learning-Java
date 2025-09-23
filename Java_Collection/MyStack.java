/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionExample;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author A-2
 */
class MyStack {
    private List <T> elements = new ArrayList<>();
    
    public void push (T item) {
        elements.add(item);
    }
    public T pop(){
    if (elements.isEmpty()) {
        throw new EmptyStackException();
    }
    return elements.remove(elements.size() - 1);
    }
    public T peek() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();
        }
       return elements.get(elements.size() - 1);
    }

    @Override
    public String toString() {
        return "MyStack{" + "elements=" + elements + '}';
    }

    public static void main(String[] args) {
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

    private static class T {

        public T() {
        }
    }
    
}
