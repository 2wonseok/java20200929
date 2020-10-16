package chap07.textbook.s070705;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.fieldl1 = "data1";
		System.out.println(parent.fieldl1);
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";
//		parent.method3();
		
		Child child = (Child) parent;
		child.fieldl2 = "yyy";
		System.out.println(child.fieldl2);
		child.method3();
	}
}
