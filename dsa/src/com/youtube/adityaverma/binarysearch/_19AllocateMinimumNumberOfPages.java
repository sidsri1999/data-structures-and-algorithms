package com.youtube.adityaverma.binarysearch;

import java.text.ParseException;

/*Link: 
 * https://www.youtube.com/watch?v=2JSQIhPcHQg&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=21
 * 
 * Problem: 
 * 1. Here, we have given an array, where each index represents a book, and its value represents number of pages in that book. (sorted is not guaranteed.)
 * 2. We have n number of students
 * 
 * Task:
 * 1. We have to distribute the m books to n students.
 * 2. Each student must get atleast 1 book.
 * 3. One book, can't be divided between multiple students.
 * 4. Book given to students in continuous fashion, means a student can't take books[0] and book[2], he can take 01, 012 but not in discontinous fashion.
 * 5. Now, our task is to divide the books to students in such a way, that we minimize the maximum number of pages that a student can read.
 * 
 * Input:  
 * 		Books : 10	20	30	40
 * 		NumberOfStudents: 2
 * 
 * Output: 70, (here, we give first three books to Student1(10, 20, 30)= 60, and fourth Student2(40) = max = 60)
 * */

public class _19AllocateMinimumNumberOfPages {

	public static void main(String[] args) throws ParseException {

		int[] books = new int[] { 10, 20, 30, 40 };
		int numberOfStudents = 3;
		int start = 0;
		int end = 0;
		// start will indicate book with maximum pages, end will indicate sum of all
		// pages.
		for (int i = 0; i < books.length; i++) {
			if (start < books[i]) {
				start = books[i];
			}
			end += books[i];
		}
		int result = binarySearch(books, numberOfStudents, start, end);
		System.out.println("Result: " + result);
	}

	private static int binarySearch(int[] books, int numberOfStudents, int start, int end) {
		int result = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (isValid(books, numberOfStudents, mid) == true) {
				result = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return result;
	}

	private static boolean isValid(int[] books, int numberOfStudents, int maxNumberOfPagesPerStudent) {
		int student = 1;
		int currentNumberOfPages = books[0];
		for (int book = 1; book < books.length; book++) {
			currentNumberOfPages += books[book];
			if (currentNumberOfPages > maxNumberOfPagesPerStudent) {
				student++;
				currentNumberOfPages = books[book];
			}
			if (student > numberOfStudents) {
				return false;
			}
		}
		return true;
	}

}
