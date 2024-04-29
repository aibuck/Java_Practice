package Java;

import java.util.Arrays;

public class Class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(1,2);
		method1(1,2,3);
		method1();
		
		method2("안녕", "방가");
		method2("떙큐","베리","감사");
		method2();
	}
	
	public static void method1(int...values) {
		System.out.println("배열의 길이: " + values.length);
//		for(int i = 0; i< values.length; i++);//배열 출력방법 1
//			System.out.print(values[i] + " ");
		for (int k: values) {//배열 출력방법 2
			System.out.print(k + " ");
		}
		System.out.println();
	}
	public static void method2(String...values) {
		System.out.println("배열의 길이: " + values.length);
//		for(String i = 0; i< values.length; i++);//배열 출력방법 1
//			System.out.print(values[i] + " ");
		for (String k: values) {//배열 출력방법 2
			System.out.print(k + " ");
//			System.out.println(Arrays.toString(values));//배열 출력방법 3
	}
	System.out.println();
	}
}
