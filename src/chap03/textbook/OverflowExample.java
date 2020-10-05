package chap03.textbook;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		// long 둘 중 하나라도 long타입이 되어야 하고 변수 z가 long타입이여야 한다.
		// 해결법
		long a = 1000000;
		long b = 1000000;
		long c = a * b;
		System.out.println(c);
	}
}
