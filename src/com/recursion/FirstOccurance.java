package com.recursion;

import java.util.Scanner;

public class FirstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int power = scan.nextInt();
		System.out.println(power_function(n, power));
		scan.close();

	}

	private static int power_function(int n, int power) {

		if (power > 1) {
			return n * power_function(n, power - 1);
		} else {
			return n;

		}

	}

}
