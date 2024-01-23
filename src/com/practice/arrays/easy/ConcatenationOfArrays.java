package com.practice.arrays.easy;
/* #1929 : Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.



Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1] */

import java.util.Arrays;

// TC : O(n) SC : O(n)
public class ConcatenationOfArrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int ans[] = new int[2* arr.length];

        for(int i=0;i<arr.length;i++) {
            ans[i] = arr[i];
            ans[arr.length+i] = arr[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
