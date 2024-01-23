package com.practice.dsa.patterns.array.prefixsum;
/*  #1854:
You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.

The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.

Return the earliest year with the maximum population.

Example 1:

Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaxPopulationYear {

    public static void main(String[] args) {
        int[][] logs={{1950,1961},{1960,1971},{1970,1981}};
        MaxPopulationYear populationYear = new MaxPopulationYear();
        System.out.println(populationYear.maximumPopulation(logs));
    }
    //takes 18ms slower sol
    /*public int maximumPopulation(int[][] logs) {
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();

        int max=0;
        int year = Integer.MAX_VALUE;
        for(int[] log:logs) {
            while(log[1] > log[0]) {
                freqMap.put(log[0], freqMap.getOrDefault(log[0], 0)+1);

                if(freqMap.get(log[0])==max) {
                    year = Math.min(log[0], year);
                } else if(freqMap.get(log[0])>max) {
                    max = Math.max(freqMap.get(log[0]), max);
                    year = log[0];
                }
                log[0]++;
            }
        }

        System.out.println(freqMap.toString());
        return year;
    }*/

    //0 ms runtime: relook
    public int maximumPopulation(int[][] logs) {
        /*The range of years specified in the problem is 1950 to 2050.
          The size of the array needed to cover this range is 2050 - 1950 + 1 = 101.*/
        int[] years = new int[101];
        for(int[] i : logs){
            years[i[0]-1950]++;
            years[i[1]-1950]--;
        }
        int ans = 0;
        int count = 0;
        int maxCount = 0;
        for(int i = 0; i<101; i++){
            count += years[i];
            if(maxCount<count){
                maxCount = count;
                ans = i+1950;
            }
        }
        return ans;
    }
}
