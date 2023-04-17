package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//가까운 수
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "abCdEfghIJ";
		String[] s1 = { "meosseugi", "1234" };
		String[][] s2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		int[] arr = { 3, 10, 28 };
		int[][] dots = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };

		test.solution(arr, 20);
	}
}

class Solution {

	public int solution(int[] array, int n) {
		int[] arr = new int[array.length];

		for (int i = 0; i < arr.length; i++) {
			int x = n - array[i];
			if (x < 0) {
				x *= -1;
			}
			arr[i] = x;
		}

		int min = arr[0];
		int min_idx = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				min_idx = i;
			} else if (arr[i] == min && array[i] < array[min_idx]) {
				min_idx = i;
			}
		}

		return array[min_idx];
	}
}
