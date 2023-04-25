package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

// 옹알이 (1)
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "a1b23";
		String str2 = "6CD";

		String[] s_arr1 = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
		String[] s_arr2 = { "def", "dww", "dzx", "loveaw" };
		String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[][] dots = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };

		test.solution(s_arr1);
	}
}

class Solution {
	public int solution(String[] babbling) {
		int answer = 0;
		String[] word = { "aya", "ye", "woo", "ma" };

		for (int i = 0; i < babbling.length; i++) {
			for (int j = 0; j < word.length; j++) {
				babbling[i] = babbling[i].replace(word[j], " ");
			}
			if (babbling[i].replace(" ", "").equals("")) {
				answer++;
			}
		}

		return answer;
	}
}
