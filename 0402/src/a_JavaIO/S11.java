package a_JavaIO;

import java.io.*;

public class S11 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		File pw1 = new File("pw1.txt");
		File pw2 = new File("pw2.txt");
//		File pw3 = new File("pw3.txt");
		
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(pw2));){
			pw.println("PrintWriter 예제#2");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요! ");
			pw.println("반갑습니다.");
			pw.printf("%d",7).printf("%S %f", "감사", 3.7);
			
		}
		catch(IOException e) {e.printStackTrace();}
		
	}

}
