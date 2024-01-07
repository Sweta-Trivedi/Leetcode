package com.practice.arrays.easy;

/*Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).*/
//ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//    = [0,1,2,4,5,3]
//TC : O(n) SC: O(n)
import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        BuildArrayFromPermutation obj = new BuildArrayFromPermutation();
        System.out.println(Arrays.toString(obj.buildArray(nums)));
    }

    public int[] buildArray(int[] nums) {
        int result[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
