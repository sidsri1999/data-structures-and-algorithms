package com.youtube.adityaverma.binarysearch;

// Link: https://www.youtube.com/watch?v=5cx0xerA8XY&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=10

// Problem: in this, we need to find the index of greatest element whos is less than or equal to given target value

// Input: [1, 2, 3, 4, 8, 10, 10, 12, 19], Element = 5 
// Output: 3 , i.e. arr[3] = 4

public class _09FloorElementInSortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 8, 10, 10, 12, 19 };
		int target1 = 5;
		System.out.println("Index of Floor of element in sorted array: " + floorElementBS(arr1, target1));
	}

	private static int floorElementBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int floor = -1; // We are assuming number start from 0
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				floor = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return floor;
	}

}
