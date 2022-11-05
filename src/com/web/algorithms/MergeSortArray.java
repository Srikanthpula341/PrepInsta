package com.web.algorithms;

import java.util.Scanner;

public class MergeSortArray {
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		int size = scan.nextInt();
//		int arr[]=new int [size];		
//		for(int i=0;i<size;i++) {
//			arr[i]=scan.nextInt();
//		}
		
		int arr[] = { 11, 31, 45, 67, 87, 97, 34, 97, 9, 90 };
		int size = arr.length;
		
		System.out.println("Before Sorting");
		print_arr(arr);
		merge_sort(arr);
		System.out.println("After Sorting");
		print_arr(arr);

		scan.close();
	}

	private static void merge_sort(int[] arr) {

		
	}

	private static void print_arr(int[] arr) {

		
	}

}
