package com.ds.linkedlist;

import java.util.HashSet;

public class DetectAndRemoveLoop {

    public static void main(String[] args) {

        CustomLinkedList linkedList = new CustomLinkedList();

        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = firstNode;

        System.out.println(detectAndRemoveLoopUsingPointers(firstNode));
        linkedList.displayContents();
        System.out.println(detectAndRemoveLoopUsingHashSet(firstNode));
        linkedList.displayContents();
    }
    public static boolean detectAndRemoveLoopUsingPointers(Node node)
    {
        Node slow = node;
        Node fast = node;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                removeLoopUsingPointers(slow,node);
                return true;
            }
        }
        return false;
    }

    public static boolean detectAndRemoveLoopUsingHashSet(Node node)
    {
        HashSet<Node> nodeSet = new HashSet<>();
        Node prev = null;
        while (node != null) {
            if (nodeSet.contains(node)) {
                prev.next = null;
                return true;
            }
            else {
                nodeSet.add(node);
                prev = node;
                node = node.next;
            }
        }

        return false;
    }

    public static void removeLoopUsingPointers(Node slow, Node head) {
        for (Node curr = head; curr != null; curr = curr.next) {
            Node ptr = slow;
            while (ptr.next != slow && ptr.next != curr) {
                ptr = ptr.next;
            }
            if (ptr.next == curr) {
                ptr.next = null;
                return;
            }
        }
    }

}
