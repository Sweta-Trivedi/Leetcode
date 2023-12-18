package com.practice.arrays.easy;
/*1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.*/

public class SpanOfArray {
    public static void main(String[] args) {
        int arr[] = {15, 30 ,40 ,4 , 11 ,9};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i =0; i <arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }

            if(arr[i]<min) {
                min = arr[i];
            }
        }
        int span = max-min;
        System.out.println("span is : " + span);
    }
}
