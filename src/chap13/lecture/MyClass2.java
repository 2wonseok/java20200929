package chap13.lecture;

public class MyClass2<T extends Number> {
	
	public void method1(T t) {
		System.out.println(t.doubleValue());
	}
}
