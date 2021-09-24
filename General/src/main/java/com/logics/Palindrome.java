package com.logics;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str) {
    	if(str==null) {
    		return false;
    	}
    	for(int i=0,j=str.length();i<j;i++,j--) {
    		if(str.charAt(i)!=str.charAt(j)) {
    			return false;
    		}
    	}    	
    	return true;
    }
    public static void main (String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the String==>");
    	String s=sc.next();
    	if(isPalindrome(s)) {
    		 System.out.println("Palindrome");
    	}
    	else {
    		System.out.println("Not Palindrome");
    	}
    }
}
