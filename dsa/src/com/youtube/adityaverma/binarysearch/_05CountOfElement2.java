package com.youtube.adityaverma.binarysearch;

// Link: https://www.youtube.com/watch?v=Ru_HhBFV3Xo&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=6

// Note: In this, there is possibility of duplicates, so we have to find total count that element present

public class _05CountOfElement2 {

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 10, 10, 10, 18, 20 };
		int result1FirstOccurrence = findFirstOccurrence(arr1, 10);
		int result1LastOccurrence = findLastOccurrence(arr1, 10);
		System.out.println(result1LastOccurrence-result1FirstOccurrence+1);
		System.out.println(result1LastOccurrence==-1);
		System.out.println(
				"Result1: TotalNumber= " + (result1LastOccurrence!=-1 ?(result1LastOccurrence-result1FirstOccurrence+1):0));
		int[] arr2 = { 1 };
		int result2FirstOccurrence = findFirstOccurrence(arr2, 1);
		int result2LastOccurrence = findLastOccurrence(arr2, 1);
		System.out.println(
				"Result2: TotalNumber= " + (result2LastOccurrence!=-1 ?result2LastOccurrence-result2FirstOccurrence+1:0));
		int[] arr3 = { 1, 2, 3, 4 };
		int result3FirstOccurrence = findFirstOccurrence(arr3, 5);
		int result3LastOccurrence = findLastOccurrence(arr3, 5);
		System.out.println(
				"Result3: TotalNumber= " + (result3LastOccurrence!=-1 ? result3LastOccurrence-result3FirstOccurrence+1 : 0));
		int[] arr4 = {};
		int result4FirstOccurrence = findFirstOccurrence(arr4, 2);
		int result4LastOccurrence = findLastOccurrence(arr4, 2);
		System.out.println(
				"Result4: TotalNumber= " + (result4LastOccurrence!=-1 ?result4LastOccurrence-result4FirstOccurrence+1:0));
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
