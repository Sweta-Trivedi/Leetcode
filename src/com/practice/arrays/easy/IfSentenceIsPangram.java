package com.practice.arrays.easy;

/*A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

topic : string , hashtable
*/

import java.util.*;

public class IfSentenceIsPangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        IfSentenceIsPangram obj = new IfSentenceIsPangram();
        boolean isPangram = obj.checkIfPangram(s);

        System.out.println(isPangram);
    }

    public boolean checkIfPangram(String sentence) {
        //sol 1: 4ms runtime
        /*Set<Character> alphabets = new HashSet<>();

        if(sentence.length()>=26) {
            for(int i=0;i<sentence.length();i++) {
                String str = (""+sentence.charAt(i)).toLowerCase();
                Character c = str.charAt(0);
                alphabets.add(c);
            }
        }

        if(alphabets.size()>=26) {
            return true;
        } else {
            return false;
        }*/

        //sol 2: redo : Runtime 1ms
        int[] arr=new int[26];
        int i=0;
        for(i=0;i<26;i++) {
            arr[i] = i + 97;
        }

        //ascii of lower a-z 97 to 122 and greater A-Z is 65 to 90
        for(char x : sentence.toCharArray()) {
            i=x;
            arr[i-97]=0; //116-97 = 19  ; arr[19] = 0
        }

        for(i=0;i<26;i++) {
            if(arr[i]!=0) { // if all have zero and the last count goes to 26
                break;
            }
        }
        return i==26;
    }
}
