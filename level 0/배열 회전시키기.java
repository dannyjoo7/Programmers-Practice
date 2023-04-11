package practice;

import java.util.Scanner;
import java.util.HashMap;

//배열 회전시키기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		int[] arr = { 1, 2, 3 };

		test.solution(arr, "left");
	}
}

class Solution {

	public int[] solution(int[] numbers, String direction) {
		int[] answer = {};

		if (direction.equals("right")) {
			int tmp = numbers[numbers.length - 1];
			for (int i = numbers.length - 1; i > 0; i--) {
				numbers[i] = numbers[i - 1];
			}
			numbers[0] = tmp;
		} else {
			int tmp = numbers[0];
			for (int i = 0; i < numbers.length - 1; i++) {
				numbers[i] = numbers[i + 1];
			}
			numbers[numbers.length - 1] = tmp;
		}

		return numbers;
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

	public int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
