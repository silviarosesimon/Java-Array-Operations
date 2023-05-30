package com.algorithms.search.dfs;

import java.util.Stack;

public class DepthFirstSearchTree {

    public static void traversePreOrder(Node node) {
        if(node != null) {
            visit(node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public static void traverseInOrder(Node node) {
        if(node != null) {
            traverseInOrder(node.left);
            visit(node.value);
            traverseInOrder(node.right);
        }
    }

    public static void traversePostOrder(Node node) {
        if(node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            visit(node.value);
        }
    }

    public static void traversePreOrderWithoutRecursion(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;
        stack.push(root);
        while(!stack.isEmpty()) {
            current = stack.pop();
            visit(current.value);

            if(current.right != null) {
                stack.push(current.right);
            }
            if(current.left != null) {
                stack.push(current.left);
            }
        }
    }

    public static void traverseInOrderWithoutRecursion(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;
        //stack.push(root);
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            Node top = stack.pop();
            visit(top.value);
            current = top.right;
        }
    }

    public static void traversePostOrderWithoutRecursion(Node root) {
        Stack<Node> stack = new Stack<>();
        Node prev = root;
        Node current = root;
        stack.push(root);
        while (!stack.isEmpty()) {
            current = stack.peek();
            boolean hasChild = (current.left != null || current.right != null);
            boolean isPrevLastChild = (prev == current.right || (prev == current.left && current.right == null));

            if (!hasChild || isPrevLastChild) {
                current = stack.pop();
                visit(current.value);
                prev = current;
            }
            else {
                if (current.right != null) {
                    stack.push(current.right);
                }
                if (current.left != null) {
                    stack.push(current.left);
                }
            }
        }
    }

    private static void visit(int value) {
        System.out.print(" " + value);
    }
}
