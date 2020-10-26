package chap15.textbook.s150403;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.*;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		Properties propeties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		// 파일을 읽어서 map에 설정 파일(.properties)의 정보를 저장
		propeties.load(new FileReader(path));
		
		System.out.println(propeties.size());
//		Object urlValue = propeties.get("url");
		String urlValue = propeties.getProperty("url");
		String driver = propeties.getProperty("driver");
		String username = propeties.getProperty("username");
		String password = propeties.getProperty("password");
		
		System.out.println("urlValue: " + urlValue);
		System.out.println("driver: " + driver);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		
		
	}
}
