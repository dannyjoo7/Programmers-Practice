package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//약수 구하기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "hello";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 1, 2, -3, 4, -5 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(14);
	}
}

class Solution {

	public int[] solution(int n) {
		int[] answer = {};

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer = add(answer, i);
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
