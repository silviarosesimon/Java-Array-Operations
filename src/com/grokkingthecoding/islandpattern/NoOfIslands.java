package com.grokkingthecoding.islandpattern;

import java.util.LinkedList;
import java.util.Queue;

//Given a 2D array (i.e., a matrix) containing only 1s (land) and 0s (water),
// count the number of islands in it.
// DFS - Time and Space Complexity - O(i*j)
// BFS - Time and Space Complexity - O(i*j) and O(min(i,j))
// BFS with visited matrix - Time and Space Complexity - O(i*j)
public class NoOfIslands {
    public static void main(String[] args) {

        int[][] islands =  new int[][] {
                { 0, 1, 1, 1, 0 },
                { 0, 0, 0, 1, 1 },
                { 0, 1, 1, 1, 0 },
                { 0, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };

        //System.out.println(noOfIslands(islands));
        System.out.println(noOfIslandsWithVisitedMatrix(islands));

        int[][] islands1 =  new int[][] {
                { 1, 1, 1, 0, 0 },
                { 0, 1, 0, 0, 1 },
                { 0, 0, 1, 1, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 0 }
        };

        //System.out.println(noOfIslands(islands1));
        System.out.println(noOfIslandsWithVisitedMatrix(islands1));
    }

    public static int noOfIslands(int[][] matrix) {
        int noOfIslands = 0;
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        for(int i=0; i<rowLength; i++) {
            for(int j=0; j<colLength; j++) {
                if(matrix[i][j] == 1) {
                    noOfIslands++;
                    //visitIslandDFS(matrix,i,j);
                    visitIslandBFS(matrix,i,j);
                }
            }
        }
        return noOfIslands;
    }

    private static void visitIslandDFS(int[][] matrix, int i, int j) {
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) {
            return;
        }

        if(matrix[i][j] == 0) {
            return;
        }

        matrix[i][j] = 0;

        visitIslandDFS(matrix, i+1 , j);
        visitIslandDFS(matrix, i-1 , j);
        visitIslandDFS(matrix, i , j+1);
        visitIslandDFS(matrix, i , j-1);
    }

    private static void visitIslandBFS(int[][] matrix, int i, int j) {
        Queue<int[]> neighbours = new LinkedList<>();
        neighbours.add(new int[] {i,j});
        while(!neighbours.isEmpty()) {
            int row = neighbours.peek()[0];
            int col = neighbours.peek()[1];
            neighbours.remove();
            if(row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
                continue;
            }

            if(matrix[row][col] == 0) {
                continue;
            }

            matrix[row][col] = 0;

            neighbours.add(new int[] { row+1 , col });
            neighbours.add(new int[] { row-1 , col });
            neighbours.add(new int[] { row , col+1 });
            neighbours.add(new int[] { row , col-1 });
        }
    }

    public static int noOfIslandsWithVisitedMatrix(int[][] matrix) {
        int noOfIslands = 0;
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        boolean[][] visited = new boolean[rowLength][colLength];
        for(int i=0; i<rowLength; i++) {
            for(int j=0; j<colLength; j++) {
                if(!visited[i][j] && matrix[i][j] == 1) {
                    noOfIslands++;
                    visitIslandBFSWithVisitedMatrix(matrix, visited, i,j);
                }
            }
        }
        return noOfIslands;
    }


    private static void visitIslandBFSWithVisitedMatrix(int[][] matrix, boolean[][] visited, int i, int j) {
        Queue<int[]> neighbours = new LinkedList<>();
        neighbours.add(new int[] {i,j});
        while(!neighbours.isEmpty()) {
            int row = neighbours.peek()[0];
            int col = neighbours.peek()[1];
            neighbours.remove();
            if(row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
                continue;
            }

            if(matrix[row][col] == 0 || visited[row][col]) {
                continue;
            }

            visited[row][col] = true;

            neighbours.add(new int[] { row+1 , col });
            neighbours.add(new int[] { row-1 , col });
            neighbours.add(new int[] { row , col+1 });
            neighbours.add(new int[] { row , col-1 });
        }
    }
}
