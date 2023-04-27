package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

// 특이한 정렬
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "a1b23";
		String str2 = "6CD";

		String[] s_arr1 = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
		String[] s_arr2 = { "def", "dww", "dzx", "loveaw" };
		String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 10000, 20, 36, 47, 40, 6, 10, 7000 };
		int[][] dots = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };

		test.solution(arr, 30);
	}
}

class Solution {
	public int[] solution(int[] numlist, int n) {
		int[] answer = new int[numlist.length];
		int[] arr = new int[numlist.length];
		int[] arr_sort = new int[numlist.length];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numlist.length; i++) {
			arr[i] = numlist[i];
			arr[i] -= n;
			if (arr[i] < 0) {
				arr[i] *= -1;
			}
			arr_sort[i] = arr[i];
			map.put(numlist[i], arr[i]);
		}
		sort(arr_sort);

		for (int i = 0; i < numlist.length; i++) {
			for (Integer num : map.keySet()) {
				if (arr_sort[i] == map.get(num)) {
					answer[i] = num;
					map.remove(num);
					break;
				}
			}
		}

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr_sort[i] == arr_sort[i + 1] && answer[i] < answer[i + 1]) {
				int tmp = answer[i + 1];
				answer[i + 1] = answer[i];
				answer[i] = tmp;
			}
		}

		return answer;
	}

	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}
