package chap07.lecture.finalKeyword;

public class ChildClass extends ParentClass {
	void method1() { //파이널 키워드 작성시 재정의 할 수 없음.
		System.out.println("child method1");
	}
}
