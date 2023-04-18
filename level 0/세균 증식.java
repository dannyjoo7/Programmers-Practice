package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//세균 증식
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 3, 10, 28 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(2, 10);
	}
}

class Solution {

	public int solution(int n, int t) {
		int answer = n;

		for (int i = 0; i < t; i++) {
			answer *= 2;
		}

		return answer;
	}
}
