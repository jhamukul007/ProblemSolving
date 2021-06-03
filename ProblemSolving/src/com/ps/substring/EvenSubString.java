package com.ps.substring;
/*
 * https://www.geeksforgeeks.org/number-of-substrings-with-each-character-occurring-even-times/
 */
public class EvenSubString {
	
	public static int numOfSubStringEvenCount(String str) {
		if(str==null || str==""|| str.length()<2)
			return 0;
		int len=str.length();
		int[] temp=new int[256];
		int count=0;
		for(int i=0;i<len;) {
		B:	for(int j=i+1;j<=len;) {
				if((j-i)%2==0) {
					temp=new int[256];
					String subStr=str.substring(i,j);
					for(int k=0;k<subStr.length();k++) {
						temp[subStr.charAt(k)]++;
					}
					for(int k=0; k<256;k++) {
						if((temp[k]%2)!=0) {
							j++;
							continue B;
						}
					}
					count++;
				}
				j++;
			}
		i++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		//int[] arr=new int[256];
		String str="abbaa";
		String str1="geeksforgeeks";
		//System.out.println(numOfSubStringEvenCount(str1));
		int i=8;
		
		System.out.println(3|5);
	}
}
