package com.practice.dsa.patterns.array.matrix;

import java.util.Arrays;

/* #867:
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
 */
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        TransposeMatrix obj = new TransposeMatrix();
        System.out.println(Arrays.toString(obj.transpose(obj.transpose(mat))));
    }

    public int[][] transpose(int[][] matrix) {
        //00,01,02 to 00,10,20
        int[][] newMat = new int[matrix[0].length][matrix.length];

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                newMat[j][i] = matrix[i][j];
            }
        }
        return newMat;
    }
}
