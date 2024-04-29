package pack01;




/*멤버 생성자의 접근 지정자 -> S1 : public = 동일, 다른 패키지 모든 클래스
S2 : protected = 동일 패키지 모든 클래스 + 다른 패키지의 자식패키지(상속)
S3 : default = 동일 패키지 모든 클래스 (다른 패키지 안됨)
S4 : private = 동일 클래스에서만 사용가능 (중괄호가 닫히면 사용불가능, 생성자 함수를 이용한 호출 가능)
*/
/*class의 접근 지정자 -> public, default 두가지.
 * (protected, private 논리적으로 불가능)*/

public class A01 {

	public int a=1;
	protected int b=2;
	int c=3;
	private int d=4;
	
	public void print() { //a, b, c, d
		System.out.print(a+ " "); //가능
		System.out.print(b+ " "); //가능
		System.out.print(c+ " "); //가능
		System.out.print(d); //가능
		System.out.println();
}
}