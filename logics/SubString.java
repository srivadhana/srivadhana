package com.logics;

public class SubString {

	public static void main(String[] args) {
		String str = "hello";
		System.out.println("Result1:"+str.substring(0, 2));//1st index inclusive ,2nd index exclusive
		
		System.out.println("Result1:"+str.substring(0, 0)); 		
		//The substring() method will return an empty String if beginIndex= endIndex.
		//The substring() method will throw IndexOutOfBoundsException if start < 0 or start > end
		
		System.out.println("Result2:"+str.substring(1));//it takes from mentioned index
		//till the end from string
	}

}
