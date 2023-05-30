package com.ds.tree;

public class BinarySearchTree {

    Node root;

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
            root = new Node();
            root.data = value;
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
