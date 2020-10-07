package chap04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		
		// 1 -> 2 -> code -> 3 -> 2
		
		// 1~10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// foreach문
//		int j[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		for (int tenNum : j) {
//			System.out.println(tenNum);
//		}
		
		// 11~20
		// 1~9 홀수만
		// 10~1 
		// 10~2 짝수만
		System.out.println("===11~20까지===");
		for (int j = 11; j <= 20; j++) {
			System.out.println(j);
		}
		
		System.out.println("===1~9까지 홀수===");
		for (int k = 1; k <= 9; k++) { // k+=2
			if (k % 2 == 1) {
			System.out.println(k);
			}
		}
		
		System.out.println("===10~1까지===");
		for (int l = 10; l >= 1; l--) {
			System.out.println(l);
		}
		
		System.out.println("===10~2까지 짝수===");
		for (int a = 10; a >= 1; a--) { // a-=2
			if (a % 2 == 0) {
			System.out.println(a);
			}
		}
		
	}
}
