package practice;

import java.util.Scanner;
import java.util.HashMap;

//가위 바위 보
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String arr = "205";

		test.solution(arr);
	}
}

class Solution {

	public String solution(String rsp) {
		String answer = "";
		HashMap<String, String> map = new HashMap<String, String>() {
			{
				put("0", "5");
				put("2", "0");
				put("5", "2");
			}
		};

		for (int i = 0; i < rsp.length(); i++) {
			answer += map.get(Character.toString(rsp.charAt(i)));
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
