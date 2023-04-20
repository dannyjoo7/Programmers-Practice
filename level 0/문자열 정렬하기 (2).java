package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

//문자열 정렬하기 (2)
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "heLLo";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 1, 2, -3, 4, -5 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(str);
	}
}

class Solution {

	public String solution(String my_string) {
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') {
				answer += (char) (my_string.charAt(i) + 32);
			} else {
				answer += my_string.charAt(i);
			}
		}
		
		char[] arr = answer.toCharArray();

		answer = new String(sort(arr));

		return answer;
	}

	public char[] sort(char[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					char tmp = (char)arr[j + 1];
					arr[j + 1] = (char)arr[j];
					arr[j] = (char) tmp;
				}
			}
		}
		return arr;
	}
}
