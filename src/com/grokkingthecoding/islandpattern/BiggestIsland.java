package com.grokkingthecoding.islandpattern;

//Given a 2D array (i.e., a matrix) containing only 1s (land) and 0s (water), find the biggest island in it.
// Write a function to return the area of the biggest island.
// DFS - Time and Space Complexity - O(i*j)
public class BiggestIsland {
    public static void main(String[] args) {

        int[][] islands =  new int[][] {
                { 0, 1, 1, 1, 0 },
                { 0, 0, 0, 1, 1 },
                { 0, 1, 1, 1, 0 },
                { 0, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };

        System.out.println(biggestIslandArea(islands));

        int[][] islands1 =  new int[][] {
                { 1, 1, 1, 0, 0 },
                { 0, 1, 0, 0, 1 },
                { 0, 0, 1, 1, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 0 }
        };

        System.out.println(biggestIslandArea(islands1));
    }

    public static int biggestIslandArea(int[][] matrix) {
        int biggestIslandArea = 0;
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        for(int i=0; i<rowLength; i++) {
            for(int j=0; j<colLength; j++) {
                if(matrix[i][j] == 1) {
                    biggestIslandArea = Math.max(biggestIslandArea, visitIslandDFS(matrix,i,j));
                }
            }
        }
        return biggestIslandArea;
    }

    private static int visitIslandDFS(int[][] matrix, int i, int j) {
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) {
            return 0;
        }

        if(matrix[i][j] == 0) {
            return 0;
        }

        matrix[i][j] = 0;
        int islandArea = 1;

        islandArea += visitIslandDFS(matrix, i+1 , j);
        islandArea += visitIslandDFS(matrix, i-1 , j);
        islandArea += visitIslandDFS(matrix, i , j+1);
        islandArea += visitIslandDFS(matrix, i , j-1);

        return islandArea;
    }

}
