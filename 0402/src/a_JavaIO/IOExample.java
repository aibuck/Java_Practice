package a_JavaIO;

import java.io.*;

public class IOExample {

	public static void main(String[] args) /* throws Exception */ {
		/*throws Exception 위 위치에 사용시 예상 못한 예외를 처리할 수 있지만, 
		  예외가 발생하는것을 확인해야한다면 주의해주세요.*/
		
		try {
			// System.in을 사용하여 InputStream 객체 is 생성
			InputStream is = System.in;

			// InputStreamReader를 사용하여 바이트 스트림을 문자 스트림으로 변환
			InputStreamReader isr = new InputStreamReader(is);
			// BufferedReader를 사용하여 문자열 입력 처리
			BufferedReader r = new BufferedReader(isr);

			// 사용자로부터 문자열 입력 받기
			System.out.print("문자열 입력: ");
			String ins = r.readLine();

			// 파일에 문자열 출력
			FileWriter w = new FileWriter("output.txt");
			w.write(ins);

			// flush처리, 파일 닫기
			w.flush();
			w.close();
			r.close();
			
			//출력완료 메세지 띄우기
			System.out.println("입력한 문자열을 파일에 출력했습니다.");
			
		}

		catch (IOException e) {e.getStackTrace();}//IOException 예외에 대한 처리

	}

}