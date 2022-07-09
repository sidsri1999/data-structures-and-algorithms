package com.youtube.adityaverma.binarysearch;

import java.text.ParseException;

/*Link: 
 * https://www.youtube.com/watch?v=BrrZL1RDMwc&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=18
 * 
 * Problem: In this, we have array which will be strictly increasing then strictly decreasing, there may be scenario when we have all strictly increasing or
 * strictly decreasing but not more than this, assume arr[-1] = -infinity and arr[n] = -infinity.
 * 
 * Input:  [1, 3, 8, 12, 4, 2]
 * Output: 12
 * */

public class _16MaximumElementInBitonicArray {

	public static void main(String[] args) throws ParseException {
		
		int[] arr1 = {1, 3, 8, 12, 4, 2};
		if(arr1.length==1) {
			System.out.println("Maximum Element: "+arr1[0]);
		}else {
			int maxIndex = getMaxIndex(arr1);
			if(maxIndex!=-1) {
				System.out.println("Maximum Element: "+arr1[maxIndex]);
			} else if(arr1[0]>arr1[1]){
				System.out.println("Maximum Element: "+arr1[0]);
			} else if(arr1[0]<arr1[arr1.length-1]) {
				System.out.println("Maximum Element: "+arr1[arr1.length-1]);
			} else {
				System.out.println("No Peak Element");
			}
		}
		
	}

	private static int getMaxIndex(int[] arr) {
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
