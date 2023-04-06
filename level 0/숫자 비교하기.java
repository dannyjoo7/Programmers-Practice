package practice;

//숫자 비교하기
public class Level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberComparator nc = new NumberComparator();
		
		System.out.println(nc.solution(7, 3));		
	}
}

class NumberComparator{
	int solution(int num1, int num2) {
	    int answer = 0;
	    
	    if(num1 == num2){
	        answer = 1;
	    }
	    else{ answer = -1; }
	    return answer;
	}
}
