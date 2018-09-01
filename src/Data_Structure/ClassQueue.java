package Data_Structure;

import java.util.LinkedList;
import java.util.Queue;

public class ClassQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("Dhaka");
        queue.add("Khulna");
        queue.add("Rajshahi");
        System.out.println("First item: "+ queue.peek());
        System.out.println("Items of queue");
        for(String st : queue){
            System.out.println("Queue element: "+ st);
        }
        System.out.println("\nPolling items of queue ");
        while(!queue.isEmpty()){
            System.out.println("After polling: " + queue.poll());
        }


    }
}

//poll() --> pop
