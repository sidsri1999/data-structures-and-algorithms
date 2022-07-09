package com.youtube.adityaverma.binarysearch;

import java.text.ParseException;

/*Link: 
 * https://www.youtube.com/watch?v=OINnBJTRrMU&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=17
 * 
 * Problem: In this, we have an unsorted array and we need to find the element in array such that the element must be greater
 * than than its left and right neighbour, assume arr[-1] = -infinity and arr[n] = -infinity, there may be more than one peak
 * element, but we need to find anyone.
 * Note: arr[i] != arr[i + 1] for all valid i.
 * 
 * Input:  [5, 10, 20, 15]
 * Output: 20
 * */

public class _15PeakElement {

	public static void main(String[] args) throws ParseException {
		
		int[] arr1 = { 5, 10, 20, 15 };
		if(arr1.length==1) {
			System.out.println("Peak Element: "+arr1[0]);
		}else {
			int peakIndex1 = getPeakIndex(arr1);
			if(peakIndex1!=-1) {
				System.out.println("Peak Element: "+arr1[peakIndex1]);
			} else if(arr1[0]>arr1[arr1.length-1]){
				System.out.println("Peak Element: "+arr1[0]);
			} else if(arr1[0] < arr1[arr1.length-1]) {
				System.out.println("Peak Element: "+arr1[arr1.length-1]);
			} else {
				System.out.println("No Peak Element");
			}
		}
		
	}

	private static int getPeakIndex(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid-1>=0 && mid+1<arr.length && arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) {
				return mid;
			} else if (mid+1<arr.length && arr[mid+1]>arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
