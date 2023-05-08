package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;
import java.util.ArrayList;

// [1차] 다트 게임
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "1D2S#10S";
		String str2 = "6CD";

		String[] s_arr1 = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
		String[] s_arr2 = { "def", "dww", "dzx", "loveaw" };
		String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 3, 3, 3, 2, 2, 4 };
		int[][] dots = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };

		test.solution(str);
	}
}

class Solution {
	public int solution(String dartResult) {
		int answer = 0, index = -1;
		ArrayList<Integer> score = new ArrayList<>();
		char[] arr = dartResult.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
				if(arr[i] == '1' && arr[i + 1] == '0') {
					score.add(10);
					index++;
					i++;
					break;
				}
				score.add(arr[i] - '0');
				index++;
				break;

			case 'D':
				score.set(index, (int) Math.pow(score.get(index), 2));
				break;
			case 'T':
				score.set(index, (int) Math.pow(score.get(index), 3));
				break;

			case '*':
				if (index == 0) {
					score.set(index, score.get(index) * 2);
				} else {
					score.set(index, score.get(index) * 2);
					score.set(index - 1, score.get(index - 1) * 2);
				}
				break;
			case '#':
				score.set(index, score.get(index) * -1);
				break;
			}
		}
		for (int i = 0; i < score.size(); i++) {
			answer += score.get(i);
		}
		return answer;
	}
}
