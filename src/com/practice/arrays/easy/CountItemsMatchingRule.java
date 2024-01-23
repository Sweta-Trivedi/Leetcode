package com.practice.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* #1773 : You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].*/

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items= new ArrayList<>();
        items.add(new ArrayList<>(Arrays.asList("phone","blue","pixel")));
        items.add(new ArrayList<>(Arrays.asList("computer","silver","lenovo")));
        items.add(new ArrayList<>(Arrays.asList("phone","gold","iphone")));
        String ruleKey = "color";
        String ruleValue = "silver";

        CountItemsMatchingRule obj = new CountItemsMatchingRule();
        int count = obj.countMatches(items, ruleKey, ruleValue);
        System.out.println(count);
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //took 6 ms
        /*int count =0;
        for(List list : items) {
            if(ruleKey.equalsIgnoreCase("type")) {
                if(((String)list.get(0)).equalsIgnoreCase(ruleValue)) {
                    count++;
                }
            } else if(ruleKey.equalsIgnoreCase("color")) {
                if(((String)list.get(1)).equalsIgnoreCase(ruleValue)) {
                    count++;
                }
            } else if(ruleKey.equalsIgnoreCase("name")) {
                if(((String)list.get(2)).equalsIgnoreCase(ruleValue)) {
                    count++;
                }
            }
        }
        return count;*/

        //uses recursion 1ms runtime #REDO
        switch(ruleKey) {
            case("type") :
                return helper(items, ruleValue, 0, 0);
            case("color") :
                return helper(items, ruleValue, 0, 1);
            default :
                return helper(items, ruleValue, 0, 2);
        }
    }

    //using ternary operator instead of if else did not made much of a diff here. Runtime is still 1ms
    public static int helper(List<List<String>> items, String ruleValue, int startIndex, int value) {
        return startIndex==items.size() ? 0 : (items.get(startIndex).get(value).equals(ruleValue) ?
                1+helper(items, ruleValue, startIndex+1, value) : helper(items, ruleValue, startIndex+1, value));
    }
}
