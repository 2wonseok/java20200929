package chap03.textbook;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		result += 10; // = result + 10 
		System.out.println("result=" + result);
		
		result -= 5; // = result - 5
		System.out.println("result=" + result);
		
		result *= 3; // = result * 3
		System.out.println("result=" + result);
		
		result /= 5; // = result / 5
		System.out.println("result=" + result);
		
		result %= 3; // = result % 3
		System.out.println("result=" + result);
	}
}
