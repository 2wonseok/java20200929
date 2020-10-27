package chap18.lecture.filterstream;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/filterstream/BufferedReaderEx1.java";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		String line = br.readLine();
		System.out.println(line);
//		while ((s = br.readLine()) != null) {
//			System.out.println(s);
//		}
		br.close();
		fr.close();
		
	}
}
