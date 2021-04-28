package sort;

/*Given a string s. You should re-order the string using the following algorithm:

Pick the smallest character from s and append it to the result.
Pick the smallest character from s which is greater than the last appended character to the result and append it.
Repeat step 2 until you cannot pick more characters.
Pick the largest character from s and append it to the result.
Pick the largest character from s which is smaller than the last appended character to the result and append it.
Repeat step 5 until you cannot pick more characters.
Repeat the steps from 1 to 6 until you pick all characters from s.
In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.

Return the result string after sorting s with this algorithm.*/

public class Q1370_Increasing_Decreasing_String {
	public static void main(String[] args) {
		String s = "aaaabbbbcccc";
		System.out.println(sortString(s));
	}

	public static String sortString(String s) {
		int[] num = new int[26];
		for (int i = 0; i < s.length(); i++) {
			num[s.charAt(i) - 'a']++;
		}
		StringBuffer sBuffer = new StringBuffer();
		while (sBuffer.length() < s.length()) {
			for (int i = 0; i < 26; i++) {
				if (num[i] > 0) {
					sBuffer.append((char) (i + 'a'));
					num[i]--;
				}
			}
			for (int i = 25; i >= 0; i--) {
				if (num[i] > 0) {
					sBuffer.append((char) (i + 'a'));
					num[i]--;
				}
			}
		}
		return sBuffer.toString();
	}
}
