package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//문자열안에 문자열
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 1, 2, -3, 4, -5 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(str, str2);
	}
}

class Solution {

	public int solution(String str1, String str2) {
		int answer = 0;
		String str = str1.replace(str2, "");
		
		if(str.length() < str1.length()) {
			return 1;
		}
		else {
			return 2;
		}
	}
}
