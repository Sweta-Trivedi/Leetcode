package com.practice.dsa.patterns.array.twopointers;

/* #832 : Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
Example 1:
Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

topics : Array
Two Pointers
Bit Manipulation
Matrix

*/

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        FlippingAnImage obj = new FlippingAnImage();
        int[][] flippedImage = obj.flipAndInvertImage(image);
        for(int i=0;i<flippedImage.length;i++) {
            for(int j=0;j< flippedImage.length;j++) {
                System.out.print(flippedImage[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] flipAndInvertImage(int[][] image) {
        //runtime : 1ms
        for(int i =0;i<image.length;i++) {
            int start=0;
            int last = image[i].length-1;
            int mid = start+last/2;

            while(start<last) {
                int temp = image[i][start]==1?0:1;
                image[i][start] = image[i][last]==1?0:1;
                image[i][last] = temp;

                start++;
                last--;
            }
            if(image[i].length%2==1) {
                image[i][mid]= image[i][mid]==1?0:1;
            }
        }
        return image;
    }

    /*Note : Avoiding the use of if else and instead of using ternary statement reduced the runtime time to 0ms. But this
    is not always true as i tried the same in CountItemsMatchingRule*/
    public static int inverse(int x) {
        if(x==0) {
            return 1;
        } else {
            return 0;
        }
    }
}
