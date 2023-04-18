package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//숫자 찾기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "hello";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 1, 2, -3, 4, -5 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(29183, 1);
	}
}

class Solution {

	public int solution(int num, int k) {
		int answer = 0;
		String n = Integer.toString(num);

		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) - '0' == k) {
				return i + 1;
			}
		}

		return -1;
	}
}
