package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//문자열 계산하기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "10 - 44 + 10";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 1, 2, -3, 4, -5 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(str);
	}
}

class Solution {

	public int solution(String my_string) {
		String[] arr = my_string.split(" ");
		int answer = Integer.valueOf(arr[0]);

		for (int i = 2; i < arr.length; i += 2) {
			if(arr[i - 1].equals("+")) {
				answer += Integer.valueOf(arr[i]);
			} else {
				answer -= Integer.valueOf(arr[i]);
			}
		}

		return answer;
	}
}
