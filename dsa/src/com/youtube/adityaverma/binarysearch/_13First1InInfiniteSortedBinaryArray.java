package com.youtube.adityaverma.binarysearch;

/*Link: 
 * https://www.youtube.com/watch?v=8x6dmO6XW8k&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=14
 * 
 * Problem: in this, we have a binary sorted infinite array means having 0 and 1 in sorted order, and we need to find the
 * the index of 1 when it occurred first time.
 * 
 * As, we can't create an infinite array in our program, 
 * So, we are taking input [0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1], target: 1
 * Output: 9
 * */

public class _13First1InInfiniteSortedBinaryArray {

	public static void main(String[] args) {
		int[] arr1 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 };
		int res1 = searchElementInInfiniteSortedArray(arr1, 1);
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
		int firstOccurrence = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				firstOccurrence = mid;
				end = mid-1;
			}
			else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return firstOccurrence;
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

}
