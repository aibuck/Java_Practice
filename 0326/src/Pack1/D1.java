package Pack1;

public class D1 {
	public void print() {
		D d = new D();
		
		
		System.out.print(d.a + " ");
		System.out.print(d.b + " ");
		System.out.print(d.c + " ");
//		System.out.print(d.d + " ");//d = private 접근 지정자라 못불러옴.
		System.out.println();
	}


}
