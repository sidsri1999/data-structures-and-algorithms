package com.youtube.adityaverma.binarysearch;

/*Link: 
 * https://www.youtube.com/watch?v=FzvK5uuaki8&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=13
 * 
 * Problem: in this, we need to find the index of target element in an infinite sorted array,
 * means we are not aware about ending point.
 * 
 * As, we can't create an infinite array in our program, 
 * So, we are taking input [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15], target: 8
 * Output: 7 
 * */

public class _12ElementInInfiniteSortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int target = 16;
		int res1 = searchElementInInfiniteSortedArray(arr1, target);
		if (res1 != -1) {
			System.out.println("Index of target Element: " + res1);
		} else {
			System.out.println("Target element not found");
		}
	}

	private static int searchElementInInfiniteSortedArray(int[] arr, int target) {
		int[] startEndIndex = findStartEndIndex(arr, target);
		int start = startEndIndex[0];
		int end = startEndIndex[1];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	private static int[] findStartEndIndex(int[] arr, int target) {
		int start = 0;
		int end = 1;
		// we are assuming arr will never end, otherwise it will give array out of bound
		// exception.
		while (target > arr[end]) {
			start = end;
			end = end * 2;
		}
		return new int[] { start, end };
	}

//	private static int searchElementInInfiniteSortedArray(int[] arr, int target) {
//		int start = 0;
//		int end = 1;
//		while (start <= end) {
//			int mid = start + (end - start) / 2;
//			if (arr[mid] == target) {
//				return mid;
//			}
//			if (arr[mid] > target) {
//				end = mid - 1;
//			} else {
//				start = mid+1;
//				end = end * 2;
//			}
//		}
//		return -1;
//	}

}
