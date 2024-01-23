package com.practice.arrays.easy;

/* #1470 : Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7]. */

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int [] nums= {2,5,1,3,4,7};
        int n=3;
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        int [] shuffledArray = shuffleTheArray.shuffle(nums,n);

        System.out.println(Arrays.toString(shuffledArray));

    }

    public int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        int[] visited = new int[nums.length];
        Arrays.fill(visited, 0);

        //2 pointer approach
        shuffled[0] = nums[0];
        visited[0] = 1;
        int idx =0;
        for(int i=1;i<nums.length;i++) {
            idx = (idx+n) >= nums.length ? ((idx+n))%nums.length : (idx+n);
            while(visited[idx]==1) {
                idx++;
            }
            shuffled[i] = nums[idx];
            visited[idx] = 1;
        }
        return shuffled;
    }
}

