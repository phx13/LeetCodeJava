package array;
//Given a binary string s, return true if the longest contiguous segment of 1s is strictly longer than the longest contiguous segment of 0s in s. Return false otherwise.

//
//For example, in s = "110100010" the longest contiguous segment of 1s has length 2, and the longest contiguous segment of 0s has length 3.
//Note that if there are no 0s, then the longest contiguous segment of 0s is considered to have length 0. The same applies if there are no 1s.
//
// 
//
//Example 1:
//
//Input: s = "1101"
//Output: true
//Explanation:
//The longest contiguous segment of 1s has length 2: "1101"
//The longest contiguous segment of 0s has length 1: "1101"
//The segment of 1s is longer, so return true.
//Example 2:
//
//Input: s = "111000"
//Output: false
//Explanation:
//The longest contiguous segment of 1s has length 3: "111000"
//The longest contiguous segment of 0s has length 3: "111000"
//The segment of 1s is not longer, so return false.
//Example 3:
//
//Input: s = "110100010"
//Output: false
//Explanation:
//The longest contiguous segment of 1s has length 2: "110100010"
//The longest contiguous segment of 0s has length 3: "110100010"
//The segment of 1s is not longer, so return false.
// 
//
//Constraints:
//
//1 <= s.length <= 100
//s[i] is either '0' or '1'.

public class Q1869_Longer_Contiguous_Segments_of_Ones_than_Zeros {
	public static void main(String[] args) {
		String s = "110100010";
		System.out.println(checkZeroOnes(s));
	}

	public static boolean checkZeroOnes(String s) {
		int x = 0;
		int y = 0;
		int tempx = 0;
		int tempy = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				tempx++;
			} else {
				tempx = 0;
			}
			if (x < tempx) {
				x = tempx;
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				tempy++;
			} else {
				tempy = 0;
			}
			if (y < tempy) {
				y = tempy;
			}
		}
		return y > x;
	}
}
