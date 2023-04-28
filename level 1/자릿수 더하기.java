package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

// 자릿수 더하기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "a1b23";
		String str2 = "6CD";

		String[] s_arr1 = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
		String[] s_arr2 = { "def", "dww", "dzx", "loveaw" };
		String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 1, 2, 3, 4 };
		int[][] dots = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };

		test.solution(12);
	}
}

class Solution {
	public int solution(int n) {
		int answer = 0;
		String str = Integer.toString(n);

		for (int i = 0; i < str.length(); i++) {
			answer += str.charAt(i) - '0';
		}

		return answer;
	}
}
