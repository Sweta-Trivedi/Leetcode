package com.practice.arrays.easy;

import java.util.Arrays;

//saves two values an ith location i.e. the original val and also the new val n*(nums[nums[i]%n)+ nums[i]
//old val = val%n
//new val = val/n
//TC : O(n) SC : O(1)

public class BuildArrayFromPermSecSol {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        BuildArrayFromPermSecSol obj = new BuildArrayFromPermSecSol();
        System.out.println(Arrays.toString(obj.buildArray(nums)));
        for(int x : nums) {
            System.out.println(x/nums.length);
        }
    }

    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i=0;i<nums.length;i++) {
            nums[i] = n*(nums[nums[i]<i?(nums[i]%n):nums[i]]% n)+ nums[i];
        }
        return nums;
    }
}
