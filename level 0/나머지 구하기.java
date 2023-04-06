package practice;

//나머지 구하기
public class Level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModuloCalculator test = new ModuloCalculator();
		
		System.out.println(test.solution(1, 2));
	}
}

class ModuloCalculator {
	public int solution(int num1, int num2) {
        return num1 % num2;
    }
}
