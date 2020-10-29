package chap14.lecture.returnKeyword;

public class ReturnEx1 {
	public static void main(String[] args) {
		MyInterface o1 = (x) -> {
			int y = x * 2;
			return y;
		};
		System.out.println(o1.method(3));
		
		MyInterface o2 = x -> { return x * 2; };
		System.out.println(o2.method(10));
		
		MyInterface o3 = a -> a * 2;
		System.out.println(o3.method(20));
	}
}
