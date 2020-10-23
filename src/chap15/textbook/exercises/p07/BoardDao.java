package chap15.textbook.exercises.p07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목1","내용1"));
		
		return list;
		
	}
	

}
