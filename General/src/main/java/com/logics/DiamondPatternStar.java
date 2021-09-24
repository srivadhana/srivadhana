package com.logics;

import java.util.Scanner;

public class DiamondPatternStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {// space should be decremented
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {// '*' should be incremented
				System.out.print("* ");
			}
			System.out.println(" ");
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" "); //spaces incremented from 1 
			}
			for (int j = n; j > i; j--) {
				System.out.print("* "); //"*" got decremented
			}			
			System.out.println("");
		}

	}

}
