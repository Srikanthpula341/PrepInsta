package com.recursion;

import java.util.Scanner;

public class Factroial {
	
	
	private static int factroial(int n) {
			
		if(n>1) {
			return n * factroial(n-1);
		}else {
			return 1;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		System.out.println(factroial(n));
		scan.close();
	}

	

}
