package chap11.string;

public class StringEx1 {
	public static void main(String[] args) {
		System.out.println("====charAt====");
		String str1 = "java";
		char c1 = str1.charAt(0);
		System.out.println(c1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		
		// equals
		System.out.println("====equals====");
		String str2 = "python";
		String str3 = "python";
		String str4 = "py";
		String str5 = "thon";
		String str6 = str4 + str5;
		
		System.out.println(str2);
		System.out.println(str6);
		
		System.out.println(str2.equals(str6));
		
		// indexOf
		System.out.println("====indexOf====");
		String str7 = "자바 프로그래밍 자바";
		int a = str7.indexOf("자바");
		System.out.println(a);
		
		// length
		System.out.println("====length====");
		String str8 = "이것이 자바다.     java";
		int l = str8.length();
		int k = 2;
		System.out.println(l);
		System.out.println(str8.charAt(l-1));
		
		// replace
		System.out.println("====replace====");
		String str9 = "abcdefabcdefg";
		String str10 = str9.replace("abc", "123");
		System.out.println(str10);
		System.out.println(str9);
		
		// substring
		System.out.println("====substring====");
		String str11 = "java";
//		String sub = str11.substring(2, 3);
//		System.out.println(sub);
		String sub = str11.substring(1, str11.length()-1);
//		sub = str11.substring(str11.length() - 1);
		System.out.println(sub);
		
		sub = str11.substring(3);
		System.out.println(sub);
		
		// trim
		System.out.println("====trim====");
		String str12 = " java ";
		String t = str12.trim();
		System.out.println(t);
		System.out.println(str12);
		
		
		
	}
}
