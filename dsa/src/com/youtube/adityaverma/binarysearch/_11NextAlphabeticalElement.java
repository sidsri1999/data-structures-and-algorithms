package com.youtube.adityaverma.binarysearch;

//Link: https://www.youtube.com/watch?v=X45c37QMdX0&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=12

//Problem: in this, we need to find the index of next character who is nearest or greater than to given target value, the target value may or may not be present in array

//Input: ['a', 'c', 'f', 'h'], Element = 'f'
//Output: 3 , i.e. arr[4] = 'h'

public class _11NextAlphabeticalElement {

	public static void main(String[] args) {
		char[] arr1 = { 'a', 'c', 'h' };
		char target1 = 'k';
		int res1 = nextAlphabeticalElement(arr1, target1);
		if (res1 != -1) {
			System.out.println("Next Character: " + arr1[res1]);
		} else {
			System.out.println("Next Character Not Found");
		}
	}

	private static int nextAlphabeticalElement(char[] arr, char target) {
		int start = 0;
		int end = arr.length - 1;
		int nextElementIndex = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] <= target) {
				start = mid + 1;
			} else {
				nextElementIndex = mid;
				end = mid - 1;
			}
		}
		return nextElementIndex;
	}

}
