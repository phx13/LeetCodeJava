package sort;

import java.util.*;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

//
// 
//
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false
// 
//
//Constraints:
//
//1 <= s.length, t.length <= 5 * 104
//s and t consist of lowercase English letters.

public class Q242_Valid_Anagram {
	public static void main(String[] args) {
		String s = "rat";
		String t = "rac";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		Arrays.sort(sChars);
		Arrays.sort(tChars);
		return Arrays.equals(sChars, tChars);
	}
}
