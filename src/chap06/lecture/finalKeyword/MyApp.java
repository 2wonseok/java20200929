package chap06.lecture.finalKeyword;

public class MyApp {
	public static void main(String[] args) {
		int i;
		final int j;
		
		i = 30;
		i = 40;
		
		j = 20;
//		j = 30;
		
		MyClass o1 = new MyClass();
		
		o1.field1 = 3;
		System.out.println(o1.field2);
	}
}
