package com.practice.dsa.patterns.array.matrix;
/* #1572
    Given a square matrix mat, return the sum of the matrix diagonals.
    Only include the sum of all the elements on the primary diagonal and all
    the elements on the secondary diagonal that are not part of the primary diagonal.

    Example : Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
    Output: 25
    Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
    Notice that element mat[1][1] = 5 is counted only once.
 */

//TC : O(n)
public class DiagonalSumMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        DiagonalSumMatrix sum = new DiagonalSumMatrix();
        System.out.println(sum.diagonalSum(mat));

    }

    public int diagonalSum(int[][] mat) {
        int sum=0;
        //primary diagonal
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
        }
        //sec diagonal
        int i=0;
        int k=mat.length-1;
        while(i<mat.length) {
            if(i!=k) {
                sum+=mat[i][k];
            }
            i++;
            k--;
        }
        return sum;
    }
}
