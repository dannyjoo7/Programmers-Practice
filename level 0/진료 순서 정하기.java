package practice;

import java.util.Scanner;
import java.util.HashMap;

//진료 순서 정하기
public class Level0 {
	public static void main(String[] args) {
		Solution test = new Solution();

		int[] arr = { 30, 10, 23, 6, 100 };

		test.solution(arr);
	}
}

class Solution {

	public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < emergency.length; i++) {
			answer[i] = emergency[i];
		}

		bubleSort_descending(emergency);
		
		for (int i = 0; i < emergency.length; i++) {
			map.put(emergency[i], i + 1);
		}
		
		for (int i = 0; i < emergency.length; i++) {
			answer[i] = map.get(answer[i]);
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
	
	public void bubleSort_descending(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length - 1; j > i; j--){
                if(arr[j] > arr[j - 1]){
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
