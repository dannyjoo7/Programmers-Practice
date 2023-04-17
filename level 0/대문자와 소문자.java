package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//대문자와 소문자
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "abCdEfghIJ";
		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 10, 8, 6 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(str);
	}
}

class Solution {

	public String solution(String my_string) {
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') {
				answer += (char) (my_string.charAt(i) + 32);
			} else if (my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z') {
				answer += (char) (my_string.charAt(i) - 32);
			}
		}

		return answer;
	}
}
