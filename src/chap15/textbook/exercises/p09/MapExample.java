package chap15.textbook.exercises.p09;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; 
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrys) {
			String id = entry.getKey();
			int score = entry.getValue();
			totalScore += score;
			
			if (maxScore < score) {
				maxScore = score;
				name = id;
			}
			
		}
		
//		Set<String> keys = map.keySet();
//		for (String key : keys) {
//			int value = map.get(key);
//			totalScore += value;
//			
//			if (value > maxScore) {
//				maxScore = value;
//				name = key;
//			}
//		}
		
		double avg = (double) totalScore / map.size();
	
		
		System.out.println("평균 점수: " + avg);
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 점수를 받은 아이디: " + name);
		
		
	}
}
