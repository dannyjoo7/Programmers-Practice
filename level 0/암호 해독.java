package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//암호 해독
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "dfjardstddetckdaccccdegk";
		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 3, 10, 28 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(str, 4);
	}
}

class Solution {

	public String solution(String cipher, int code) {
		String answer = "";

		for (int i = code - 1; i < cipher.length(); i += code) {
			answer += (char) (cipher.charAt(i));
		}

		return answer;
	}
}
