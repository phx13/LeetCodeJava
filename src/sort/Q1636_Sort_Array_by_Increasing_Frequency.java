package sort;

import java.util.*;
//Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

//
//Return the sorted array.
//
// 
//
//Example 1:
//
//Input: nums = [1,1,2,2,2,3]
//Output: [3,1,1,2,2,2]
//Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
//Example 2:
//
//Input: nums = [2,3,1,3,2]
//Output: [1,3,3,2,2]
//Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
//Example 3:
//
//Input: nums = [-1,1,-6,4,5,-6,1,4,1]
//Output: [5,-1,4,4,-6,-6,1,1,1]
// 
//
//Constraints:
//
//1 <= nums.length <= 100
//-100 <= nums[i] <= 100

public class Q1636_Sort_Array_by_Increasing_Frequency {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 2, 2, 2, 3 };
		for (int i : frequencySort(nums)) {
			System.out.println(i);
		}
	}

	public static int[] frequencySort(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		ArrayList<Map.Entry<Integer, Integer>> arrayList = new ArrayList<>(map.entrySet());
		Collections.sort(arrayList, (o1, o2) -> o1.getValue().equals(o2.getValue()) ? (o2.getKey() - o1.getKey())
				: (o1.getValue().compareTo(o2.getValue())));

		int[] res = new int[nums.length];
		int z = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = 0; j < arrayList.get(i).getValue(); j++) {
				res[z++] = arrayList.get(i).getKey();
			}
		}
		return res;
	}
}
