package chap06.textbook.exercises.p15;

public class MemberService {
//	String login;
//	String logout;
//	boolean result;
	
	boolean login(String id, String pw) {
		if(id == "hong" && pw == "12345") {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		if(id == "hong") {
			System.out.println("로그아웃 되었습니다.");
		}
		
	}
}
