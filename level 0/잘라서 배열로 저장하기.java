package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

//잘라서 배열로 저장하기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "abc1Addfggg4556b";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 7, 77, 17 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(str, 6);
	}
}

class Solution {

	public String[] solution(String my_str, int n) {
		String[] answer = {};

		for (int i = 0; i < my_str.length(); i += n) {
			String str = "";
			for (int j = 0; j < n; j++) {
				if ((i + j) >= my_str.length()) {
					continue;
				}
				str += my_str.charAt(i + j);

			}
			answer = add(answer, str);
		}

		return answer;
	}

	public String[] add(String[] arr, String n) {
		String[] tmp = new String[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		tmp[tmp.length - 1] = n;

		return tmp;
	}
}
