package com.ds.linkedlist;


import java.util.HashSet;

public class CustomLinkedList {
    public Node head;

    public void displayContents() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

    public void deleteBackHalf() {
        if(head == null || head.next == null) {
            head = null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast !=null && fast.next !=null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = null;
    }

    public void deleteSpecifiedNodeFromEnd(int k) {
        if(head == null || k == 0) {
            return;
        }
        Node first = head;
        Node second = head;
        for(int i=0; i<k; i++) {
            second = second.next;
            if(second.next == null) {
                if(i==k-1) {
                    head = head.next;
                }
                return;
            }
        }
        while(second.next != null) {
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;

    }

    public boolean hasCycle() {
        Node current = head;
        HashSet<Node> hashSet = new HashSet<>();
        while(current != null) {
            if(hashSet.contains(current)) {
                return true;
            }
            else {
                hashSet.add(current);
            }
            current = current.next;
        }
        return false;
    }

}
