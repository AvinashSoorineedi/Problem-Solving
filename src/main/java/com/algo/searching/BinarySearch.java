package com.algo.searching;

/*
 * This class demonstrates the Binary Search algorithm to find out an element from the Collection
 * 
 * @returns true if element found
 * 				 else false
 */
public class BinarySearch {

	public static void main(String args[]) {
		int arr[] = { 1, 10, 25, 43, 56, 78, 100, 111 };
		int n = 56;

		if (binarySearchElement(arr, n) == -1) {
			System.out.println("Element not found in the Collection");
		} else {
			System.out.println("Element Found in the Collection");
		}
	}

	private static int binarySearchElement(int[] arr, int n) {
		int index = -1;

		if (n < 0 || arr.length == 0) {
			return index;
		}

		return binarySearch(0, arr.length - 1, arr, n);
	}

	private static int binarySearch(int left, int right, int arr[], int element) {
		int mid = (left + right) / 2;

		if (left < right) {

			if (arr[mid] == element) {
				return mid;
			}

			if (element < arr[mid]) {
				return binarySearch(left, mid, arr, element);
			} else {
				return binarySearch(mid + 1, right, arr, element);
			}
		}
		return -1;

	}
}
