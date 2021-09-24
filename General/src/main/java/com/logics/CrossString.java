package com.logics;

import java.util.Scanner;

public class CrossString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String----------->");
		String str = sc.next();
		if (str.length() % 2 == 0) {
			return;
		} else {
			int size = str.length();
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < str.length(); j++) {
					if (i == j) {
						System.out.print(str.charAt(i) + " ");
						if (i == str.length() / 2) {
							System.out.println("remainder="+str.length()/2 +"\t"+"i="+i);
							--size; //so that next iteration it won't print in that particular index
							//which appears centre for both left to right and right to left
							//it got printed from left to right and from right to left it won't print
							//it decrement the size so that next right to left index will be correct
						}
					} else if (i + j == str.length() - 1) {
						System.out.print(str.charAt(--size) + " ");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println();
			}
			
		}

	}

}
