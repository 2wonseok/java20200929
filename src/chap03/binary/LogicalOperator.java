package chap03.binary;

public class LogicalOperator {
	public static void main(String[] args) {
		// 논리 연산자
		// && and : 양변이 true일 때만 true
		// || | or : 양변이 false일 때만 false
		// ^ xor (exclusive or 배타적논리합) : 다를 때만 true
		
		System.out.println("==== and ====");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("==== or ====");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("==== xor ====");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
				
		// & | 이 하나일 때는 앞이 false라도 뒤에 값까지 확인함. 
		// 반대로 두개일 때는 앞이 false면 뒤에 값은 확인하지 않음.
		System.out.println("==== & | ====");
		int a = 3;
		System.out.println(false & false);
		System.out.println(false & true);
		System.out.println((a < 0) & (a++ < 0));
		System.out.println(a);
		
		System.out.println("==== && || ====");
		System.out.println(false && false);
		System.out.println(false && false);
		System.out.println((a < 0) && (a++ < 0));
		System.out.println(a);
	}
}
