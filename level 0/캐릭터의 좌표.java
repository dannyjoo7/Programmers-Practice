package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//캐릭터의 좌표
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "12x + 18 + 1 + 6 + 6x";
		String[] s1 = { "left", "right", "up", "right", "right" };
		String[] s2 = { "up", "up", "up", "down" };

		int[] arr = { 11, 11 };

		test.solution(s1, arr);
	}
}

class Solution {

	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = { 0, 0 };

		for (int i = 0; i < keyinput.length; i++) {
			int key = keyinput[i].charAt(0);

			switch (key) {
			case 114: // right
				if (board[0] / 2 == answer[0]) {
					break;
				} else {
					answer[0]++;
					break;
				}
			case 108: // left
				if (board[0] / 2 == -1 * answer[0]) {
					break;
				} else {
					answer[0]--;
					break;
				}

			case 117: // up
				if (board[1] / 2 == answer[1]) {
					break;
				} else {
					answer[1]++;
					break;
				}

			case 100: // down
				if (board[1] / 2 == -1 * answer[1]) {
					break;
				} else {
					answer[1]--;
					break;
				}
			}
		}

		return answer;
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
