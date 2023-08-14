package com.algorithms.search.dfs;

import java.util.List;

@Deprecated
public class Main {

    public static void main(String[] args) {
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
