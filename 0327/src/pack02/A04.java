package pack02;

import pack01.A01;

public class A04 extends A01{//오른쪽 부모클래스를 왼쪽 자식클래스로 상속
	public void print() { //a, b, c, d		
		//#멤버 활용
		System.out.print(a+ " "); //가능
		System.out.print(b+ " "); //가능
		//System.out.print(c+ " "); //불가능
		//System.out.print(d); //불가능
		System.out.println();
	}
}
