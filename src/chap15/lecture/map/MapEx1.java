package chap15.lecture.map;

import java.util.*;

public class MapEx1 {
	public static void main(String[] args) {
	// (Key, Value) 쌍(Entry) 으로 저장
	// dictionary
	
	Map<Integer, String> map = new HashMap<>();
	
	// 추가
	map.put(100, "kim");
	map.put(30, "hong");
	map.put(22, "lee");
	map.put(11, "choi");
	map.put(200, "jin");
	
	System.out.println(map.size());
	
	// 수정
	map.put(200,"park");
	System.out.println(map.size());
	
	// 검색
	String v1 = map.get(100);
	System.out.println(v1);
	System.out.println(map.get(200));
	
	// 삭제
	map.remove(200);
	System.out.println(map.size());
	
	// 전체 탐색
	System.out.println("======향상된 for문 / keySet=======");
	Set<Integer> keys = map.keySet();
	for (Integer key : keys) {
		System.out.println(key + " : " + map.get(key));
	}
	
	System.out.println("======향상된 for문 / entrySet=====");
	Set<Map.Entry<Integer, String>> entrys = map.entrySet();
	for (Map.Entry<Integer, String> entry : entrys) {
		System.out.println(entry.getKey() + " : " + entry.getValue());
	}
	
	System.out.println("======Iterator 사용===============");
	Iterator<Integer> keys2 = keys.iterator();
	while (keys2.hasNext()) {
		Integer keys3 = keys2.next();
		String value = map.get(keys3);
		System.out.println(keys3 + " : " + map.get(keys3));
	}
	
	
	}
}
