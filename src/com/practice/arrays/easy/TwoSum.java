package com.practice.arrays.easy;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/
//BruteForce
//TC : O(n^2), SC : O(n)
public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;

        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]!=arr[j] && arr[j]==target-arr[i]) {
                    System.out.println(i + ":" + j);
                    return;
                }
            }
        }
    }
}
