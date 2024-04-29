package b_abstractclass_interface;//연습문제
//
//abstract class A{
//	abstract void abc();
//}
//
//class B extends A {//클래스 A와 B의 상속관계가 있을때 a.abc()의 결과가 "안녕하세요" 가 나오도록
//	//@Override
//	void abc() {//void 앞에 public, 자동 삽입 되지만 직접 넣어줄수도 있음
//		System.out.println("안녕하세요");
//	};
//}
//
//public class S12 {
//	
//	public static void main(String[] args) {
//		
//		A a = new B();
//		a.abc();
//		
//		
//	}
//}