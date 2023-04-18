package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//최댓값 만들기 (2)
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 1, 2, -3, 4, -5 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(arr);
	}
}

class Solution {

	public int solution(int[] numbers) {
		int answer = 0;
		int max1 = 0;
		int max2 = 0;
		int min1 = 0;
		int min2 = 0;

		if (numbers.length == 2) {
			return numbers[0] * numbers[1];
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min1) {
				min2 = min1;
				min1 = numbers[i];
			} else if (numbers[i] < min2) {
				min2 = numbers[i];
			} else if (numbers[i] > max1) {
				max2 = max1;
				max1 = numbers[i];
			} else if (numbers[i] > max2) {
				max2 = numbers[i];
			}
		}

		if (min1 * min2 > max1 * max2) {
			answer = min1 * min2;
		} else {
			answer = max1 * max2;
		}

		return answer;
	}
}
