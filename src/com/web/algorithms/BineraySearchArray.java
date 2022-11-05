package com.web.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BineraySearchArray {
	
	
	private static int getIndex(int[] arr, int key, int low, int high,int mid) {
		
		if(arr[mid]==key) {
			return mid+1;
		}else {
			if(arr[mid]>key) {
				return getIndex(arr, key, low, mid, low+(mid-low)/2);
			}else if(arr[mid]>key) {
				return getIndex(arr, key, mid, high,mid+ (high-mid)/2);
			}else if(low==high){
				return -1;
			}
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		int size = scan.nextInt();
//		int arr[]=new int [size];		
//		for(int i=0;i<size;i++) {
//			arr[i]=scan.nextInt();
//		}
		int size=10;
		int arr[]={10,20,30,40,50,60,70,80,90,100};
		int key= scan.nextInt();
		int low=0;
		int high=size;
		int mid=(low+high)/2;
		Arrays.sort(arr);
		int ans =getIndex(arr,key,low,high,mid);
		
		if(ans==-1) {
			System.out.println("Element Not found");
		}else {
			System.out.println("Elementat index"+ans);
		}
		
		
		scan.close();

	}

	

}
