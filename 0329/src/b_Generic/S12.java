package b_Generic;//중요중요

class MyClass<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}


public class S12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass<String> mc1 = new MyClass<String>();//S1
		mc1.set("안녕");
		System.out.println(mc1.get());
		MyClass<Integer> mc2 = new MyClass<>();//S2, <> 내부 타입을 지정하지 않아도 컴파일러가 자동으로 생성함.
		mc2.set(100);
		System.out.println(mc2.get());
	}

}
