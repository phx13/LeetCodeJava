package array;
//You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

//
//The ith item is said to match the rule if one of the following is true:
//
//ruleKey == "type" and ruleValue == typei.
//ruleKey == "color" and ruleValue == colori.
//ruleKey == "name" and ruleValue == namei.
//Return the number of items that match the given rule.
//
// 
//
//Example 1:
//
//Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
//Output: 1
//Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
//Example 2:
//
//Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
//Output: 2
//Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
// 
//
//Constraints:
//
//1 <= items.length <= 104
//1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
//ruleKey is equal to either "type", "color", or "name".
//All strings consist only of lowercase letters.

import java.util.ArrayList;
import java.util.List;

public class Q1773_Count_Items_Matching_a_Rule {
	public static void main(String[] args) {
		List<List<String>> items = new ArrayList<List<String>>();
		List<String> strings1 = new ArrayList<String>();
		strings1.add("phone");
		strings1.add("blue");
		strings1.add("pixel");
		List<String> strings2 = new ArrayList<String>();
		strings2.add("computer");
		strings2.add("silver");
		strings2.add("lenovo");
		List<String> strings3 = new ArrayList<String>();
		strings3.add("phone");
		strings3.add("gold");
		strings3.add("iphone");
		items.add(strings1);
		items.add(strings2);
		items.add(strings3);

		String ruleKey = "color";
		String ruleValue = "silver";
		System.out.println(countMatches(items, ruleKey, ruleValue));
	}

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int res = 0;
		int index = 0;
		switch (ruleKey) {
		case "type":
			index = 0;
			break;
		case "color":
			index = 1;
			break;
		case "name":
			index = 2;
			break;
		}
		for (List<String> list : items) {
			if (list.get(index).equals(ruleValue)) {
				res++;
			}
		}
		return res;
	}
}
