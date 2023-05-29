package algorithms;

import java.util.*;

public class BreadthFirstSearch {

    public static <T> Optional<Tree<T>> searchTree(T value, Tree<T> root) {

        Queue<Tree<T>> queue = new ArrayDeque<>();
        queue.add(root);

        Tree<T> currentNode;
        while(!queue.isEmpty()) {
            currentNode = queue.remove();
            System.out.println("visited node with value: "+currentNode.getValue());
            if(currentNode.getValue().equals(value)) {
                return Optional.of(currentNode);
            }
            else {
                queue.addAll(currentNode.getChildren());
            }
        }

        return Optional.empty();
    }

    public static <T> Optional<Node<T>> searchGraph(T value, Node<T> start) {

        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(start);

        Node<T> currentNode;
        Set<Node<T>> alreadyVisited = new HashSet<>();

        while(!queue.isEmpty()) {
            currentNode = queue.remove();
            System.out.println("visited node with value: "+currentNode.getValue());
            if(currentNode.getValue().equals(value)) {
                return Optional.of(currentNode);
            }
            else {
                alreadyVisited.add(currentNode);
                queue.addAll(currentNode.getNeighbors());
                queue.removeAll(alreadyVisited);
            }
        }

        return Optional.empty();
    }
}
