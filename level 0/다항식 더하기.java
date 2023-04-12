package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//다항식 더하기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		String arr = "12x + 18 + 1 + 6 + 6x";

		test.solution(arr);
	}
}

class Solution {

	public String solution(String polynomial) {
		String answer = "";
		int x = 0;
		String op = "+";
		int num = 0;

		String[] str = polynomial.split(" ");

		for (int i = 0; i < str.length; i++) {
			char n = str[i].charAt(str[i].length() - 1);
			String curx = "";
			String curnum = "";
			if (n == 'x') {
				if (str[i].length() - 1 == 0) {
					x += 1;
				} else {
					for (int k = 0; k < str[i].length() - 1; k++) {
						curx += String.valueOf(str[i].charAt(k) - '0');
					}
					x += Integer.parseInt(curx);
				}
			} else if (n == '+') {
				continue;
			} else {
				for (int k = 0; k < str[i].length(); k++) {
					curnum += String.valueOf(str[i].charAt(k) - '0');
				}
				num += Integer.parseInt(curnum);
			}
		}

		if (x == 0) {
			answer += num;
		} else if (num == 0) {
			if (x == 1) {
				answer = "x";
			} else {
				answer = x + "x";
			}
		} else {
			if (x == 1) {
				answer = "x " + op + " " + num;
			} else {
				answer = x + "x " + op + " " + num;
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
