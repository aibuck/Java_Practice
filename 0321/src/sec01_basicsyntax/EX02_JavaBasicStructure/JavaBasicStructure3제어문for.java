package sec01_basicsyntax.EX02_JavaBasicStructure;

public class JavaBasicStructure3제어문for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 0; i<3; i++) {//for(초기식; 조건식; 증감식) 
//			System.out.println(i);
//		}
//		
//		for(int i = 0; i<3; i++) {
//			System.out.println(i);
//		}
//		
//		for(int i = 0; i<100; i++) {
//			System.out.println(i);
//		}
		
//		for (int i = 0, j = 0; i < 10; i++, j++) {//범위에는 문자열 x
//			System.out.println(i+j);
//		}
//		
//		
//		for(int i =0; i < 5; i++)
//			for(int j= 0; j<3; j++) {
//				if(i==2) {
//					continue;
//				}
//				if(j==1) {
//					break;
//				}
//				System.out.println("A");
//	
//		}
		
		
		for(int i = 0; i<10; i++) {//i =3, j = 2일때 이중for문 한번에 탈출
			for(int j = 0; j < 5; j++) {
				
				if (i == 3 && j == 2) {
					i = 100;
					break;
					
				}
			System.out.println(i);
			}
			
			
		}
		
		
		o: for(int i = 0; i<10; i++) {//레이블 사용해서 이중 for문 한번에 탈출
			for(int j = 0; j < 5; j++) {
				if (i==3 && j ==2) {
					break o;
				}

				System.out.println(i);
			}
			
		}
		
		
		
	}

}
