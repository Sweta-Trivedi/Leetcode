package com.practice.dsa.patterns.array.prefixsum;
/* #1732 : There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.



Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.*/


// TC O(n); SC : O(n)
public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        FindTheHighestAltitude obj = new FindTheHighestAltitude();
        int largest = obj.largestAltitude(gain);
        System.out.println(largest);
    }

    public int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length+1];
        altitudes[0] = 0;
        int maxAltitude=altitudes[0];

        for(int i=0;i<gain.length;i++) {
            altitudes[i+1] = altitudes[i] + gain[i];
            maxAltitude = Math.max(maxAltitude, altitudes[i+1]);
        }
        return maxAltitude;
    }
}
