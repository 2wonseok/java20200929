package chap15.textbook.exercises.p1606;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import chap15.textbook.exercises.p1606.StreamExample.Member;

public class StreamExample {
	static class Member {
		private String name;
		private int age;

		public Member(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
	}

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26)
				);
		int sum = 0;
		double avg = 0.0;
		// 작성 위치
		for (Member Mem : list) {
			sum += Mem.getAge();
		}
		avg = (double) sum / list.size();
		// 출력
		System.out.println("평균 나이: " + avg);
		
//		int sum = 0;
//		for (Member member : list) {
//			sum += member.getAge();
//		}
	}
}
