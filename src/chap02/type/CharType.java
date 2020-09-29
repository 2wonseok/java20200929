package chap02.type;

public class CharType {
	public static void main(String[] args) {
		// char : 2byte
		// 작은 따옴표를 이용해 하나의 문자를 표현
		
		char charValue;
		charValue = 'a';
		System.out.println(charValue);
		
		//charValue = 'ab'; 컴파일 에러
		//charValue = ''; 컴파일 에러
		charValue = ' '; // 스페이스도 하나의 문자
		System.out.println(charValue);
		
		charValue = 44032; // '가'를 10진법으로 표현
		System.out.println(charValue);
		
		charValue = '나';
		System.out.println(charValue);
		
		charValue = '\uac00'; // '가'를 16진법으로 표현
		System.out.println(charValue);
	}
}
