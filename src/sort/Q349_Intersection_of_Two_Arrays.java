package sort;

import java.util.HashMap;
import java.util.Map;

//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
//
// 
//
//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//Example 2:
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.
// 
//
//Constraints:
//
//1 <= nums1.length, nums2.length <= 1000
//0 <= nums1[i], nums2[i] <= 1000

public class Q349_Intersection_of_Two_Arrays {
	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 2, 2, 1 };
		int[] nums2 = new int[] { 2, 2 };

		for (int i : intersection(nums1, nums2)) {
			System.out.println(i);
		}

	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for (int i : nums1) {
			map1.put(i, 1);
		}
		for (int i : nums2) {
			if (map1.containsKey(i)) {
				map2.put(i, 1);
			}
		}
		int[] res = new int[map2.size()];
		int j = 0;
		for (int i : map2.keySet()) {
			res[j++] = i;
		}
		return res;
	}
}
