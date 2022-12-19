package com.web.algorithms;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int arr[]=new int [size];       
//        for(int i=0;i<size;i++) {
//            arr[i]=scan.nextInt();
//        }
       int arr[] = { 11, 31, 45, 67, 87, 97, 34, 97, 9, 90 };
        
        System.out.println("Before Sorting");
        print_arr(arr);
        System.out.println();
        Insertion_sort(arr);
        
        System.out.println("After Sorting");
        print_arr(arr);

        scan.close();

    }
    private static int [] Insertion_sort(int[] arr) {
       
       
        return arr;    
    }
    private static void print_arr(int[] arr) {
        
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
        
    }

}
