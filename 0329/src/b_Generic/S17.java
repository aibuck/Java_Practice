//package b_Generic;
//
//class A {}
//class B extends A {}
//class C extends B {}
//class D extends C {}
//
//class Goods<T> {
//	private T t;
//	public T get() {
//		return t;
//	}
//	public void set(T t) {
//		this.t = t;
//	}	
//}
//
//class Test {
//	void method1(Goods<A> g) {} //case1 A
//	void method2(Goods<?> g) {} //case2 A,B,C,D
//	void method3(Goods<? extends B> g) {} //case3 B,C,D
//	void method4(Goods<? super B> g) {} //case4 A,B
//}
//
//public class S17 {
//	public static void main(String[] args) {
//		Test t = new Test();
//		
//		//#1. case1
//		t.method1(new Goods<A>());
////		t.method1(new Goods<B>());
////		t.method1(new Goods<C>());
////		t.method1(new Goods<D>());
//		
//		//#2. case2
//		t.method2(new Goods<A>());
//		t.method2(new Goods<B>());
//		t.method2(new Goods<C>());
//		t.method2(new Goods<D>());
//		
//		//#3. case3
////		t.method3(new Goods<A>());
//		t.method3(new Goods<B>());
//		t.method3(new Goods<C>());
//		t.method3(new Goods<D>());
//		
//		//#4. case4
//		t.method4(new Goods<A>());
//		t.method4(new Goods<B>());
////		t.method4(new Goods<C>());
////		t.method4(new Goods<D>());		
//	}
//}
