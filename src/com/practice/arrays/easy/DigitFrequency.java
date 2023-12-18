package com.practice.arrays.easy;
/*. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.*/

import java.util.HashMap;

public class DigitFrequency {
    public static void main(String[] args) {
        int n = 994543234;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int tempNum = n;

        while(tempNum!=0) {
            int curr = tempNum%10; // gives remainder i.e last num
            if(freqMap.containsKey(curr)) {
                int num = freqMap.get(curr);
                num++;
                freqMap.put(curr, num);
            } else {
                freqMap.put(curr, 1);
            }
            tempNum=tempNum/10; // This reduces the number
        }

        for(int x : freqMap.keySet()) {
            System.out.println(x + ":"+ freqMap.get(x));
        }
    }
}
