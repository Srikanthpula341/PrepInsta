package com.web.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	// private static int getIndex(int size, int[] arr, int key,int i) {
		
	// 	if(i==size) {
	// 		return -1;
	// 	}else if(i<=size) {
	// 		if(key==arr[i])
	// 			return i+1;
	// 		else
	// 			return getIndex(size, arr, key, i+1);
	// 	}else {
	// 		return -1;
	// 	}
		
		
	// }

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[]=new int [size];		
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		
		int low = scan.nextInt();
		int high = scan.nextInt();
		Arrays.sort(arr, low, high);
		
		for(int j=0;j<size;j++) {
			System.out.print(arr[j]+"");
		}

		
		scan.close();

	}



}
