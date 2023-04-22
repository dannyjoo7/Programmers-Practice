package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

//직사각형 넓이 구하기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "abc1Addfggg4556b";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 7, 77, 17 };
		int[][] dots = { { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 } };

		test.solution(dots);
	}
}

class Solution {

	public int solution(int[][] dots) {
		int answer = 0;
		int x = dots[0][0];
		int y = dots[0][1];

		int width = 0;
		int height = 0;

		for (int i = 1; i < dots.length; i++) {
			if (dots[i][0] == x) {
				width = (int) Math.sqrt(square(x - dots[i][0]) + square(y - dots[i][1]));
			} else if (dots[i][1] == y) {
				height = (int) Math.sqrt(square(x - dots[i][0]) + square(y - dots[i][1]));
			}
		}

		answer = width * height;

		return answer;
	}

	public int square(int n) {
		return n * n;
	}
}
