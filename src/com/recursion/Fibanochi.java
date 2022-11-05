package com.recursion;

import java.util.Scanner;

public class Fibanochi {
	
	private static int search(int[] arr, int n, int i,int key) {
	
		if (n==i) {
			System.out.println("Hi");
			return -1;
		}
			
		else if (arr[i]==key)
			return i+1;
		else
			return search(arr, n, ++i, key);
		
	}

	public static void main(String[] args) {
	

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int key = scan.nextInt();
		int i=0;
		search(arr,n,i,key);
		
//		System.out.print(power_function(n, power));
		scan.close();
		

	}

	

}
