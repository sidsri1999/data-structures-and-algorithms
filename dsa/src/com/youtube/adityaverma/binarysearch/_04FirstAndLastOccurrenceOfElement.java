package com.youtube.adityaverma.binarysearch;

// Link: https://www.youtube.com/watch?v=zr_AoTxzn0Y&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=5

// Note: In this, there is possibility of duplicates, so we have to find the first and last occurrence of that number

public class _04FirstAndLastOccurrenceOfElement {

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 10, 10, 10, 18, 20 };
		int result1FirstOccurrence = findFirstOccurrence(arr1, 10);
		int result1LastOccurrence = findLastOccurrence(arr1, 10);
		System.out.println(
				"Result1: FirstOccurrence= " + result1FirstOccurrence + ", LastOccurrence= " + result1LastOccurrence);
		int[] arr2 = { 1 };
		int result2FirstOccurrence = findFirstOccurrence(arr2, 1);
		int result2LastOccurrence = findLastOccurrence(arr2, 1);
		System.out.println(
				"Result2: FirstOccurrence= " + result2FirstOccurrence + ", LastOccurrence= " + result2LastOccurrence);
		int[] arr3 = { 1, 2, 3, 4 };
		int result3FirstOccurrence = findFirstOccurrence(arr3, 5);
		int result3LastOccurrence = findLastOccurrence(arr3, 5);
		System.out.println(
				"Result3: FirstOccurrence= " + result3FirstOccurrence + ", LastOccurrence= " + result3LastOccurrence);
		int[] arr4 = {};
		int result4FirstOccurrence = findFirstOccurrence(arr4, 2);
		int result4LastOccurrence = findLastOccurrence(arr4, 2);
		System.out.println(
				"Result4: FirstOccurrence= " + result4FirstOccurrence + ", LastOccurrence= " + result4LastOccurrence);
	}

	private static int findFirstOccurrence(int[] arr, int number) {
		int start = 0;
		int end = arr.length - 1;
		int firstOccurrence = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == number) {
				firstOccurrence = mid;
				end = mid - 1;
			} else if (arr[mid] < number) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return firstOccurrence;
	}

	private static int findLastOccurrence(int[] arr, int number) {
		int start = 0;
		int end = arr.length - 1;
		int lastOccurrence = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == number) {
				lastOccurrence = mid;
				start = mid + 1;
			} else if (arr[mid] < number) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return lastOccurrence;
	}

}
