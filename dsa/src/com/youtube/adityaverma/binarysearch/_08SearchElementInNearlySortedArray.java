package com.youtube.adityaverma.binarysearch;

// Link: https://www.youtube.com/watch?v=W3-KgsCVH1U&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=9

// Problem: Array is nearly sorted means element i can be present at i+1 position or i-1 position

// Input: [5, 10, 30, 20, 40]            Here, 30 is present at index 2 rather than index 3
// Output: 2

public class _08SearchElementInNearlySortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 5, 10, 30, 20, 40, 60, 50 };
		int target1 = 10;
		System.out.println("Index of target element in nearly sorted array: " + nearlySortedBS(arr1, target1));
	}

	private static int nearlySortedBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (mid - 1 >= 0 && arr[mid - 1] == target) {
				return mid - 1;
			}
			if (mid + 1 < arr.length && arr[mid + 1] == target) {
				return mid + 1;
			}
			if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
