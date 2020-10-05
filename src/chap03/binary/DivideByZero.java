package chap03.binary;

public class DivideByZero {
	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		
//		int z = x / y;
//		int z = x % y;
		System.out.println("어떤 실행문......");
		
		double a = 5.0;
		double b = -0.0;
		
		double c = a / b; // Infinity
		System.out.println(c);
		
		double d = a % b; // NaN (Not a Number)
		System.out.println(d);
	}
}
