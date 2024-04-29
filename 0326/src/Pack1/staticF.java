package Pack1;
class F {
	int m = 3;
	static int n = 5;
}

public class staticF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f1 = new F();
		System.out.println(f1.m);
		
		
		System.out.println(F.n);
		
		F f2 = new F();
		System.out.println(f2.n);//권장하지 않음. 인스턴스 필드와 구분이 헷갈림.
	}

}
