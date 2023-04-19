package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//한 번만 등장한 문자
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "hello";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 1, 2, -3, 4, -5 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(str);
	}
}

class Solution {

	public String solution(String s) {
		String answer = "";
		String str = "";

		for (int i = 0; i < s.length(); i++) {
			str = Character.toString(s.charAt(i));
			if (s.replace(str, "").length() == s.length() - 1) {
				answer += str;
			}
		}

		char[] arr = answer.toCharArray();

		for (int i = 0; i < answer.length(); i++) {
			for (int j = 0; j < answer.length() - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		answer = new String(arr);
		return answer;
	}
}
