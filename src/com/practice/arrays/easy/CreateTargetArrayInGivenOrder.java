package com.practice.arrays.easy;

/* #1389: Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.
Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums= {0,1,2,3,4};
        int[] index= {0,1,2,2,1};

        CreateTargetArrayInGivenOrder obj = new CreateTargetArrayInGivenOrder();
        int[] result = obj.createTargetArray(nums, index);

        System.out.println(Arrays.toString(result));
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<nums.length;i++) {
            result.add(index[i], nums[i]);
        }

        //int[] res = result.stream().mapToInt(i -> i).toArray(); //is slower
        int res[] = new int[nums.length];
        int i=0;
        for(int x: result) {
            res[i++] = x;
        }
        return res;
    }
}

/*Object Boxing/Unboxing: Streams work with objects, and when you convert a stream of primitives to an array,
 boxing and unboxing of primitive types may occur. This process introduces additional overhead as it involves
 creating objects for each primitive value.

Intermediate Operations: Stream operations might introduce additional intermediate operations (like mapToInt)
that can contribute to the overall processing time.

Iterator Performance: The enhanced for-loop (for(int x: result)) might have more optimized performance for
iterating over a collection compared to the underlying iterator used by the stream.

Parallelization Overhead: Streams can be processed in parallel, but for small datasets or simple operations,
the parallelization overhead might outweigh the benefits.

In contrast, the traditional loop approach directly works with the primitive array and avoids the overhead
associated with streams.*/
