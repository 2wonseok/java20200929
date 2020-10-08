package chap04.exercises;

public class Exercises06 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			String str = "";
			for (int j = 1; j <= i; j++) {
				str += "*";
			}
			System.out.println(str);
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
