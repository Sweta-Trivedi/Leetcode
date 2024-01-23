package com.practice.arrays.easy;

/* #1365: Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation:
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).*/

//Bruteforce : TC: O(n^2) ,SC: O(n)
//O(n) O(n)
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfElemSmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        NumberOfElemSmallerThanCurrent obj = new NumberOfElemSmallerThanCurrent();
        int[] result = obj.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = nums.clone();
        Arrays.sort(result);
        Map<Integer, Integer> mapping = new HashMap<>();

        for(int i=0;i< result.length;i++) {
            mapping.putIfAbsent(result[i], i);
        }

        for(int i=0;i< nums.length;i++) {
            result[i] = mapping.get(nums[i]);
        }
        return result;
    }
}
