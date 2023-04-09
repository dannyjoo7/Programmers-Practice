package practice;

import java.util.Scanner;

//짝수의 합
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		test.solution(10);

	}
}

class Solution {

	public int solution(int n) {
		int answer = 0;

		for (int i = 0; i <= n; i += 2) {
			answer += i;
		}

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
