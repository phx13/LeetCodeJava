package sort;

import java.util.*;
//Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.

//
// 
//
//Example 1:
//
//Input: nums = [2,1,2]
//Output: 5
//Example 2:
//
//Input: nums = [1,2,1]
//Output: 0
//Example 3:
//
//Input: nums = [3,2,3,4]
//Output: 10
//Example 4:
//
//Input: nums = [3,6,2,3]
//Output: 8
// 
//
//Constraints:
//
//3 <= nums.length <= 104
//1 <= nums[i] <= 106

public class Q976_Largest_Perimeter_Triangle {
	public static void main(String[] args) {
		int[] nums = { 3, 2, 3, 4 };
		System.out.println(largestPerimeter(nums));
	}

	public static int largestPerimeter(int[] nums) {
		Arrays.sort(nums);
		for (int i = nums.length - 1; i >= 2; --i) {
			if (nums[i - 2] + nums[i - 1] > nums[i]) {
				return nums[i - 2] + nums[i - 1] + nums[i];
			}
		}
		return 0;
	}
}
