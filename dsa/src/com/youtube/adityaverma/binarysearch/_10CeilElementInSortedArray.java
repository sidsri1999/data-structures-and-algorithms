package com.youtube.adityaverma.binarysearch;

//Link: https://www.youtube.com/watch?v=uiz0IxPCUeU&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=11

//Problem: in this, we need to find the index of next element who is greater than or equal to given target value

//Input: [1, 2, 3, 4, 8, 10, 10, 12, 19], Element = 5 
//Output: 4 , i.e. arr[4] = 8

public class _10CeilElementInSortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 8, 10, 10, 12, 19 };
		int target1 = 5;
		System.out.println("Index of Floor of element in sorted array: " + ceilElementBS(arr1, target1));
	}

	private static int ceilElementBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int ceil = -1; // We are assuming number start from 0
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				start = mid + 1;
			} else {
				ceil = mid;
				end = mid - 1;
			}
		}
		return ceil;
	}

}
