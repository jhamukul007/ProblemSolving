package com.ps.substring;
/*
 * Smallest substring occurring only once in a given string
 * https://www.geeksforgeeks.org/smallest-substring-occurring-only-once-in-a-given-string/
 */

import java.util.HashMap;
import java.util.Map;

public class SmallestSubstringOccurring {
	public static int smallestSubString(String str) {
		if(str==null)
			return -1;
		Map<String, Integer> countMap=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String subString =str.substring(i,j);
				countMap.put(subString,countMap.getOrDefault(subString, 0)+1);
			}
		}
		System.out.println(countMap);
		String minSubString="";
		int maxLen=Integer.MAX_VALUE;
		for(Map.Entry<String, Integer> entry:countMap.entrySet()) {
			int value=entry.getValue();
			if(value==1) {
				String key=entry.getKey();
				System.out.println(entry.getKey());
				if(key.length()<maxLen) {
					minSubString=key;
					maxLen=key.length();
				}
			}
		}
		return minSubString.length();
	}
	
	public static void main(String[] args) {
		String s="zyzyzyz";
		String s1="rererere";
		String s2="asdfasdfd";
		String s3="ffffhhhhfffffhhhhhfffhhh";
		String s4="asdfdfasddfdfaddsasadsasadsddsddfdsasdf";
		//System.out.println(smallestSubString(s3));
		subString("azABaabba");
	}
	
	static void subString(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String subString =str.substring(i,j);
				System.out.println(subString);
			}
		}
	}
}
