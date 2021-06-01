package sort;

import java.util.*;

//Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

//
//Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.
//
// 
//
//Example 1:
//
//Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//Output: [2,2,2,1,4,3,3,9,6,7,19]
// 
//
//Constraints:
//
//1 <= arr1.length, arr2.length <= 1000
//0 <= arr1[i], arr2[i] <= 1000
//All the elements of arr2 are distinct.
//Each arr2[i] is in arr1.

public class Q1122_Relative_Sort_Array {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
		int[] arr2 = new int[] { 2, 1, 4, 3, 9, 6 };
		for (int i : relativeSortArray(arr1, arr2)) {
			System.out.println(i);
		}
	}

	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length];
		int index = 0;
		for (int i : arr2) {
			for (int j = 0; j < arr1.length; j++) {
				if (i == arr1[j]) {
					res[index++] = arr1[j];
				}
			}
		}
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j : res) {
				if (arr1[i] == j) {
					arr1[i] = 0;
				}
			}
		}
		
		Arrays.sort(arr1);
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 0) {
				res[index++] = arr1[i];
			}
			
		}

		return res;
	}
}
