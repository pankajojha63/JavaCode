package com.strings;

public class LongestSubstring {
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

	private static int lengthOfLongestSubstring(String s) {
		char[] chArr = s.toCharArray();
		char ch = chArr[0];
		int pointer =1;
		while(pointer<s.length()){
			if(ch != chArr[pointer]){
				
			}
		}
		
		return s.length();
	}
}
