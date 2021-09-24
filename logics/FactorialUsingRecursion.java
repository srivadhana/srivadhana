package com.logics;

public class FactorialUsingRecursion {
	public static void main(String args[]) {
		System.out.println(factorial(4));
	}

	private static int factorial(int i) {
		if (i == 0) {
			// return 0; //this is wrong because it will give 0 result finally
			System.out.println("final i value=>" + i);
			return 1; //here 1 is multplied with the other numbers and direcltly goes to else return part.
		} else {
			System.out.println(i);			
			return i * (factorial(i - 1));
		}
	}
}

//logic

//when i=0 condition met
//it will return the 1(1*2*3*4) =24 which is in the else stmt as a whole and print it.
