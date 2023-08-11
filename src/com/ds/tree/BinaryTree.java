package com.ds.tree;

public class BinaryTree {

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
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = rootNode;
        System.out.println();
        binaryTree.preOrderTraversal();
        System.out.println();
        binaryTree.inOrderTraversal();
        System.out.println();
        binaryTree.postOrderTraversal();
        System.out.println();
    }

    public void postOrderTraversal() {
        postOrderTraversal(this.root);
    }

    private void postOrderTraversal(Node root) {
        if(root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void inOrderTraversal() {
        inOrderTraversal(this.root);
    }

    private void inOrderTraversal(Node root) {
        if(root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal() {
        preOrderTraversal(this.root);
    }

    private void preOrderTraversal(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
}
