package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//가장 큰 수 찾기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "hello";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 1, 2, -3, 4, -5 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(arr);
	}
}

class Solution {

	public int[] solution(int[] array) {
		int[] answer = new int[2];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > answer[0]) {
				answer[0] = array[i];
				answer[1] = i;
			}
		}

		return answer;
	}
}
