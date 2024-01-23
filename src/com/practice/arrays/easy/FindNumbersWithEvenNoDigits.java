package com.practice.arrays.easy;
/* #1295
    Given an array nums of integers, return how many of them contain an even number of digits.
Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
 */
public class FindNumbersWithEvenNoDigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        FindNumbersWithEvenNoDigits count = new FindNumbersWithEvenNoDigits();
        System.out.println(count.findNumbers(nums));
    }

    //takes 1 ms to run
    /*public int findNumbers(int[] nums) {
        int evenNums = 0;
        for(int i=0;i<nums.length;i++) {
            //check ++evennums or evennums++
            evenNums = (countDigits(nums[i]))%2==0 ? ++evenNums : evenNums;
        }
        return evenNums;
    }*/

    //this too takes 1ms
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int i : nums){
            //tip: ((int)(Math.log10(i))+1): Adds 1 to the log10, giving the total number of digits in the number i.
            if(((int)(Math.log10(i))+1)%2==0){
                c++;
            }
        }
        return c;
    }

    public static int countDigits(int n) {
        int temp = n;
        int count = 0;
        while(temp!=0) {
            count+=1;
            temp=temp/10;
        }
        return count;
    }
}
