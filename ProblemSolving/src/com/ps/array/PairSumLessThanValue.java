package com.ps.array;

import java.util.Arrays;

public class PairSumLessThanValue {
	public static int maximumPairSumLessThanValue(int[] arr, int total) {
		int maxPairSum=-1;
		if(arr==null)
			return maxPairSum;
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while(i!=j) {
			int sum=arr[i]+arr[j];
			if(sum<total) {
				if(sum>maxPairSum)
					maxPairSum=sum;
				i++;
			}
			else if(sum>total)
				j--;
		}
		return maxPairSum;
	}
	
	public static void main(String[] args) {
		int[] arr= {34,23,1,24,75,33,54,8}; int k=60;
		System.out.println(maximumPairSumLessThanValue(arr, k));
		int[] arr1= {10,20,30}; int k1=15;
		System.out.println(maximumPairSumLessThanValue(arr1, k1));
				
		
	}
}
