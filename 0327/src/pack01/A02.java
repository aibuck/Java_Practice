package pack01;

public class A02 {
	public void print() { //a, b, c, d
		//#객체생성 
		A01 a1 = new A01(); //객체생성 가능
		
		//#멤버 활용
		System.out.print(a1.a+ " "); //가능
		System.out.print(a1.b+ " "); //가능
		System.out.print(a1.c+ " "); //가능
		//System.out.print(a1.d); //불가능
		System.out.println();
}
}