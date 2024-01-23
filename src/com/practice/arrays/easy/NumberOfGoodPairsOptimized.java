package com.practice.arrays.easy;

import java.util.HashMap;
import java.util.Map;

/*TC: O(n)  SC : O(n)
Notes : ncr = n!/(r! * (n-r)!) selection.
npr = arrangement, order matters :  ncr *r!   or n!/(n-r)!
info : n(n+1)/2 = sum of n natural numbers
n(n-1)/2 = number of combinations how to choose two elements out of n

/* n(n−1)/2 : is the number of combinations of choosing 2 items from n without considering order.
n*(n-1)  : is the number of permutations of choosing 2 items from n while considering order.

    These pairs are good pairs, and you can observe that the order of indices within each pair doesn't matter.
    If (i, j) is a good pair, then (j, i) is also a good pair.
    So, you can count the number of occurrences of each number in the array and then use combinations to select 2 indices
    from the count of occurrences of each number. The combination formula is appropriate because the order of selecting
    the indices within each pair doesn't matter.

    Here i,j == j,i therefore we used combinations. if i,j != j,i or has diff meaning we would have used permutations
    and in this case of 2 pairing it'll be n(n-1), otherwise ncr *r!   or n!/(n-r)!

   Combinations (C(n,k)) for any k: n!/(r! * (n-r)!)
   Combinations (C(n,k)) for any 2 : n*(n-1)/2
 */

public class NumberOfGoodPairsOptimized {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};

        NumberOfGoodPairsOptimized pairs = new NumberOfGoodPairsOptimized();
        int pairCount = pairs.numIdenticalPairs(nums);

        System.out.println(pairCount);
    }

    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> countMap = new HashMap<>();
        int goodPairs = 0;
        for(int i=0;i<nums.length;i++) {
            if(countMap.containsKey(nums[i])) {
                int count = countMap.get(nums[i]);
                count++;
                countMap.put(nums[i], count);
            } else {
                countMap.put((nums[i]), 1);
            }
        }

        for(Map.Entry x:countMap.entrySet()) {
            int n = Integer.parseInt(x.getValue().toString());
            goodPairs+= n*(n-1)/2;
        }

        return goodPairs;
    }

}
