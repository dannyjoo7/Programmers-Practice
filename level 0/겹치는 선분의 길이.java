package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

//겹치는 선분의 길이
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "a1b23";
		String str2 = "6CD";

		String[] s_arr1 = { "z", "d", "x" };
		String[] s_arr2 = { "def", "dww", "dzx", "loveaw" };
		String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 11, 7 };
		int[][] dots = { { 0, 8 }, { 0, 2 }, { 6, 8 } };

		test.solution(dots);
	}
}

class Solution {

	public int solution(int[][] lines) {
		int answer = 0;
		int cnt = 0;

		int[][] arr = sort(lines);
		int[] maxmin = getMaxMin(arr);

		for (int i = maxmin[0]; i < maxmin[1]; i++) {
			int[] thisline = { i, i + 1 };
			for (int j = 0; j < arr.length; j++) {
				int x = arr[j][0];
				int y = arr[j][1];
				if (x <= i && y >= i + 1) {
					cnt++;
				}
			}
			if (cnt >= 2) {
				answer++;
				cnt = 0;
			} else {
				cnt = 0;
			}
		}

		return answer;
	}

	public int[][] sort(int[][] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j][0] > arr[j + 1][0]) {
					int[] tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}

	int[] getMaxMin(int[][] arr) {
		int[] tmp = new int[2];
		int max = 0, min = 0;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i][1]) {
				max = arr[i][1];
			}
			if (min > arr[i][0]) {
				min = arr[i][0];
			}
		}
		tmp[0] = min;
		tmp[1] = max;

		return tmp;
	}
}
