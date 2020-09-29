package chap02.type;

public class LongType {
	public static void main(String[] args) {
		// long : 8byte (64bit)
		// 최대값 : 9223372036854775807
		// 최소값 : -9223372036854775809
		
		long longValue;
		longValue = 9223372036854775807L; // 대문자 L 추가 int 범위를 벗어났다는걸 명시
		System.out.println(longValue);
		
		longValue = 9_223_372_036_854_775_807L;
		
		longValue = -9223372036854775808L;
		System.out.println(longValue);


		
	}
}
