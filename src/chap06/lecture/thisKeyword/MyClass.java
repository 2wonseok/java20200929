package chap06.lecture.thisKeyword;

public class MyClass {
	int var;
	
	MyClass() {
		
	}
	
	MyClass(int var) {
		this.var = var;
	}
	
	void method1() {
		int var = 5;
		System.out.println(this.var);
		System.out.println(var);
	}
	
	void method2() {
		method1();
	}
}
