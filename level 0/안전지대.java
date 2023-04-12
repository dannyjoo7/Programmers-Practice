package practice;

import java.util.Scanner;
import java.util.HashMap;
import java.math.*;

//안전지대
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

//		int[][] arr = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0 } };
//
//		test.solution(arr);
//
//		int[][] arr1 = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0 },
//				{ 0, 0, 0, 0, 0 } };
//
//		test.solution(arr1);

		int[][] arr2 = { { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 } };

		test.solution(arr2);
	}
}

class Solution {

	public int solution(int[][] board) {
		int answer = 0;
		int n = board.length;
		int[][] arr = new int[n][n];

		if (n == 1 && board[0][0] == 0) {
			return 1;
		} else if (n == 1 && board[0][0] == 1) {
			return 0;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					if (i == 0) {
						if (j == 0) {
							for (int k = i; k <= i + 1; k++) {
								for (int l = j; l <= j + 1; l++) {
									arr[k][l] = 1;
								}
							}
						} else if (j == n - 1) {
							for (int k = i; k <= i + 1; k++) {
								for (int l = j - 1; l < j + 1; l++) {
									arr[k][l] = 1;
								}
							}
						} else {
							for (int k = i; k <= i + 1; k++) {
								for (int l = j - 1; l <= j + 1; l++) {
									arr[k][l] = 1;
								}
							}
						}
					} else if (j == 0) {
						if (i == 0) {
							for (int k = i; k <= i + 1; k++) {
								for (int l = j; l <= j + 1; l++) {
									arr[k][l] = 1;
								}
							}
						} else if (i == n - 1) {
							for (int k = i - 1; k < i + 1; k++) {
								for (int l = j; l <= j + 1; l++) {
									arr[k][l] = 1;
								}
							}
						} else {
							for (int k = i - 1; k <= i + 1; k++) {
								for (int l = j; l <= j + 1; l++) {
									arr[k][l] = 1;
								}
							}
						}
					} else if (i == n - 1) {
						if (j == 0) {
							for (int k = i - 1; k < i + 1; k++) {
								for (int l = j; l <= j + 1; l++) {
									arr[k][l] = 1;
								}
							}
						} else if (j == n - 1) {
							for (int k = i - 1; k < i + 1; k++) {
								for (int l = j - 1; l < j + 1; l++) {
									arr[k][l] = 1;
								}
							}
						} else {
							for (int k = i - 1; k < i + 1; k++) {
								for (int l = j - 1; l <= j + 1; l++) {
									arr[k][l] = 1;
								}
							}
						}

					} else if (j == n - 1) {
						if (i == 0) {
							for (int k = i; k <= i + 1; k++) {
								for (int l = j - 1; l < j + 1; l++) {
									arr[k][l] = 1;
								}
							}
						} else if (i == n) {
							for (int k = i - 1; k < i + 1; k++) {
								for (int l = j - 1; l < j + 1; l++) {
									arr[k][l] = 1;
								}
							}
						} else {
							for (int k = i - 1; k <= i + 1; k++) {
								for (int l = j - 1; l < j + 1; l++) {
									arr[k][l] = 1;
								}
							}
						}
					} else {
						for (int k = i - 1; k <= i + 1; k++) {
							for (int l = j - 1; l <= j + 1; l++) {
								arr[k][l] = 1;
							}
						}
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 0) {
					answer++;
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
