package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//문자열 정렬하기 (1)
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "hi12392";
		String[] s1 = { "left", "right", "up", "right", "right" };
		String[] s2 = { "up", "up", "up", "down" };

		int[] arr = { 10, 8, 6 };

		test.solution(str);
	}
}

class Solution {

	public int[] solution(String my_string) {
		int[] answer = {};

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) - '0' >= 0 && my_string.charAt(i) - '0' <= 9) {
				answer = add(answer, my_string.charAt(i) - '0');
			}
		}

		return sort(answer);
	}

	public int[] add(int[] arr, int n) {
		int[] tmp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		tmp[tmp.length - 1] = n;

		return tmp;
	}

	public int[] sort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
}
