package com.ds.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        LinkedList<Integer> reverseList = new LinkedList<>();
        list.descendingIterator().forEachRemaining(reverseList::add);
        System.out.println(reverseList);
    }
}
