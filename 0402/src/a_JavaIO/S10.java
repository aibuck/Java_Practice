package a_JavaIO;

import java.io.*;


public class S10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#.파일 객체 선언
		File isr = new File("InputStreamReader.txt");
		//#1. FileReader만을 이용하여 읽어오기 (MS949 모드 파일)
		try(Reader reader = new FileReader(isr);){
		int data;
		while((data=reader.read())!=-1) {System.out.print((char)data); }
		} 
		catch(IOException e) {e.printStackTrace();}
		
		System.out.println();
		System.out.println();
		//#2. FileInputStream+InputStreamReader를 사용하여 읽어오기(MS949 모드 파일)
		try(InputStream is = new FileInputStream(isr);
		InputStreamReader isr2 = new InputStreamReader(is, "MS949");) {
			
				 
		int data;
		while((data=isr2.read())!=-1) { System.out.print((char)data); }
		System.out.println("\n"+isr2.getEncoding());//MS949
		} catch(IOException e) {}

	}

}
