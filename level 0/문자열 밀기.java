package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

// 문자열 밀기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "a1b23";
		String str2 = "6CD";

		String[] s_arr1 = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
		String[] s_arr2 = { "def", "dww", "dzx", "loveaw" };
		String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 10000, 20, 36, 47, 40, 6, 10, 7000 };
		int[][] dots = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };

		test.solution("hello", "ohell");
	}
}

class Solution {
	public int solution(String A, String B) {
		int answer = 0;
		char[] arr = A.toCharArray();
		String str;

		for (int i = 0; i < A.length(); i++) {
			str = String.valueOf(arr);
			if (str.equals(B)) {
				return answer;
			}
			answer++;
			char tmp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = tmp;
		}

		return -1;
	}
}
