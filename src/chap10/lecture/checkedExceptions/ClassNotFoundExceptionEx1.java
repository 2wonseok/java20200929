package chap10.lecture.checkedExceptions;

public class ClassNotFoundExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("프로그램 실행1");
		
		try {
			System.out.println("프로그램 실행 try1");
			Class.forName("java.lang.String2");
			System.out.println("프로그램 실행 try2");
		} catch (ClassNotFoundException e) {
			System.out.println("exception 발생");
//			e.printStackTrace();
		} finally {
			System.out.println("무조건 실행");
		}
		
		System.out.println("프로그램 실행2");
	}
}
