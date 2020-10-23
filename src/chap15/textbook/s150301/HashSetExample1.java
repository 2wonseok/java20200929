package chap15.textbook.s150301;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Setvlet/JSP");
		set.add("JAVA");  		// 중복이라 추가되지 않음.
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		System.out.println("----향상된 for문----");
		for (String elements : set) {
			System.out.println("\t" + elements);
		}
		
		
		System.out.println("----Iterator를 이용한 while문----");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		System.out.println("----향상된 for문----");
		for (String elements : set) {
			System.out.println("\t" + elements);
		}
		
		System.out.println("----Iterator를 이용한 while문----");
		iterator =set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어있음");
		}
		
	}
}
