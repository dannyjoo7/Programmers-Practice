package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//구슬을 나누는 경우의 수
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		int[] arr = { 1, 2 };

		test.solution(15, 3);
	}
}

class Solution {

	public int solution(int n, int m) {
		BigInteger n_fac = factorial(n);
		BigInteger m_fac = factorial(m);
		BigInteger nm_fac = factorial(n - m);
		BigInteger bottom = nm_fac.multiply(m_fac);

		BigInteger answer = n_fac.divide(bottom);

		return answer.intValue();
	}

	public BigInteger factorial(int n) {
		if (n == 1 || n == 0) {
			return BigInteger.valueOf(1);
		} else {
			return BigInteger.valueOf(n).multiply(factorial(n - 1));
		}
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
