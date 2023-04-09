package practice;

import java.util.Scanner;

//각도기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		test.solution(90);

	}
}

class Solution {

	public int solution(int angle) {
		int answer = 0;

		if (angle > 0 && angle < 90) {
			answer = 1;
		} else if (angle == 90) {
			answer = 2;
		} else if (angle > 90 && angle < 180) {
			answer = 3;
		} else {
			answer = 4;
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
