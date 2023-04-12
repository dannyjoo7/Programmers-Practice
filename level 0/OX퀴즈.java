package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//OX퀴즈
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String[] arr = { "19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2" };

		test.solution(arr);
	}
}

class Solution {

	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		String[] str = new String[quiz.length];
		int x;
		int y;
		int z;
		String op;

		for (int i = 0; i < quiz.length; i++) {
			str = quiz[i].split(" ");
			x = Integer.parseInt(str[0]);
			y = Integer.parseInt(str[2]);
			z = Integer.parseInt(str[4]);
			op = str[1];
			if (op.equals("+") && (x + y) == z) {
				answer[i] = "O";
			} else if (op.equals("-") && (x - y) == z) {
				answer[i] = "O";
			} else {
				answer[i] = "X";
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

	public void add(int[] arr, int num) {
		int[] array = new int[arr.length + 1];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = arr[i];
		}
		array[array.length - 1] = num;
		arr = array;
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
