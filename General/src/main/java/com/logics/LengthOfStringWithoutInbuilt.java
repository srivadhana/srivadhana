package com.logics;

// You can use try catch block for catching StringIndexOutOfBoundException and
//when this exception aries, you can simply return i(Index at which you will get the exception)
public class LengthOfStringWithoutInbuilt {
	public static void main(String args[]) {
		String helloWorld = "This is hello world";
		System.out.println("length of helloWorld string :" + getLengthOfStringWithCharArray(helloWorld));
	}

	public static int getLengthOfStringWithCharArray(String str) {
		int length = 0;
		char[] strCharArray = str.toCharArray();
		for (char c : strCharArray) {
			length++;
		}
		return length;
	}
}

//logic
//Convert string to char array using toCharArray method
//Iterate over char array and incrementing length variable.
