package com.youtube.adityaverma.binarysearch;

/*Link: 
 * https://www.youtube.com/watch?v=3RhGdmoF_ac&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=15
 * 
 * Problem: In this, we have a sorted array and given one target, and we need to find the closest element in array with that
 * target.
 * 
 * As, we can't create an infinite array in our program, 
 * Input:  [4, 6, 10], target: 7
 * Output: 6
 * */

public class _14MinimumDifferenceElement {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 10 };
		int target1 = 7;
		if (arr1.length == 1) {
			System.out.println("Nearest Element is: " + arr1[0]);
		} else {
			int res1 = minimumDifferenceElementIndex(arr1, target1);
			System.out.println("Nearest Element is: " + arr1[res1]);
		}

	}

	private static int minimumDifferenceElementIndex(int[] arr, int target) {
		int start = 0;
		int end = arr.length;
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
		return Math.abs(arr[start] - target) < Math.abs(arr[end] - target) ? start : end;
	}

}
