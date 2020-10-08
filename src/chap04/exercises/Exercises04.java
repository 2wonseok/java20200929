package chap04.exercises;

public class Exercises04 {
	public static void main(String[] args) {
		
//		int i = 1;
		while (true) {
			int num1 = (int)(Math.random()*6) + 1;
			int num2 = (int)(Math.random()*6) + 1;
			if (num1 + num2 == 5) {
				break;
			}
			System.out.println("(" +num1+ "," + num2+")");
			//i++;
		}
		
//		int num1 = 0;
//		int num2 = 0;
//		while (num1 + num2 != 5) {
//			num1 = (int)(Math.random()*6) + 1;
//			num2 = (int)(Math.random()*6) + 1;
//			System.out.println("(" +num1+ "," + num2+")");
//		}
		
	}
}
