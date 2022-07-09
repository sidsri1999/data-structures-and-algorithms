package com.youtube.adityaverma.binarysearch;

import java.text.ParseException;

/*Link: 
 * https://www.youtube.com/watch?v=VS0BcOiKaGI&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=20
 * 
 * Problem: In this, we have matrix, when we move in one row from left to right it will be increasing and when we
 * move from top to down it will be decreasing.
 * 
 * Input:  
 * Matrix:		10	20	30	40
 * 				15	25	35	45
 * 				27	29	37	48
 * 				32	33	39	50
 * Target: 29
 * Output: 2,1
 * */

public class _18SearchElementInSortedMatrix {

	public static void main(String[] args) throws ParseException {

		int[][] arr1 = { { 10, 20, 30, 40 }, 
						 { 15, 25, 35, 45 }, 
						 { 27, 29, 37, 48 }, 
						 { 32, 33, 39, 50 }};
		int target1 = 26;
		int[] targetIndex = binarySearchInMatrix(arr1, 0, arr1.length - 1, target1);
		System.out.println("Row: " + targetIndex[0]);
		System.out.println("Column: " + targetIndex[1]);
	}

	private static int[] binarySearchInMatrix(int[][] arr, int row, int col, int target) {

		while (0 <= row && row < arr.length && 0 <= col && col < arr[0].length) {
			if (arr[row][col] == target) {
				return new int[] { row, col };
			} else if (target < arr[row][col]) {
				col--;
			} else {
				row++;
			}
		}
		return new int[] { -1, -1 };
	}

}
