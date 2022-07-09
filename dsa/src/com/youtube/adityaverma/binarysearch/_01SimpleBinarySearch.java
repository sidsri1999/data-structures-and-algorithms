package com.youtube.adityaverma.binarysearch;

//Link: https://www.youtube.com/watch?v=QNGL_t_o_QA&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=2

public class _01SimpleBinarySearch {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int result1 = binarySearch(arr1, 2); // Output: 1, as the 2 is available at index 1
		System.out.println("Result1 : " + result1);
		int[] arr2 = { 1 };
		int result2 = binarySearch(arr2, 1); // 0
		System.out.println("Result2 : " + result2);
		int[] arr3 = { 1, 2, 3, 4 };
		int result3 = binarySearch(arr3, 5); // -1
		System.out.println("Result3 : " + result3);
		int[] arr4 = {};
		int result4 = binarySearch(arr4, 5); // -1
		System.out.println("Result4 : " + result4);
	}

	private static int binarySearch(int[] arr, int number) {
		int start = 0;
		int end = arr.length - 1;

		// we are also taking equal, suppose if 1 element, start = end = mid, and
		// arr[mid] =
		// number, so if we can't take then we will miss that
		while (start <= end) {
			// we can also use mid = (start + end)/2, but it may lead to integer overflow
			int mid = start + (end - start) / 2;
			if (arr[mid] == number) {
				return mid;
			} else if (arr[mid] > number) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

}
