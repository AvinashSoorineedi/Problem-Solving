package com.algo.searching;

/*
 * This class demonstrates the Linear Search algorithm to find out an element from the Collection
 * 
 * @returns true if element found
 * 				 else false
 */
public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 6, 10, 11, 25, 900, 2323, 9713, 112, 1, 1232, 8773 };

		int n = 8773;
		if (linearSearchElement(arr, n) == -1) {
			System.out.println("Element not present in the list");
		} else {
			System.out.println("Element " + n + " present in list");
		}
	}

	/*
	 * Check for each element in a loop and exit the loop with the found index.
	 * 
	 * @return index if element is found 
	 * 			-1 if element is not found
	 */
	private static int linearSearchElement(int[] arr, int n) {

		int index = -1;

		if (n < 0 || arr.length == 0) {
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				index = i;
				break;
			}
		}

		return index;
	}

}
