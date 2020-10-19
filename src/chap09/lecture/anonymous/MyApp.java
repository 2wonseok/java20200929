package chap09.lecture.anonymous;

public class MyApp {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.method1();
		
		Parent p2 = new Parent() {
			@Override
			public void method1() {
				System.out.println("annonymus method1");
			}
		};
		p2.method1();
		
		Parent p3 = new Parent() {
			@Override
			public void method1() {
				System.out.println("ㅋㅋㅋㅋㅋㅋㅋ");
			}
		};
		
		p3.method1();
	}
}
