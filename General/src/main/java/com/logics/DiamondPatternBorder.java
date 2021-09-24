package com.logics;

import java.util.Scanner;

public class DiamondPatternBorder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows");
		int n = sc.nextInt();
		int letter = 65;
		int small_letter = 97;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) { //spaces decremented 
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { 
				if((j==1) ||(j==i)) { //j<=i last time with last position checking so printing that value
					System.out.print((char) small_letter++ + " "); //alphabet incremented
				}
				else {
					System.out.print(" "+" ");
				}				
			}
			System.out.println(" ");
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {//spaces incremented
				System.out.print(" ");
			}
			for (int j = n; j > i; j--) {
				if((j==n) ||(j==i+1)) { // if i=1 then j condition passed up to when i=2
				System.out.print((char) small_letter++ + " ");//alphabet decremented
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println(" ");
			
		}
	}

}
