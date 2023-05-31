package com.ds.linkedlist;

public class DoublyLinkedList {

    Node head;
    Node tail;

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addNode(1);
        doublyLinkedList.addNode(2);
        doublyLinkedList.addNode(4);
        doublyLinkedList.addNode(7);
        doublyLinkedList.display();
    }

    public void addNode(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
            head.prev = null;
            tail.next = null;
        }
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;
        }
    }

    public void display() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
