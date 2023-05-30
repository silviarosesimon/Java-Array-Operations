package com.ds.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BasicQOperations {

    public static void main(String[] args) {
        //LinkedList Implementation
        Queue<Integer> linkedListQ = new LinkedList<>();
        linkedListQ.add(2);
        linkedListQ.add(3);
        linkedListQ.add(4);
        linkedListQ.add(5);

        int removedItem = linkedListQ.remove();
        System.out.println(removedItem);
        System.out.println(linkedListQ.remove());
        System.out.println(linkedListQ.peek());


        while(!linkedListQ.isEmpty()) {
            System.out.println(linkedListQ.remove());
        }

        //Priority Queue Implementation
        Queue<Integer> priorityQ = new PriorityQueue<>();
        priorityQ.add(2);
        priorityQ.add(3);
        priorityQ.add(4);
        priorityQ.add(5);

        int priorityItem = priorityQ.remove();
        System.out.println(priorityItem);
        System.out.println(priorityQ.remove());
        System.out.println(priorityQ.peek());


        while(!priorityQ.isEmpty()) {
            System.out.println(priorityQ.remove());
        }
    }
}
