package chap14.textbook.s140402;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40; 
		
//		arg = 31;
//		localVar = 41;
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar);
		};
		
		fi.method();
	}
 }
