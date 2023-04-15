package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//합성수 찾기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "12x + 18 + 1 + 6 + 6x";
		String[] s1 = { "left", "right", "up", "right", "right" };
		String[] s2 = { "up", "up", "up", "down" };

		int[] arr = { 10, 8, 6 };

		test.solution(420);
	}
}

class Solution {

	public int solution(int n) {
		int answer = 0;

		if (n < 4) {
			return 0;
		} else {
			for (int i = 4; i <= n; i++) {
				if (i % 2 == 0) {
					answer++;
				} else {
					for (int j = 3; j < i; j += 2) {
						if (i % j == 0) {
							answer++;
							break;
						}
					}
				}
			}
			return answer;
		}
	}

	public void bubleSort_ascending(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	public void bubleSort_descending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] > arr[j - 1]) {
					int tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	public int[] add(int[] arr, int n) {
		int[] tmp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		tmp[tmp.length - 1] = n;

		return tmp;
	}

	public void showData(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
				break;
			}
			System.out.print(arr[i] + ", ");
		}
		System.out.println("]");
	}
}
