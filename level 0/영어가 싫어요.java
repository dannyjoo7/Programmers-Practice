package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//영어가 싫어요
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "onetwothreefourfivesixseveneightnine";
		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 3, 10, 28 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(str);
	}
}

class Solution {

	public long solution(String numbers) {
		String str = "";
		String num = "";

		for (int i = 0; i < numbers.length(); i++) {
			str += (char) numbers.charAt(i);
			switch (str) {
			case "one":
				num += 1;
				str = "";
				break;
			case "two":
				num += 2;
				str = "";
				break;
			case "three":
				num += 3;
				str = "";
				break;
			case "four":
				num += 4;
				str = "";
				break;
			case "five":
				num += 5;
				str = "";
				break;
			case "six":
				num += 6;
				str = "";
				break;
			case "seven":
				num += 7;
				str = "";
				break;
			case "eight":
				num += 8;
				str = "";
				break;
			case "nine":
				num += 9;
				str = "";
				break;
			case "zero":
				num += 0;
				str = "";
				break;
			}
		}

		return Long.parseLong(num);
	}
}
