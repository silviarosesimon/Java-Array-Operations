package linkedlist;

import java.util.LinkedList;

public class BuiltinLinkedListBasicOperations {

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Strawberry");
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.size());

        fruits.removeFirst();

        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        fruits.forEach(fruit -> System.out.println(fruit));
    }

}
