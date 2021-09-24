package com.logics;

//Anagram To find whether two strings are equal in length with same characters but appeared in different order
public class AnagramsUsingStringMethod {
	 public static void main(String[] args) {		 
	        String word = "java2blog";
	        String anagram = "aj2vabgol";	 
	        System.out.println("java2blog and aj2vabgol are anagrams :" + isAnagramUsingStringMethods(word, anagram));
	 
	    }	 
	    public static boolean isAnagramUsingStringMethods(String word, String anagram) {
	        if (word.length() != anagram.length())
	            return false;	 
	        for (int i = 0; i < word.length(); i++) {
	            char c = word.charAt(i);
	            int index = anagram.indexOf(c);
	            // If index of any character is -1, then two strings are not anagrams
	            // If index of character is not equal to -1, then remove the chacter from the
	            // String
	            if (index != -1) {
	            	  //System.out.println(anagram);
	                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
	                System.out.println(anagram);
	            } else
	                return false;
	        }
	        return anagram.isEmpty();
	    }
	 
}
//logic 
//1.array means charAt[i]
//2. without array means charAt(i)
//3.java2blog  --> charAt(0) =j --> aj2vabgol.indexOf(j) = 1  will return which is not equal to -1
//4.so it will remove j from the string
