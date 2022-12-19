package com.amazon;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Given a two-dimensional array, 
 * if any element within is zero, 
 * make its whole row and column zero.
 */

/*
 * Given an array of integers and a value, 
 * determine if there are any two integers in the array whose sum is equal to the given value.
 */
public class TwoDimensionalArray {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        int n= scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=scan.nextInt();
        }
        int val =scan.nextInt();
        
        System.out.println(twoSum(arr,val));
        

    }

    private static boolean twoSum(int[] arr, int val) {
        
       for(int i=0;i<arr.length-1;i++) {
           //for(j=0;i<arr.)
       }
        
        return false;
    }

}
