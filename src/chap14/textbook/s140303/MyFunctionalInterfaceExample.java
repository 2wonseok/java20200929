package chap14.textbook.s140303;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x) -> {
			int resutl = x * 5;
			System.out.println(resutl);
		};
		fi.method(2);
		
		fi = (x) -> {
			System.out.println(x * 5);
		};
		fi.method(2);
		
		fi = x -> System.out.println(x * 5);
		fi.method(2);
	}
}
