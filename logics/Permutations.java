package com.logics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Take out first character of String and insert into different places of permutations of remaining String recursively.
public class Permutations {
	 public static void main(String[] args) {		 
		 System.out.println("entering the prgm>>>>>>>>>>>>>>");
	     Set<String> set=permutationOfString("ABC");
	     System.out.println("returned set==>"+set);
	     System.out.println("Permutations of String ABC are:");
	     for (Iterator iterator = set.iterator(); iterator.hasNext();) {
	   String string = (String) iterator.next();
	   System.out.println(string);   
	  }
	 }	 
	 public static Set permutationOfString(String str)
	 {
	  Set permutationSet=new HashSet();	 
	  if(str.length()==0)
	  {
	   permutationSet.add("");
	            return permutationSet;
	  }	 
	  // take out first character of String
	  char c=str.charAt(0);
	  System.out.println("First Char==>"+c);
	  // Remaining String
	  String rem=str.substring(1);
 	  System.out.println("rem==>"+rem);
	 

	  
 	  //returning empty so at empty initially  the first char is 'C'
 	  //returning [c] so the first char is 'B'
 	  //returning [BC] [CB] so the first char is 'A'
	  Set<String> permutatedSetForRemainingString=permutationOfString(rem);
	  System.out.println("char=====>"+ c);
	  System.out.println("permutatedSetForRemainingString===>"+permutatedSetForRemainingString);
	  for (String permutedString: permutatedSetForRemainingString) {
	   for (int j = 0; j <= permutedString.length(); j++) {
		 
	    String permutation=insertFirstCharAtDiffPlaces(permutedString,c,j);
	    permutationSet.add(permutation);
	   }	 
	  }
	  System.out.println("permutationSet reurned for recursion==>"+permutationSet);
	  return permutationSet;	 //go to line 39
	 }
	 public static String insertFirstCharAtDiffPlaces(String perm,char firstChar,int index)
	 {
	  // Inserting firstCharacter of orig String at difference places based on index
		 System.out.println("perm==>"+perm +"\t" +"firstchar==>"+firstChar+"\t"+"index==>"+index);
		 System.out.println("perm.substring(0,index)==>"+perm.substring(0,index));
		 System.out.println("FirstChar==>"+firstChar);
		 System.out.println("perm.substring(index)==>"+perm.substring(index));
		 System.out.println(perm.substring(0,index)+firstChar+perm.substring(index));
	  return perm.substring(0,index)+firstChar+perm.substring(index);
	 }
}

//Logic
//substring(0,0)  1st index inclusive ,2nd index exclusive
//substring(0) it take from mentioned index till the end from string

//length starts from 1 
// index starts from 0
//Adding one one char at different positions from the resulted char which starts from empty,then 1 char,then 2 chars etc
/*Lets say you have String as ABC.
So we take out A from ABC
First character =A and RemainingString = BC 
As we are applying recursion here, we will find permutations of BC.
Take out B from BC.
First character= B and RemainingString = C 
As we are applying recursion here, we will find permutations of C.
When we take out C, our String size becomes 0 and that is our base case here.
First character = C and RemainingString = “” 
We insert C to differences indexes of Permutations  of RemainingString(“”), so we get permutation of C as C.
We insert B to different indexes of Permutations of remainingString(C), so we get BC and CB.
C: BC, CB
Now we insert A to different indexes in BC and CB.
BC : ABC , BAC , BCA
CB : ACB, CAB, CBA
so thats how we got all permutations of ABC.
It may look tricky but once you practice the solution, you will be able to understand it better*/