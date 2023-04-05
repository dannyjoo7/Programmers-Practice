package practice;

public class Level0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FractionAddition fa = new FractionAddition();

		//System.out.println(fa.solution(9, 2, 1, 3));
		System.out.println(fa.solution(4, 4, 4, 4));
	}
}

class FractionAddition {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = { 0, 0 };
		int denominator = denom1 * denom2;
		int numerator = (numer1 * denom2) + (numer2 * denom1);

		answer[0] = numerator / gcd(numerator, denominator);
		answer[1] = denominator / gcd(denominator, numerator);

		return answer;
	}

	int gcd(int a, int b) {
		int r;
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
