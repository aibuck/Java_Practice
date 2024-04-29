//package Java;
//
//import java.util.Arrays;
//
//class A{
//	void abc(int m) {
//		m = 8;
//	}
//	void bcd(int[] n) {
//		n[0] = 4; n[1] = 5; n[2] = 6;
//	}
//}
//
//public class Classs16 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		A a = new A();
//		
//		int m = 5;
//		int[] n = {1,2,3};
//		
//		a.abc(m);
//		a.bcd(n);
//		
//		System.out.println(m);//5 기본 자료형은 힙영역, 값만 전달됨
//		System.out.println(Arrays.toString(n));//참조 자료형은 스택영역, 값 변하지 않음.
//	}
//
//}
