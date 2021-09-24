package com.logics;

import java.util.HashMap;

public class DuplicateCharactersUsingHashMap {

	public static void main(String[] args) {
		String str = "java2blog.com ";
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}

		}
		for (Object c : charCountMap.keySet()) {
			System.out.println("duplicate character : " + c + " ====== " + " count : " + charCountMap.get(c));
		}

	}

}
