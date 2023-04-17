package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//중복된 문자 제거
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "people";
		String[] s1 = { "left", "right", "up", "right", "right" };
		String[] s2 = { "up", "up", "up", "down" };

		int[] arr = { 10, 8, 6 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(str);
	}
}

class Solution {

	public String solution(String my_string) {
		String answer = "";
		char[] dup = {};
		int flag = 0;

		for (int i = 0; i < my_string.length(); i++) {
			for (int j = 0; j < dup.length; j++) {
				if (my_string.charAt(i) == dup[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				flag = 0;
			} else {
				dup = add(dup, my_string.charAt(i));
				answer += my_string.charAt(i);
			}
		}

		return answer;
	}

	public char[] add(char[] arr, char c) {
		if (arr.length == 0) {
			arr = new char[1];
			arr[0] = c;
			return arr;
		} else {
			char[] array = new char[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				array[i] = arr[i];
			}
			array[array.length - 1] = c;
			return array;
		}
	}
}
