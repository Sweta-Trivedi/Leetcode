package com.practice.arrays.easy;

/* #1512 : Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed./*
 */

//Bruteforce
//O(n^2)

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};

        NumberOfGoodPairs pairs = new NumberOfGoodPairs();
        int pairCount = pairs.numIdenticalPairs(nums);

        System.out.println(pairCount);
    }

    public int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length-1;i++) {
            for(int x=i+1;x<nums.length;x++) {
                if(nums[i]==nums[x]) {
                    count++;
                }
            }
        }
        return count;
    }
}
