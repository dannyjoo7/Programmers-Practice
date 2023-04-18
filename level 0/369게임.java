package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//369게임
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "abCdEfghIJ";
		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 3, 10, 28 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(29423);
	}
}

class Solution {

	public int solution(int order) {
		int answer = 0;
		String str = String.valueOf(order);
		
		for(int i = 0; i < str.length();i++) {
			if(str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') {
				answer++;
			}
		}
		
		return answer;
	}
}
