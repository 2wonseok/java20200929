package chap03.textbook;

public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		String input = "3.14";
		double v = Double.valueOf(input);
		System.out.println(v);
		
		String userInput = "NaN"; // 사용자로부터 입력받은 값
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0; // 입력값을 double 타입으로 변환
		
		if (Double.isNaN(val)) {
			val = 0.0;
		}
		
		currentBalance += val; // currentBalance에 NaN이 지정됨
		System.out.println(currentBalance); 
	}
}
