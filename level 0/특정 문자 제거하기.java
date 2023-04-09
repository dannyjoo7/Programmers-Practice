package practice;

import java.util.Scanner;

//특정 문자 제거하기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String str = "hello";

		test.solution(str, "e");

	}
}

class Solution {

	public String solution(String my_string, String letter) {
		String answer = "";

		answer = my_string.replaceAll(letter, "");

		return answer;
	}

	public void bubleSort(int[] arr) {
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

	public int[] add(int[] arr, int num) {
		int[] array = new int[arr.length + 1];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = arr[i];
		}
		array[array.length - 1] = num;
		return array;
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
