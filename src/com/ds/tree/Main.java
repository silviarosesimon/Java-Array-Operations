package com.ds.tree;

public class Main {

    public static void main(String[] args) {

        Node rootNode = new Node();
        rootNode.data = 5;
        Node nodeTwo = new Node();
        nodeTwo.data = 2;
        Node nodeFour = new Node();
        nodeFour.data = 4;
        Node nodeNine = new Node();
        nodeNine.data = 9;
        Node nodeTen = new Node();
        nodeTen.data = 10;
        Node nodeSeven = new Node();
        nodeSeven.data = 7;
        rootNode.left = nodeTwo;
        rootNode.right = nodeFour;
        nodeTwo.left = nodeNine;
        nodeTwo.right = nodeTen;
        nodeFour.left = nodeSeven;
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = rootNode;
        System.out.println();
        binaryTree.preOrderTraversal();
        System.out.println();
        binaryTree.inOrderTraversal();
        System.out.println();
        binaryTree.postOrderTraversal();
        System.out.println();

        Node root = new Node();
        root.data = 2;
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.root = root;
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(4);
        System.out.println(binarySearchTree.search(4));
        System.out.println(binarySearchTree.search(7));
        //binarySearchTree.display();
    }
}
