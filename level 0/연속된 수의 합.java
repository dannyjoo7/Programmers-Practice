package practice;

//연속된 수의 합
public class Level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();
	}
}

class Solution {
	public int[] solution(int num, int total) {
		int[] answer = new int[num];
		int mid;

		if (total % num == 0) {
			mid = total / num;
		} else {
			mid = total / num + 1;
		}

		int cnt = 0;

		for (int i = num / 2; i >= 0; i--) {

			answer[i] = mid - cnt;

			cnt++;

		}

		cnt = 0;

		for (int i = num / 2; i < answer.length; i++) {

			answer[i] = mid + cnt;

			cnt++;

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
