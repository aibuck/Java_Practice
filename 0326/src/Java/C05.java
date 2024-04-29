package Java;//Pack1, Pack2 패키지 안 D, D1, D2, D3 불러오기

import Pack1.D;
import Pack1.D1;
import Pack2.D2;
import Pack1.D3;

public class C05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		D1 d1 = new D1();
		D2 d2 = new D2();
		D3 d3 = new D3();
		
		d.print();
		d1.print();
		d2.print();
		d3.print();
	}

}
