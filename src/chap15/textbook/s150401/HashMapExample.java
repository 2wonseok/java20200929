package chap15.textbook.s150401;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		System.out.println("------향상된 for문 사용------");
		for (String key : keySet) {
			System.out.println("\t" + key + " : " + map.get(key));
		}
		
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		System.out.println("======향상된 for문 / entrySet=====");
		for (Map.Entry<String, Integer> entry : entrys) {
			System.out.println("\t" + entry.getKey() + " : " + entry.getValue());
		}
		
		Iterator<String> keyIterator = keySet.iterator();
		System.out.println("------Iterator 사용------");
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}
}
