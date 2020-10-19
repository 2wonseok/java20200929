package chap09.lecture.thisKeyword;

import chap09.lecture.thisKeyword.MyClass.Nested;

public class MyApp {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		Nested c1 = m1.new Nested();
		c1.method();
		c1.field1 = 2;
		System.out.println("-------------");
		c1.method();
		m1.field1 = 6;
		System.out.println("-------------");
		c1.method();
	}
}
