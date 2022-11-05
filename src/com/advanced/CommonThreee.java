package com.advanced;

import java.util.Arrays;
import java.util.Scanner;

public class CommonThreee {

	private static void common_elemen(int[] a, int[] b, int[] c, int x, int y, int z) {
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		int i = 0, j = 0, k = 0;

		while (i < x && j < y && k < z) {


		 if (a[i] == b[j] && b[j] == c[k]) {
				System.out.print(a[i] + " ");
				i++;
				j++;
				k++;
			} else {
				if (a[i] <= b[j] && a[i] <= c[k]) {
					i++;
				} else if (b[j] <= c[k] && b[j] <= a[i]) {
					j++;
				} else if (c[k] <= a[i] && c[k] <= b[j]) {
					k++;
				}
			}

		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int[] A = new int[x];
		for (int i = 0; i < x; i++) {
			A[i] = scan.nextInt();
		}

		int y = scan.nextInt();
		int[] B = new int[y];
		for (int i = 0; i < y; i++) {
			B[i] = scan.nextInt();
		}
		int z = scan.nextInt();
		int[] C = new int[z];
		for (int i = 0; i < z; i++) {
			C[i] = scan.nextInt();
		}

		print_arr(A);
		print_arr(B);
		print_arr(C);
		System.out.println("common Element");
		common_elemen(A, B, C, x, y, z);
		scan.close();

	}

	private static void print_arr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
