package com.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

//O(N)
public class BreadthFirstSearch {

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

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.root = rootNode;
        breadthFirstSearch.bfs(7);

    }

    public Node bfs(int value){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node tmpNode = queue.poll();
            System.out.println(tmpNode.data);
            if(tmpNode.data == value) {
                return tmpNode;
            }
            else {
                if(tmpNode.left != null) {
                    queue.add(tmpNode.left);
                }
                if(tmpNode.right != null) {
                    queue.add(tmpNode.right);
                }
            }
        }
        return null;
    }

}
