package com.practice.arrays.easy;

import java.util.Arrays;

/* #1252: There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
 */

//relook

public class CellsWithOddValuesInMatrix {
    public static void main(String[] args) {
        int row=2;
        int col=3;

        int[][] indices = {{0,1},{1,1}};
        CellsWithOddValuesInMatrix obj = new CellsWithOddValuesInMatrix();
        int count = obj.oddCells(row,col,indices);
        System.out.println(count);

    }

    //few test cases fail in the below logic
    /*public int oddCells(int m, int n, int[][] indices) {
        int[][] arr= new int[m][n]; //default initialized with 0
        for(int i = 0;i< indices.length;i++) {
            for(int j=0;j<arr[i].length;j++) { //row
                arr[indices[i][0]][j] += 1;
            }

            for(int k=0;k<arr.length;k++) {
                arr[k][indices[i][1]] += 1;
            }
        }
        return findOddCount(arr);
    }*/

    //relook the logic
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        for(int i=0;i<indices.length;i++) {
            int rowIndex = indices[i][0];
            int colIndex = indices[i][1];

            rows[rowIndex]+=1;
            cols[colIndex]+=1;
        }

        int oddElementsCount=0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                if((rows[i]+cols[j])%2==1){
                    ++oddElementsCount;
                }
            }
        }
       return oddElementsCount;
    }


    //00,01,01 [arr[i][0]][j]
    //01,11

    public static int findOddCount(int[][] arr){
        int count=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                count = arr[i][j]%2!=0?++count:count;
            }
        }
        return count;
    }
}
