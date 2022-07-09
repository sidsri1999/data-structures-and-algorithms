package com.youtube.adityaverma.binarysearch;

// Link: https://www.youtube.com/watch?v=4WmTRFZilj8&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=7

// Problem: Earlier Array was sorted, then its rotated, means added few elements in serial from start
// to end, now we need to find the minimum element (How many times, it got rotated, or index of minimum
// element)

// Input: [11, 12, 15, 18, 2, 5, 6, 8]
// Output: 2

public class _06RotatedSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {11, 12, 15, 18, 2, 5, 6, 8};
		int minIndex = findMinimumElementIndex(arr1);
		int n = arr1.length;
		System.out.println("Result 1--------------");
		System.out.println("Min Index: "+minIndex);
		System.out.println("Min Value: "+arr1[minIndex]);
		System.out.println("Number of times array is rotated: "+((n-minIndex+1)%n));
	}

	private static int findMinimumElementIndex(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int n = arr.length;
		while(start<=end) {
			int mid = start + (end-start)/2;
			int prev = ( mid - 1 +n)%n;
			int next = (mid+1+n)%n;
			if(arr[prev]> arr[mid] && arr[mid]<arr[next]) {
				return mid;
			}else {
				if(arr[end]<arr[mid]) {
					start = next;
				}else {
					end = prev;
				}
			}
		}
		return -1;
	}
	
}
