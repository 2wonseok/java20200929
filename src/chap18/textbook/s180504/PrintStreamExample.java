package chap18.textbook.s180504;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {
		String path = "PrintStreamExample.txt";
		FileOutputStream fos = new FileOutputStream(path);
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼");
		ps.println("데이터를 출력합니다.");
		
		ps.flush();
		ps.close();
		fos.close();
		System.out.println("작업이 완료 되었습니다.");
		
	}
}
