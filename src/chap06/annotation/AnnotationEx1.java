package chap06.annotation;

import java.lang.annotation.Target;

@MyAnnotation
public class AnnotationEx1 {
	@MyAnnotation
	private int i;
	//  주석들
	
	// annotation
	
	@Override
	@MyAnnotation
	public String toString() {
		// TODO 자동 생성된 메소드 스텁
		return super.toString();
	}
	@MyAnnotation(value="abc", number=5, names= {"c", "d"})
	public static void mymethod() {
		
	}
}
