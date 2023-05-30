package com.algorithms.search.dfs;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //            5
        //       2           4
        //  9       10    7
        System.out.println("Tree");
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
        System.out.println("Preorder");
        DepthFirstSearchTree.traversePreOrder(binaryTree.root);
        System.out.println();
        System.out.println("PreOrderWithoutRecursion");
        DepthFirstSearchTree.traversePreOrderWithoutRecursion(binaryTree.root);
        System.out.println();
        System.out.println("InOrder");
        DepthFirstSearchTree.traverseInOrder(binaryTree.root);
        System.out.println();
        System.out.println("InOrderWithoutRecursion");
        DepthFirstSearchTree.traverseInOrderWithoutRecursion(binaryTree.root);
        System.out.println();
        System.out.println("PostOrder");
        DepthFirstSearchTree.traversePostOrder(binaryTree.root);
        System.out.println();
        System.out.println("PostOrderWithoutRecursion");
        DepthFirstSearchTree.traversePostOrderWithoutRecursion(binaryTree.root);
        System.out.println();

        DepthFirstSearchGraph graph = new DepthFirstSearchGraph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        System.out.println();
        System.out.println("Graph");
        graph.dfs(0);
        System.out.println();
        System.out.println("WithoutRecursion");
        graph.dfsWithoutRecursion(0);
        System.out.println();
        System.out.println("Toplogical");
        List<Integer> integerList = graph.topologicalSort(0);
        System.out.println(integerList);

    }
}
