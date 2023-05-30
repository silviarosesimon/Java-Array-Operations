package com.ds.hash;

import com.ds.linkedlist.CustomLinkedList;
import com.ds.linkedlist.Node;

public class DetectCyclicLinkedList {

    public static void main(String[] args) {

        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        CustomLinkedList nonCyclicLinkedList = new CustomLinkedList();
        nonCyclicLinkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        System.out.println(nonCyclicLinkedList.hasCycle());

        CustomLinkedList cyclicLinkedList = new CustomLinkedList();
        cyclicLinkedList.head = firstNode;
        thirdNode.next = secondNode;

        System.out.println(cyclicLinkedList.hasCycle());
    }
}
