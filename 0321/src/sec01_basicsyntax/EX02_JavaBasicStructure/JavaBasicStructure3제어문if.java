package sec01_basicsyntax.EX02_JavaBasicStructure;

public class JavaBasicStructure3제어문if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if문(boolean)
//		int value1 = 5;
//		if(value1 >3) {
//			System.out.println("실행1");
//		}
//		
//		if(value1<5) {
//			System.out.println("실행2");
//		}
//		boolean bool1 = true;
//		boolean bool2 = false;
//		if (bool1) {
//			System.out.println("실행3");
//		}
//		if (bool2) {
//			System.out.println("실행4");
//		}
//		
//		int value2 = 5;
//		if (value2 > 3) {
//			System.out.println("실행5");
//		}
//		else {
//			System.out.println("실행6");
//		}
//		
//		System.out.println((value2 >3) ? "실행5":"실행6");
//		System.out.println();
//		
//		
//		int value3 = 85;
//		if (value3 >= 90) {
//			System.out.println("A학점");
//		}
//		else if (value3 >= 80) {
//			System.out.println("B학점");
//		}
//		else if (value3 >= 70) {
//			System.out.println("C학점");
//		}
//		else {
//			System.out.println("F학점");
//		}
//		
//		
//		if (value3 >= 70) {
//			System.out.println("C학점");
//		}
//		else if (value3 >= 80) {
//			System.out.println("B학점");
//		}
//		else if (value3 >= 90) {
//			System.out.println("A학점");
//		}
//		else {
//			System.out.println("F학점");
//		}
//		
//		
//		if(value3 >= 70 && value3 < 80) {
//			System.out.println("C학점");
//		}
//		else if (value3 >= 80 && value3 < 90) {
//			System.out.println("B학점");
//		}
//		else if (value3 >= 90) {
//			System.out.println("A학점");
//		}
//		else {
//			System.out.println("F학점");
//		}
		
//		int s = 72;
//		if(80 <= s && s<90) {
//			System.out.println("B학점");
//		}
//		else if (s>=90) {
//			System.out.println("A학점");
//		}
//		else if(70<= s && s<80) {
//			System.out.println("C학점");
//		}
//		else if (s<70) {
//			System.out.println("F학점");
//		}
		
		
		for (int i = 0; ; i++) {
			if (i%2 == 1)
				continue;
			if (i > 10) {
				break;
			} 
			
			System.out.println(i);
		
			
			
		}
		
	
	}
}