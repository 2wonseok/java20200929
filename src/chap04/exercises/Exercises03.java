package chap04.exercises;

public class Exercises03 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
			sum += i;	
			}
		}
		System.out.println(sum);
		
		int sum2 = 0;
		
		for (int j = 0; j <= 100; j+=3) {
			sum2 += j;	
		}
		System.out.println(sum2);
	}
}
