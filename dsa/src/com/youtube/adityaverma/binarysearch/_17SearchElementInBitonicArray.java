package com.youtube.adityaverma.binarysearch;

import java.text.ParseException;

/*Link: 
 * https://www.youtube.com/watch?v=IjaP8qt1IYI&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=19
 * 
 * Problem: In this, we have array which will be strictly increasing then strictly decreasing, there may be scenario when we have all strictly increasing or
 * strictly decreasing but not more than this, assume arr[-1] = -infinity and arr[n] = -infinity. Now, we have given one target we need to find, where that
 * target will be present.
 * 
 * Input:  [1, 3, 8, 12, 4, 2], target = 4
 * Output: 4
 * */

public class _17SearchElementInBitonicArray {

	public static void main(String[] args) throws ParseException {

		int[] arr1 = { 1, 3, 8, 12, 4, 2 };
		int target1 = 4;
		if (arr1.length == 1) {
			if (target1 == arr1[0]) {
				System.out.println("Target index: " + 0);
			} else {
				System.out.println("Not Found");
			}
		} else {

			// Getting Max Index
			int maxIndex = getMaxIndex(arr1);
			if (maxIndex == -1) {
				if (arr1[0] > arr1[arr1.length - 1]) {
					maxIndex = 0;
				} else if (arr1[arr1.length - 1] > arr1[0]) {
					maxIndex = arr1.length - 1;
				}
			}
			// Max Index is not going to be -1, otherwise it will not be bitonic array.

			// Check in LHS of maxIndex, including maxIndex
			int targetIndex = -1;
			// Check in LHS of maxIndex, including maxIndex
			if (arr1[0] <= target1 && target1 <= arr1[maxIndex]) {
				targetIndex = simpleBinarySearch(arr1, 0, maxIndex, target1);
			}
			// Check in RHS of maxIndex, if we didn't find targetIndex in LHS
			if (targetIndex == -1 && arr1[arr1.length - 1] <= target1
					&& ((maxIndex + 1 < arr1.length) && target1 <= arr1[maxIndex + 1])) {
				targetIndex = reversedBinarySearch(arr1, maxIndex + 1, arr1.length - 1, target1);
			}

			if (targetIndex != -1) {
				System.out.println("Target Index: " + targetIndex);
			} else {
				System.out.println("Not Found");
			}
		}
	}

	private static int getMaxIndex(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid - 1 >= 0 && mid + 1 < arr.length && arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
				return mid;
			} else if (mid + 1 < arr.length && arr[mid + 1] > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	private static int simpleBinarySearch(int[] arr, int start, int end, int target) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	private static int reversedBinarySearch(int[] arr, int start, int end, int target) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
