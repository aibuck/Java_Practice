//package Java;
//
//class A{
//	int m;
//	int n;
//	void init(int m, int n) {
//		m = m;//this 키워드가 없어서 지역변수로 인식
//		n = n;
//	}
//}
//
//class B {
//	int m;
//	int n;
//	void init(int m, int n) {
//		this.m = m;
//		this.n = n;
//	}
//}
//public class Classs10 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		A a = new A();
//		a.init(2,3);//class A 에서 this 키워드를 사용안했기에 init()함수 안의 값이 0으로 초기화
//		System.out.println(a.m);
//		System.out.println(a.n);
//		
//		B b = new B();
//		b.init(2, 3);
//		System.out.println(b.m);
//		System.out.println(b.n);
//	}
//
//}
