package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//인덱스 바꾸기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "hello";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 1, 2, -3, 4, -5 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(str, 3, 4);
	}
}

class Solution {

	public String solution(String my_string, int num1, int num2) {
		String answer = "";

		if (num1 > num2) {
			int tmp = num2;
			num2 = num1;
			num1 = tmp;
		}

		for (int i = 0; i < my_string.length(); i++) {
			if (i == num1) {
				answer += my_string.charAt(num2);
			} else if (i == num2) {
				answer += my_string.charAt(num1);
			} else {
				answer += my_string.charAt(i);
			}
		}

		return answer;
	}
}
