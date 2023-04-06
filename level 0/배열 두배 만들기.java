package practice;

//배열 두배 만들기
public class Level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleArray test = new DoubleArray();
		
		int[] numbers = {1, 2, 100, -99, 1, 2, 3};

		System.out.println(test.solution(numbers));
	}
}

class DoubleArray {
	public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
        	answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}
