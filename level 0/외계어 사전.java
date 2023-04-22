package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

//외계어 사전
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

		test.solution(s_arr1, s_arr2);
	}
}

class Solution {

	public int solution(String[] spell, String[] dic) {
		int answer = 2;
		int cnt = 0;
		String[] arr;

		for (int i = 0; i < dic.length; i++) {
			for (int j = 0; j < spell.length; j++) {
				arr = dic[i].split(spell[j]);
				if (arr.length > 1 || arr.length == 0 || arr[0].length() < dic[i].length()) {
					cnt++;
				}
			}
			if (cnt == spell.length) {
				return 1;
			} else {
				cnt = 0;
			}
		}

		return answer;
	}
}
