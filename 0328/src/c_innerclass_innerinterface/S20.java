package c_innerclass_innerinterface;
//
///*익명이너클래스를 활용하여 인터페이스 객체 생성*/
//
//class A {
//	C c = new C() {
//		public void bcd() {
//			System.out.println("익명이너클래스");			
//		}
//	};	
//	void abc() {
//		c.bcd();
//	}		
//}
//interface C {
//	public abstract void bcd();
//}
//
//
//public class S20 {
//	public static void main(String[] args) {
//		//#1. 객체 생성 및 메서드 호출
//		A a = new A();
//		a.abc(); //익명이너클래스
//	}
//}