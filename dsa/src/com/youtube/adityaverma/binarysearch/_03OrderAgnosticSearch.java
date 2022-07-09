package com.youtube.adityaverma.binarysearch;

// Link: https://www.youtube.com/watch?v=gY2b-Q6wDEM&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=4

// Note: we are not aware whether it is sorted in ascending or descending

public class _03OrderAgnosticSearch {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------------");
		System.out.println("Reversed Binary Search");
		int[] arr1 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int result1 = callAppropriateSearch(arr1, 2); // Output: 8, as the 2 is available at index 8
		System.out.println("Result1 : " + result1);
		int[] arr2 = { 1 };
		int result2 = callAppropriateSearch(arr2, 1); // 0
		System.out.println("Result2 : " + result2);
		int[] arr3 = { 4, 3, 2, 1 };
		int result3 = callAppropriateSearch(arr3, 5); // -1
		System.out.println("Result3 : " + result3);
		int[] arr4 = {};
		int result4 = callAppropriateSearch(arr4, 5); // -1
		System.out.println("Result4 : " + result4);
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Simple Binary Search");
		int[] arr5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int result5 = callAppropriateSearch(arr5, 2); // Output: 1, as the 2 is available at index 1
		System.out.println("Result5 : " + result5);
		int[] arr6 = { 1 };
		int result6 = callAppropriateSearch(arr6, 1); // 0
		System.out.println("Result6 : " + result6);
		int[] arr7 = { 1, 2, 3, 4 };
		int result7 = callAppropriateSearch(arr7, 5); // -1
		System.out.println("Result7 : " + result7);
		int[] arr8 = {};
		int result8 = callAppropriateSearch(arr8, 5); // -1
		System.out.println("Result8 : " + result8);
	}
	
	public static int callAppropriateSearch(int[] arr, int number) {
		if(arr==null || arr.length==0) {
			return -1;
		}
		if(arr[0]<arr[arr.length-1]) {
			return simpleBinarySearch(arr,number);
		}else {
			return reversedBinarySearch(arr,number);
		}
	}

	private static int reversedBinarySearch(int[] arr, int number) {
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

	private static int simpleBinarySearch(int[] arr, int number) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == number) {
				return mid;
			} else if (arr[mid] < number) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
