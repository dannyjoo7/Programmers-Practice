package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//치킨 쿠폰
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "people";
		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 10, 8, 6 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(1999);
	}
}

class Solution {

	public int solution(int chicken) {
		int cop = 0;
		int x = 0;

		while (true) {
			cop += chicken / 10;
			x += chicken % 10;
			chicken = chicken / 10;
			if (chicken == 0) {
				break;
			}
		}
		while (true) {
			cop += x / 10;
			x = (x / 10) + (x % 10);
			if (x < 10) {
				break;
			}
		}

		return cop + (x / 10);
	}
}
