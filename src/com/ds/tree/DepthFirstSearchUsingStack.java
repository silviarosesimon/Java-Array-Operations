package com.ds.tree;

import java.util.Stack;

public class DepthFirstSearchUsingStack {
    Node root;

    public static void main(String[] args) {

        Node rootNode = new Node(5);
        Node nodeTwo = new Node(2);
        Node nodeFour = new Node(4);
        Node nodeNine = new Node(9);
        Node nodeTen = new Node(10);
        Node nodeSeven = new Node(7);
        rootNode.left = nodeTwo;
        rootNode.right = nodeFour;
        nodeTwo.left = nodeNine;
        nodeTwo.right = nodeTen;
        nodeFour.left = nodeSeven;

        DepthFirstSearchUsingStack depthFirstSearch = new DepthFirstSearchUsingStack();
        depthFirstSearch.root = rootNode;
        depthFirstSearch.traverseInOrder(rootNode);
        System.out.println();
        depthFirstSearch.traversePreOrder(rootNode);
        System.out.println();
        depthFirstSearch.traversePostOrder(rootNode);

    }

    public Node traverseInOrder(Node node){
        if(node != null) {
            Stack<Node> stack = new Stack<>();
            while(node != null || !stack.isEmpty()) {
                while(node != null) {
                    stack.push(node);
                    node = node.left;
                }
                Node top = stack.pop();
                visit(top);
                node = top.right;
            }

        }
        return null;
    }

    public Node traversePreOrder(Node node){
        if(node != null) {
            Stack<Node> stack = new Stack<>();
            stack.push(node);
            while(!stack.isEmpty()) {
                node = stack.pop();
                visit(node);
                if(node.right != null) {
                    stack.push(node.right);
                }
                if(node.left != null) {
                    stack.push(node.left);
                }
            }
        }
        return null;
    }

    public Node traversePostOrder(Node node){
        Node prev = node;
        if(node != null) {
            Stack<Node> stack = new Stack<>();
            stack.push(node);
            while(!stack.isEmpty()) {
                node = stack.peek();
                boolean hasChild = (node.left != null || node.right != null);
                boolean isPrevLastChild = (prev == node.right || (prev == node.left && node.right == null));

                if(!hasChild || isPrevLastChild) {
                    node = stack.pop();
                    visit(node);
                    prev = node;
                }
                else {
                    if (node.right != null) {
                        stack.push(node.right);
                    }
                    if (node.left != null) {
                        stack.push(node.left);
                    }
                }
            }
        }
        return null;
    }

    public static void visit(Node node) {
        System.out.print(node.data + " ");
    }
}
