package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

//유한소수 판별하기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "a1b23";
		String str2 = "6CD";

		String[] s_arr1 = { "z", "d", "x" };
		String[] s_arr2 = { "def", "dww", "dzx", "loveaw" };
		String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 11, 7 };
		int[][] dots = { { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 } };

		test.solution(11, 22);
	}
}

class Solution {

	public int solution(int a, int b) {
		int r = gcd(a, b);

		b /= r;

		while ((b % 2) == 0) {
			b /= 2;
		}
		while ((b % 5) == 0) {
			b /= 5;
		}

		if (b == 0 || b == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	int gcd(int a, int b) {
		int r;
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
