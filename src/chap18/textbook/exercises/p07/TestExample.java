package chap18.textbook.exercises.p07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class TestExample {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/textbook/s180405/TestExample.java";
		Reader reader = new FileReader(path);
		BufferedReader br = new BufferedReader(reader);
		
		String line;
		int cnt = 0;
		while ((line = br.readLine()) != null) {
			cnt++;
			System.out.println(cnt + " " + line);
		}
		
		br.close();
		reader.close();
	}
}
