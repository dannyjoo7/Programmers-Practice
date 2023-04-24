package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

// 등수 매기기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "a1b23";
		String str2 = "6CD";

		String[] s_arr1 = { "z", "d", "x" };
		String[] s_arr2 = { "def", "dww", "dzx", "loveaw" };
		String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 11, 7 };
		int[][] dots = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };

		test.solution(dots);
	}
}

class Solution {
	public int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		int[] arr = new int[score.length];
		int[] arr_sort = new int[score.length];
		int curnum;
		int lastnum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = score[i][0] + score[i][1];
			arr_sort[i] = arr[i];
		}

		sort(arr_sort);

		for (int i = 0; i < arr.length; i++) {
			curnum = arr_sort[i];
			if (curnum == lastnum) {
				continue;
			}
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == curnum) {
					answer[j] = i + 1;
				}
			}
			lastnum = curnum;
		}

		return answer;
	}

	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}
