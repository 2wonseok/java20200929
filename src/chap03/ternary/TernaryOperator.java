package chap03.ternary;

public class TernaryOperator {
	public static void main(String[] args) {
		// 1항 ? 2항 : 3항    // if문과 비슷한 성격
		// a ? b : c 		  // a의 값에 의해 결과가 나타남. a가 true일 경우 b를 표출 false일 경우 c를 표출 
		// 위 연산의 결과는 b 또는 c
		boolean a = true;
		int b = 3;
		int c = 5;
		
		System.out.println(a ? b : c); 
	}
}
