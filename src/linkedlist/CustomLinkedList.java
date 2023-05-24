package linkedlist;


public class CustomLinkedList {
    Node head;

    public void displayContents() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }
}
