/**
 * 
 */
package com.functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Tagit
 *
 */
public class JavaMoney {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// arg is String
		// return type is int
		Function<String, Integer> func = u -> u.length();
		Integer res1 = func.apply("mkyong"); // 6
		System.out.println(res1);

		// arg is int
		// return type is int
		Function<Integer, Integer> func2 = v -> v - 10;
		Integer res2 = func2.apply(100);
		System.out.println(res2);
		
		// arg is int
		// return type is int
		Function<String, String> func3 = v -> v.concat("World");
		String res3 = func3.apply("Hello");
		System.out.println(res3);
		
		//arg is list
		// return type is int
		List<String> list1= Arrays.asList("a","b","c","d","e");			
		Function<List<String>,Integer> func4 =v->v.size();
		int res4 = func4.apply(list1);
		System.out.println(res4);
		//here v is the arg 
		//here v.size() is return type
		
	}

}
