package com.practice.arrays.easy;

import java.util.Arrays;
import java.util.HashMap;

//best sol
//O(n) , O(n)
public class TwoSumSinglePassHashTable {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;

        TwoSumTwoPassHashTable obj = new TwoSumTwoPassHashTable();
        System.out.println(Arrays.toString(obj.twoSum(arr, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIdx = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(numToIdx.containsKey(target-nums[i])) {
                return new int[] {i, numToIdx.get(target-nums[i])};
            }
            numToIdx.put(nums[i], i);
        }
        return null;
    }
}
