package chap10.textbook.s100601;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findeClass();
			System.out.println("확인");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

	private static void findeClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
