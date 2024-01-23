package com.practice.arrays.easy;

import java.util.Arrays;

//best sol
//O(n) O(1)
//spotify shuffle list
public class ShuffleTheArrayOptimized {
    public static void main(String[] args) {
        int [] nums= {2,5,1,3,4,7};
        int n=3;
        ShuffleTheArrayOptimized shuffleTheArray = new ShuffleTheArrayOptimized();
        int [] shuffledArray = shuffleTheArray.shuffle(nums,n);

        System.out.println(Arrays.toString(shuffledArray));

    }

    int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        int ptr1=0;
        int ptr2=ptr1+n;
        int i=0;
        while(i< nums.length) {
            shuffled[i] = nums[ptr1];
            shuffled[i+1] = nums[ptr2];
            i+=2;
            ptr1++;
            ptr2++;
        }
        return shuffled;
    }
}
