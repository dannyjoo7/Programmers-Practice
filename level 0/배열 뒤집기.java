package practice;

//배열 뒤집기
public class Level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();

		int[] arr = { 1, 0, 1, 1, 1, 3, 5 };

		test.solution(arr);
	}
}

class Solution {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		int j = 0;

		for (int i = num_list.length - 1; i >= 0; i--) {
			answer[j] = num_list[i];
			j++;
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
