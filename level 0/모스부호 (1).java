package practice;

import java.util.Scanner;
import java.util.HashMap;

//모스부호 (1)
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String arr = ".... . .-.. .-.. ---";

		test.solution(arr);
	}
}

class Solution {

	public String solution(String letter) {
		String answer = "";
		String str = "";

		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		for (int i = 0; i < letter.length(); i++) {
			if (letter.charAt(i) == ' ') {
				for (int j = 0; j < morse.length; j++) {
					if (str.equals(morse[j])) {
						char n = (char) (j + 97);
						answer += n;
						str = "";
						break;
					}
				}
			} else {
				str += letter.charAt(i);
				if (i == letter.length() - 1) {
					for (int j = 0; j < morse.length; j++) {
						if (str.equals(morse[j])) {
							char n = (char) (j + 97);
							answer += n;
							str = "";
							break;
						}
					}
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
