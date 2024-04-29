package sec01_basicsyntax.EX02_JavaBasicStructure;

public class JavaBasicStructure4제어문do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// do-while 제어문(반복문) do는 최초 1회 무조건 실행<
		int a=0;//S1
		do {
			System.out.print(a+" ");
			a++;
		} while(a<10);
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a);
			a++;
		}while(a<0);
		System.out.println();
		
		
		a = 0;
		while(a<10) {//S2
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		
		a = 0;
		while(a<0);
		System.out.print(a);
		a++;
		System.out.println();
		
		
	}
	
}
