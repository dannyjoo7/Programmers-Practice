package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//삼각형의 완성조건 (1)
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "12x + 18 + 1 + 6 + 6x";
		int[] arr = {199, 72, 222};

		test.solution(arr);
	}
}

class Solution {

	public int solution(int[] sides) {
		int answer = 0;
		int max = 0;
		int a;
		int b;

		for (int i = 0; i < sides.length; i++) {
			for (int j = 0; j < sides.length - 1 - i; j++) {
				if (sides[j] > sides[j + 1]) {
					int tmp = sides[j + 1];
					sides[j + 1] = sides[j];
					sides[j] = tmp;
				}
			}
		}

		if (sides[sides.length - 1] >= sides[0] + sides[1]) {
			answer = 2;
		} else {
			answer = 1;
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
