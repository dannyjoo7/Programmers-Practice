package practice;

//다음에 올 숫자
public class Level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextNumberPredictor test = new NextNumberPredictor();
		
		int[] numbers = {2, 4, 6};

		System.out.println(test.solution(numbers));
	}
}

class NextNumberPredictor {
	public int solution(int[] common) {
        int answer = 0;
        int r = 0;
        
        r = common[1] - common[0];
        
        if(common[1] + r == common[2]){
            answer = common[common.length - 1] + r;
        }
        else {
           r = common[1] / common[0];
            answer = common[common.length - 1] * r;
        }
        
        return answer;
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
