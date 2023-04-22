package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

//숨어있는 숫자의 덧셈 (2)
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "a1b23";
		String str2 = "6CD";

		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 11, 7 };
		int[][] dots = { { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 } };

		test.solution(str);
	}
}

class Solution {

	public int solution(String my_string) {
		int answer = 0;
		String[] arr = {};
		String str = "";

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
				str += my_string.charAt(i);
			} else {
				if (str.equals("")) {
					continue;
				} else {
					arr = add(arr, str);
					str = "";
				}
			}
		}

		if (str != "") {
			arr = add(arr, str);
		}

		for (int i = 0; i < arr.length; i++) {
			answer += Integer.parseInt(arr[i]);
		}

		return answer;
	}

	public String[] add(String[] arr, String str) {
		String[] tmp = new String[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		tmp[tmp.length - 1] = str;
		return tmp;
	}
}
