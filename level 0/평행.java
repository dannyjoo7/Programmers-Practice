package practice;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;

//평행
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "a1b23";
		String str2 = "6CD";

		String[] s_arr1 = { "z", "d", "x" };
		String[] s_arr2 = { "def", "dww", "dzx", "loveaw" };
		String[][] s_arr_2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 11, 7 };
		int[][] dots = { { 1, 4 }, { 9, 2 }, { 3, 8 }, { 11, 6 } };

		test.solution(dots);
	}
}

class Solution {

	public int solution(int[][] dots) {
		int x = dots[0][0];
		int y = dots[0][1];
		int[] tmp1 = null, tmp2 = null;
		double d1, d2;

		for (int i = 1; i < dots.length; i++) {
			d1 = (double)(dots[i][1] - y) / (dots[i][0] - x);
			for (int j = 1; j < dots.length; j++) {
				if (j == i) {
					continue;
				} else {
					if (tmp1 == null) {
						tmp1 = dots[j];
					} else {
						tmp2 = dots[j];
					}
				}
			}
			d2 = (double)(tmp2[1] - tmp1[1]) / (tmp2[0] - tmp1[0]);

			if (d1 == d2) {
				return 1;
			} else {
				tmp1 = null;
				tmp2 = null;
			}
		}

		return 0;
	}
}
