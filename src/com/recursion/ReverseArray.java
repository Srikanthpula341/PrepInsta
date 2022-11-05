package com.recursion;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// scanner
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int []arr= new int [n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int i=0;
		
		printArr(arr,n,i);
		scan.close();

	}

	private static int printArr(int[] arr, int n, int i) {
		
		if(n==i) {
			return -1;
		}
		 printArr(arr, n, ++i);
		 System.out.print(arr[i]+" ");
		return i--;
			
		
	}

}
