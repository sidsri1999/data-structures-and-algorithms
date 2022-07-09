package com.youtube.adityaverma.binarysearch;

// Link: https://www.youtube.com/watch?v=Id-DdcWb5AU&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=8

// Problem: Earlier Array was sorted, then its rotated, means added few elements in serial from start
// to end, now we need to find the minimum element (How many times, it got rotated, or index of minimum
// element)

// Input: [11, 12, 15, 18, 2, 5, 6, 8]
// Output: 2

public class _07SearchElementInRotatedSortedArray {

	public static void main(String[] args) {
		int i = (int) (1e9+7);
		System.out.println(i);
		System.out.println(i);
		int[] arr1 = { 1};
//		int[] arr1 = { 2, 5, 6, 8, 11, 12, 15, 18 };
		int target1 = 0;
		int minIndex1 = findMinimumElementIndex(arr1);
		if (arr1[arr1.length - 1] >= target1) {
			System.out.println(
					"Index of target element: " + simpleBinarySearch1(arr1, minIndex1, arr1.length - 1, target1));
		} else {
			System.out.println("Index of target element: " + simpleBinarySearch(arr1, 0, minIndex1 - 1, target1));
		}
	}

	private static int findMinimumElementIndex(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int n = arr.length;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int prev = (mid - 1 + n) % n;
			int next = (mid + 1 + n) % n;
			if (arr[prev] > arr[mid] && arr[mid] < arr[next]) {
				return mid;
			} else {
				if (arr[end] < arr[mid]) {
					start = next;
				} else {
					end = prev;
				}
			}
		}
		return -1;
	}

	private static int simpleBinarySearch(int[] arr, int start, int end, int target) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static int simpleBinarySearch1(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
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
