package com.practice.arrays.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*  #989

The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
 */
public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int num[] = {9,9,9,9,9,9,9,9,9,9};//{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};//;//{1,2,0,0};
        int k=1;//516;
        AddToArrayFormOfInteger obj = new AddToArrayFormOfInteger();
        System.out.println(obj.addToArrayForm(num, k));
    }

    //fails in edge cases
    /*public List<Integer> addToArrayForm(int[] num, int k) {
        BigInteger numSize = BigInteger.valueOf((long) (10 * (Math.pow(10, num.length-2))));
        System.out.println(numSize);
        BigInteger number = BigInteger.valueOf(0);
        for(int i=0;i<num.length;i++) {
            number = number.add(numSize.multiply(BigInteger.valueOf(num[i])));
            numSize = numSize.divide(BigInteger.valueOf(10));
        }

        number = number.add(BigInteger.valueOf(k));
        System.out.println(number);

        List<Integer> newNum = new ArrayList<>();
        while(!number.equals(0)) {
            newNum.add(Integer.valueOf(String.valueOf(number.mod(BigInteger.valueOf(10)))));
            number= number.divide(BigInteger.valueOf(10));
        }
        Collections.reverse(newNum);
        return newNum;
    }*/


    // resubmit imp ques
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> newNum = new ArrayList<>();
        int carry =0;
        int temp, newNumber;

        for(int i= num.length-1;i>=0;i--) {
            if(k!=0) {
                temp = k%10;
                k=k/10;
                newNumber = num[i] +temp +carry;
                if(newNumber>9) {
                    num[i]=newNumber%10;
                    newNum.add(num[i]);
                    carry =newNumber/10;
                } else {
                    num[i]=newNumber;
                    newNum.add(num[i]);
                    carry=0;
                }
                newNumber=0;
            } else {
                if(carry!=0) {
                    temp = num[i]+carry;
                    if(temp>9) {
                        num[i]=temp%10;
                        newNum.add(num[i]);
                        carry =temp/10;
                    } else {
                        //num[i]=newNumber;
                        newNum.add(num[i]);
                        carry=0;
                    }
                } else {
                    newNum.add(num[i]);
                }

            }
        }
        if(carry!=0) {
            newNum.add(carry);
        } else if(k!=0) {
            while(k!=0) {
                newNum.add(k%10);
                k=k/10;
            }
        }
        Collections.reverse(newNum);
        return newNum;
    }

}
