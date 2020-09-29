package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
		// primitive type 8개
	
		// 1byte   2byte 4byte  8byte
		// boolean char
		// byte    short int	long
		//				 float  double
		
		// 정수 : byte, char, short, int, long
		// 실수 : float, double
		// 논리 : boolean
		// 같은 바이트 또는 더 큰 바이트에 담을 때엔 자동 형변환
		// 더 작은 바이트에 담을 때엔 강제 형변환
		// floatValue = longValue; < 예외 float에는 더 많은 값을 담을 수 있음 그러나 데이터는 맞지 않을 수 있음.
		
		byte byteValue = 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 10000000000L;
		
		// 자동 형변환(타입변환)
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;
		
		//강제 형변환
		longValue = 2300000000L;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		// 자동 형변화 (정수 -> 실수)
		float floatValue = 0.0F;
		double doubleValue = 0.0;
		
		doubleValue = intValue;
		floatValue = intValue;
		
		longValue = 9223372036854775807L;
		floatValue = longValue;
		System.out.println(floatValue);

		doubleValue = longValue;
		
		// 강제 형변환 (실수 -> 정수)
		intValue = (int) floatValue;		
		
	}
}
