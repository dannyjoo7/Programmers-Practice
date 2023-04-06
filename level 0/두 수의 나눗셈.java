package practice;

//두 수의 나눗셈
public class Level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideTwo divTwo = new DivideTwo();
		
		System.out.println(divTwo.solution(7, 3));		
	}
}

class DivideTwo{
	public int solution(int num1, int num2) {
        int answer = 0;
        
        double x = (double)num2;
        answer = (int)(num1 / x * 1000);
        
        return answer;
    }
}
