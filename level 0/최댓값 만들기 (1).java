package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//최댓값 만들기 (1)
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "12x + 18 + 1 + 6 + 6x";
		int[] arr = { 0, 31, 24, 10, 1, 9 };

		test.solution(arr);
	}
}

class Solution {

	public int solution(int[] numbers) {
		int answer = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int tmp = numbers[j + 1];
					numbers[j + 1] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}

		return numbers[numbers.length - 1] * numbers[numbers.length - 2];
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
