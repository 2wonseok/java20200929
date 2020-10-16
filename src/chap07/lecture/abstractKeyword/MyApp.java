package chap07.lecture.abstractKeyword;

public class MyApp {
	public static void main(String[] args) {
		KindaCat o1 = new Cat();
		KindaCat o2 = new Tiger();
		
//		KindaCat o3 = new KindaCat();
		
		o1.cry();
		o2.cry();
	}
}
