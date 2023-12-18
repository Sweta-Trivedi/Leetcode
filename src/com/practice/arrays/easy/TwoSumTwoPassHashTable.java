package com.practice.arrays.easy;

import java.util.Arrays;
import java.util.HashMap;

//Two Pass Hash Table
//Pb when arr[] = {3,3}
//O(n), O(n)
public class TwoSumTwoPassHashTable {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;

        TwoSumTwoPassHashTable obj = new TwoSumTwoPassHashTable();
        System.out.println(Arrays.toString(obj.twoSum(arr, target)));

    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberToIdx = new HashMap<>();
            for(int i=0;i<nums.length;i++) {
                numberToIdx.put(nums[i],i);
            }

            for(Integer i : numberToIdx.keySet()) {
                if(numberToIdx.containsKey(target-i)) {
                    return new int[] {numberToIdx.get(i), numberToIdx.get(target-i)};
                }
            }
            return null;
        }
}
