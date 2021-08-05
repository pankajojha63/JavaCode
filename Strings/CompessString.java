package com.strings;

public class CompessString {
	public static void main(String[] args) {
		String s = "a";
		System.out.println(compress(s.toCharArray()));
	}

	public static int compress(char[] chars) {
		int i = 0, j = 0, count = 0;
		String s = "";
		while (i < chars.length) {
			if (chars[i] == chars[j]) {
				count++;
				j++;
			} else {
				if(count>1)
					s = s.concat(chars[i] + "" + count);
				else
					s = s.concat(chars[i]+"");
				i = j;
				count = 0;
			}
			if (j == chars.length) {
				if(count>1)
					s = s.concat(chars[i] + "" + count);
				else
					s = s.concat(chars[i]+"");
				break;
			}
		}
		for(int k=0;k<s.length();k++){
			chars[k] = s.charAt(k);
		}
		return s.length();
	}
}
