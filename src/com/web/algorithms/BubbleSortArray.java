package com.web.algorithms;

import java.util.Scanner;

public class BubbleSortArray {
	
	private static int[] bubble_sort(int[] arr) {
		
		int temp=0;
		
		for(int i=1;i<arr.length;i++) {
			System.out.println();
			
			if(arr[i-1]>arr[i]) {
				temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
				print_arr(arr);
				System.out.println();
				
				return bubble_sort(arr);
			}
		}
		System.out.println();
		return arr;
		
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[]=new int [size];		
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		//int arr[] = { 11, 31, 45, 67, 87, 97, 34, 97, 9, 90 };
		
		System.out.println("Before Sorting");
		print_arr(arr);
		bubble_sort(arr);
		
		System.out.println("After Sorting");
		print_arr(arr);

		scan.close();
	}
	private static void print_arr(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

	

}
