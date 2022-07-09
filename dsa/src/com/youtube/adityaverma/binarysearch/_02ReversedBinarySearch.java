package com.youtube.adityaverma.binarysearch;

// Link: https://www.youtube.com/watch?v=YbkELwnGRdo&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=3

public class _02ReversedBinarySearch {

	public static void main(String[] args) throws InterruptedException {
		int[] arr1 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int result1 = reversedBinarySearch(arr1, 2); // Output: 8, as the 2 is available at index 8
		System.out.println("Result1 : " + result1);
		int[] arr2 = { 1 };
		int result2 = reversedBinarySearch(arr2, 1); // 0
		System.out.println("Result2 : " + result2);
		int[] arr3 = { 4, 3, 2, 1 };
		int result3 = reversedBinarySearch(arr3, 5); // -1
		System.out.println("Result3 : " + result3);
		int[] arr4 = {};
		int result4 = reversedBinarySearch(arr4, 5); // -1
		System.out.println("Result4 : " + result4);
		
	}

	private static int reversedBinarySearch(int[] arr, int number) throws InterruptedException {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == number) {
				return mid;
			} else if (arr[mid] < number) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

}
