package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

// 이진수 더하기
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

		test.solution("10", "11");
	}
}

class Solution {
	public String solution(String bin1, String bin2) {
		String answer = "";
		int x = Integer.parseInt(bin1, 2);
		int y = Integer.parseInt(bin2, 2);
		answer = Integer.toBinaryString(x + y);

		return answer;
	}
}
