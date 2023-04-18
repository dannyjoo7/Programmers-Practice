package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//n의 배수 고르기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 1, 2, -3, 4, -5 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(1, arr);
	}
}

class Solution {

	public int[] solution(int n, int[] numlist) {
		int[] answer = {};
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				answer = add(answer, numlist[i]);
			}
		}

		return answer;
	}

	public int[] add(int[] arr, int n) {
		int[] tmp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		tmp[tmp.length - 1] = n;

		return tmp;
	}
}
