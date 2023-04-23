package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

//저주의 숫자 3
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "a1b23";
		String str2 = "6CD";

		String[] s_arr1 = { "z", "d", "x" };
		String[] s_arr2 = { "def", "dww", "dzx", "loveaw" };
		String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 11, 7 };
		int[][] dots = { { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 } };

		test.solution(100);
	}
}

class Solution {
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i < n + 1; i++) {
			answer++;
			while (true) {
				String str = Integer.toString(answer);
				int flag = 0;
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == '3') {
						answer++;
						flag = 1;
						break;
					}
				}
				if (flag == 1) {
					continue;
				}
				if (answer % 3 == 0) {
					answer++;
					continue;
				} else {
					break;
				}
			}
		}

		return answer;
	}
}
