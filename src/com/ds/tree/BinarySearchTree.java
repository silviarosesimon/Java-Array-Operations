package com.ds.tree;

public class BinarySearchTree {

    Node root;

    public static void main(String[] args) {


        Node root = new Node(2);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.root = root;
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(4);
        System.out.println(binarySearchTree.search(4));
        System.out.println(binarySearchTree.search(7));
        //binarySearchTree.display();

    }

    public boolean search(int value) {
        return search(this.root,value);
    }

    private boolean search(Node root, int value) {
        if(root == null) {
            return false;
        }
        if(value < root.data) {
             return search(root.left, value);
        }
        else if(value > root.data) {
            return search(root.right, value);
        }
        return true;
    }

    public void insert(int value) {
        insert(this.root, value);
    }

    private Node insert(Node root, int value) {
        if(root == null) {
            root = new Node(value);
        }
        else if(value < root.data){
            root.left = insert(root.left, value);
        }
        else if(value > root.data){
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void display() {
        Node current = root;
        System.out.println(current.data);
        if(current.left != null) {
            System.out.println(current.left.data);
            //current = current.left;
        }
        if(current.right != null) {
            System.out.println(current.right.data);
            //current = current.right;
        }

    }
}
