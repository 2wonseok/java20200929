package chap05.lecture;

public class ArrayEx05Length {
	public static void main(String[] args) {
		int[] arr1 = {99, 88, 77};
		int[] arr2 = {5, 4, 3, 2, 1};
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
//		foreach 문으로 배열 안에 데이터를 모두 표출 시킬 때 사용
//		for (int a : arr2) {
//			System.out.println(a);
//		}
		
	}
}
