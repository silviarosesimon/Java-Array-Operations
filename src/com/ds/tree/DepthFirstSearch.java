package com.ds.tree;

public class DepthFirstSearch {
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

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.root = rootNode;
        depthFirstSearch.traverseInOrder(rootNode);
        System.out.println();
        depthFirstSearch.traversePreOrder(rootNode);
        System.out.println();
        depthFirstSearch.traversePostOrder(rootNode);

    }

    public Node traverseInOrder(Node node){
        if(node != null) {
            traverseInOrder(node.left);
            visit(node);
            traverseInOrder(node.right);
        }
        return null;
    }

    public Node traversePreOrder(Node node){
        if(node != null) {
            visit(node);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
        return null;
    }

    public Node traversePostOrder(Node node){
        if(node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            visit(node);
        }
        return null;
    }

    public static void visit(Node node) {
        System.out.print(node.data + " ");
    }
}
