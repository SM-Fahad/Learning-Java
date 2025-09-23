
package CollectionExample;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author A-2
 */



public class QueueExample {

    public static void main(String[] args) {

        //Queue
        Queue <String> queue = new LinkedList<>();
        queue.offer("X");
        queue.offer("Y");
        queue.offer("Z");
        
        System.out.println("Queue " + queue);
        System.out.println("Queue Peek: " + queue.peek());
        System.out.println("Queue poll: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
        
        System.out.println("--------------------------");
        
        PriorityQueue<String> lengthPQ = new PriorityQueue<>();
        lengthPQ.add("Banana");
        lengthPQ.add("Apple");
        lengthPQ.add("Kiwi");
        lengthPQ.add("Egg");
        
        
     }
}

