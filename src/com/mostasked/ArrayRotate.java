package com.mostasked;

import java.util.Scanner;

public class ArrayRotate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size :-    ");
        int size = scan.nextInt();
        int nums[] = new int[size];

      

        for (int i = 0; i < size; i++) {
            System.out.print("element at index "+i+" is:- ");
            nums[i] = scan.nextInt();
           // System.out.println();
        }

        print_array(nums);
        int k = scan.nextInt();
        rotation_number(nums, k);

        print_array(nums);
        scan.close();
    }

    private static int[] rotation_number(int[] nums, int k) {

        if (nums == null || k < 0)
            throw new IllegalArgumentException("Illegal argument!");

        return nums;
    }

    private static void print_array(int[] nums) {

        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i]);

    }

}
