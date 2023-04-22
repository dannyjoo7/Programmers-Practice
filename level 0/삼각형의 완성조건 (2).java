package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

//삼각형의 완성조건 (2)
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "abc1Addfggg4556b";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 11, 7 };
		int[][] dots = { { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 } };

		test.solution(arr);
	}
}

class Solution {

	public int solution(int[] sides) {

		int answer = 0;
		int max;
		int min;
		int i;
		if (sides[0] > sides[1]) {
			max = sides[0];
			min = sides[1];
		} else {
			max = sides[1];
			min = sides[0];
		}

		i = max - min + 1;

		while (true) {
			if (i >= max + min) {
				break;
			} else {
				i++;
				answer++;
			}
		}

		return answer;
	}
}
