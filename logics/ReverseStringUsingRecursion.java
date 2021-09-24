package com.logics;

//We can also use recursion to reverse a String in java. 
//We will process last character of String and call recursive function for rest of the String.
//Base case of the recursion will be once the length of String is 1.

public class ReverseStringUsingRecursion {
	 public static void main(String[] args) {
		 ReverseStringUsingRecursion rsr = new ReverseStringUsingRecursion();
	        String blogName = "java2blog";
	        System.out.println("String length--->"+blogName.length());
	        System.out.println(blogName.charAt(8));
	        System.out.println("substring result---->"+blogName.substring(0,8));
	        String reverse = rsr.recursiveReverse(blogName);
	        System.out.println("Reverse of java2blog is:" + reverse);
	    }
	 
	    public String recursiveReverse(String orig) {
	        if (orig.length() == 1)
	            return orig;
	        else
	            return orig.charAt(orig.length() - 1) + 
	                          recursiveReverse(orig.substring(0, orig.length() - 1));
	 
	    }
}
//logic
//1.array means from 0 it will calculate
//2.length means from 1 it will calculate
//3.for substring it will minus the one number for last index value
