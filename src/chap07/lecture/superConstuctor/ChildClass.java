package chap07.lecture.superConstuctor;

public class ChildClass extends ParentClass {
	public ChildClass() {
		super(1);
	}
	
	@Override
	void method1() {
		super.method1();
		System.out.println("child method");
	}
}
