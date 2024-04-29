package sec01_basicsyntax.EX02_JavaBasicStructure;

public class JavaBasicStructure4제어키워드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break
//		int i = 0;
//		for(i = 0; i < 10; i++) {
//			System.out.println(i);
//			break;
//		}
//		
//		
//		for (i = 0; i<10; i++) {
//			if(i==5) {break;}}
//			System.out.println();
//			
//			
//		for (i=0; i<10; i++) {
//			for (int j=0; j<10; j++) {
//				if(j==3)
//					break;//바로 위 for문만 탈출, 첫번째줄은 돌아감
//				System.out.println(i+", "+j);
//			}
//		}
		

		//break + 레이블
//		out: for(int i=0; i<10; i++) {
//			for(int j=0; j<10; j++) {
//				if(j==3) 
//					break out;
//				System.out.println(i+", "+j);
				
//			}
//		
//		}
		
		
		
		//continue
//		for (int i = 0; i<10; i++) {
//			if (i == 5) {
//				continue;//continue 는 if 조건문 없이 사용하지 않음
//			}
//			System.out.println(i);
//		}
//		for(int i = 0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(j==3) {
//					continue;
//				}
//				System.out.println(i+", "+j);
//			}//continue가 대치하는 중괄호
//		}
//		
		
		
		//continue + 레이블
//		pos1: for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(j==3) {
//					continue pos1;
//				}
//				System.out.println(i+", "+j);
//			}
//		}//continue가 대치하는 중괄호
		
		
	}
}