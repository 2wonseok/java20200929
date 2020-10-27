package chap18.textbook.s180405;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		
		Reader reader = new FileReader(src);
		Writer writer = new FileWriter(des);
		// Reader, Writer 사용해서 파일 복사
		
		
//		int data;
//		while ((data = reader.read()) != -1) {
//			writer.write(data);
//		}
		
		int readCharNO;
		char[] cbuf = new char[100];
		while ((readCharNO = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNO);
//			System.out.print(data);
			writer.write(data);
		}
		
		System.out.println("복사 완료");
		writer.close();
		reader.close();
		
		
	}
}
