package practice;

import java.util.HashMap;

// 최빈값 구하기

public class Level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModeCalculator test = new ModeCalculator();

		int[] arr1 = { 1, 2, 3, 3, 3, 4 };
		System.out.println(test.solution(arr1));

		int[] arr2 = { 1, 1, 2, 2 };
		System.out.println(test.solution(arr2));

		int[] arr3 = { 1 };
		System.out.println(test.solution(arr3));

		int[] arr4 = { 0, 0, 0, 1 };
		System.out.println(test.solution(arr4));
	}
}

class ModeCalculator {
	public int solution(int[] array) {
		int answer = 0;
		bubleSort(array);

		HashMap<Integer, Integer> arr = new HashMap<Integer, Integer>();

		int curNum;
		int curCnt = 0;
		int maxNum = 0;
		int maxCnt = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1]) {
				arr.put(array[i], curCnt + 1);
				curCnt = 0;
			} else {
				curCnt++;
			}
		}
		arr.put(array[array.length - 1], curCnt + 1);

		for (int i : arr.keySet()) {
			curNum = i;
			curCnt = arr.get(i);
			if(curCnt > maxCnt) {
				maxNum = curNum;
				maxCnt = curCnt;
			} else if(curCnt == maxCnt) {
				maxNum = -1;
			}
		}
		
		answer = maxNum;

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
