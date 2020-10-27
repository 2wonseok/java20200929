package chap18.textbook.s180404;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("src/chap18/textbook/s180404/FileReaderExample.java");
		
		int readCharNO;
		char[] cbuf = new char[100];
		while ((readCharNO = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNO);
			System.out.print(data);
		}
		
		fr.close();
		
	}
}
