package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.lang.reflect.Array;
import java.math.*;
import java.util.ArrayList;

// 정수를 나선형으로 배치하기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "1D2S#10S";
		String str2 = "6CD";

		String[] s_arr1 = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
		String[] s_arr2 = { "def", "dww", "dzx", "loveaw" };
		String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 45, 4, 35, 20, 3, 9 };
		int[] arr2 = { 20, 9, 3, 45, 4, 35 };

		int[][] dots = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };

		test.solution(1);
	}
}

class Solution {
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		info info = new info(0, 0, 1);
		
		if(n == 1) {
			answer[0][0] = 1;
			return answer;
		}
		
		while (true) {
			right(answer, info);
			down(answer, info);
			left(answer, info);
			up(answer, info);

			if (checkEnd(answer)) {
				break;
			}
		}

		return answer;
	}

	public void right(int[][] arr, info info) {
		for (int i = info.y; i < arr.length; i++) {
			if (arr[info.x][i] != 0) {
				break;
			} else {
				arr[info.x][i] = info.num;
				info.y = i;
				info.num++;
			}
		}
		info.x++;
	}

	public void down(int[][] arr, info info) {
		for (int i = info.x; i < arr.length; i++) {
			if (arr[i][info.y] != 0) {
				break;
			} else {
				arr[i][info.y] = info.num;
				info.x = i;
				info.num++;
			}
		}
		info.y--;
	}

	public void left(int[][] arr, info info) {
		for (int i = info.y; i >= 0; i--) {
			if (arr[info.x][i] != 0) {
				break;
			} else {
				arr[info.x][i] = info.num;
				info.y = i;
				info.num++;
			}
		}
		info.x--;
	}

	public void up(int[][] arr, info info) {
		for (int i = info.x; i >= 0; i--) {
			if (arr[i][info.y] != 0) {
				break;
			} else {
				arr[i][info.y] = info.num;
				info.x = i;
				info.num++;
			}
		}
		info.y++;
	}

	public boolean checkEnd(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
};

class info {
	int x, y, num;

	info(int x, int y, int num) {
		this.x = x;
		this.y = y;
		this.num = num;
	}
}
