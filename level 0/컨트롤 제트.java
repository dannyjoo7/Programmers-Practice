package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//컨트롤 제트
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "10 Z 20 Z 1";
		String[] s1 = { "left", "right", "up", "right", "right" };
		String[] s2 = { "up", "up", "up", "down" };

		int[] arr = { 10, 8, 6 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(str);
	}
}

class Solution {

	public int solution(String s) {
		String[] str = s.split(" ");
		String[] arr = {};
		int answer = Integer.parseInt(str[0]);

		for (int i = 1; i < str.length; i++) {
			if (str[i].equals("Z")) {
				answer -= Integer.parseInt(str[i - 1]);
			} else {
				answer += Integer.parseInt(str[i]);
			}
		}

		return answer;
	}
}
