package com.ps.subarray;
/**
 * 
 * https://www.geeksforgeeks.org/smallest-index-that-splits-an-array-into-two-subarrays-with-equal-product/
 * Smallest index that splits an array into two subarrays with equal product
 *
 */
public class SplitsAnArrayIntoTwoSubarrays {
	
	public static int onSameProduct(int[] arr) {
		int defValue=-1;
		if(arr==null || arr.length==1) 
			return defValue;
		int product=1;
		for(int data:arr) {
			product*=data;
		}
		int leftPro=1;
		for(int i=0;i<arr.length;i++) {
			leftPro*=arr[i];
			if((product/leftPro)==leftPro) {
				defValue=i+1;
				break;
			}
		}
		return defValue;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,3,2,1};
		int[] arr1= {1,1};
		int[] arr3= {2,3,6};
		System.out.println(onSameProduct(arr3));
	}
}
