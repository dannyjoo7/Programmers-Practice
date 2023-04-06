package practice;

//중앙값 구하기
public class Level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedianCalculator test = new MedianCalculator();
		
		int[] arr = {5, 6, 2, 1, 4};
		
		System.out.println(test.solution(arr));
	}
}

class MedianCalculator {
	public int solution(int[] array) {
	        int answer = 0;
	        
	        int arr[] = bubleSort(array);
	        
	        answer = arr[arr.length / 2];
	        return answer;
	    }
	
	public int[] bubleSort(int[] arr){
        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++) {
            	if(arr[j] > arr[j + 1]) {
            		int tmp = arr[j + 1];
            		arr[j + 1] = arr[j];
            		arr[j] = tmp;
            	}
            }
        }
        return arr;
    }
	
	public void showData(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length -1) {
				System.out.print(arr[i]);
				break;
			}
			System.out.print(arr[i] + ", ");
		}
		System.out.println("]");
	}
}

