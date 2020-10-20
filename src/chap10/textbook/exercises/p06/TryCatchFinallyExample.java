package chap10.textbook.exercises.p06;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = {"10", "2a"};
		int value = 0;
		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");		// 네번째 실행
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");	// 두번째 실행
			} finally {
				System.out.println(value);						// 첫번째 실행, 세번째 실행, 다섯번째 실행 
			}
		}
	}
}
