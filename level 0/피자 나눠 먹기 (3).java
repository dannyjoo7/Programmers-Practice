package practice;

//피자 나눠 먹기 (3)
public class Level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();

		test.solution(4, 12);
	}
}

class Solution {
	public int solution(int slice, int n) {
		int answer = 0;
		int cnt = 1;

		if (slice >= n) {
			return 1;
		} else if (n % slice == 0) {
			return n / slice;
		} else {
			while (true) {
				if (n < (cnt * slice)) {
					answer = cnt;
					break;
				} else {
					if (n % (cnt * slice) == 0) {
						answer = cnt;
						break;
					}
					cnt++;
				}
			}
			return answer;
		}
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
