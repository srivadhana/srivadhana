package com.logics;

import java.util.Scanner;

public class DiamondPatternAlphabet {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows");
		int n = sc.nextInt();
		int letter = 65;
		int small_letter = 97;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { //spaces decremented 
				System.out.print((char) letter++ + " "); //alphabet incremented
			}
			System.out.println(" ");
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {//spaces incremented
				System.out.print(" ");
			}
			for (int j = n; j > i; j--) { 
				System.out.print((char) letter++ + " ");
			}
			System.out.println(" ");
		}
	}
}
