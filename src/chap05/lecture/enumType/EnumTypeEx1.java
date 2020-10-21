package chap05.lecture.enumType;

public class EnumTypeEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		System.out.println(o1 instanceof Object);
		
		MyEnum e1 = MyEnum.VALUE1;
		
		MyEnum e2 = MyEnum.MY_VALUE4;
		MyEnum e3 = MyEnum.MY_VALUE4;
		
		System.out.println(e2 == e3);
		System.out.println(e1.toString());
		
		System.out.println(e1 instanceof Object);
		System.out.println(e1 instanceof Enum);
		System.out.println(e1 instanceof MyEnum);
		
	}
}

class MyClass {
	
}
