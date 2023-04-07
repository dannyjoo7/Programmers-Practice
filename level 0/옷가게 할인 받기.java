package practice;

//옷가게 할인 받기
public class Level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution test = new Solution();

		test.solution(4);
	}
}

class Solution {
	public int solution(int price) {
        if(price >= 500000){
            price -= price * 0.2;
        } else if(price >= 300000 && price < 500000){
            price -= price * 0.1;
        } else if(price >= 100000 && price < 300000){
            price -= price * 0.05;
        }
        return price;
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
