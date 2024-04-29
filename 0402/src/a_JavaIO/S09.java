package a_JavaIO;

import java.io.*;

public class S09 {
	public static void main(String[] args) throws Exception{
		File rwr = new File("rwr.txt");
		
		try (Writer wr = new FileWriter(rwr);){
			wr.write("안녕하세요\n".toCharArray());
			wr.write("Hello");
			wr.write('\r');
			wr.write('\n');
			wr.write("반갑습니다", 2 , 3);
			wr.flush();
		}
		
		catch(IOException e) {e.printStackTrace();}
		
		
		try(Reader rd = new FileReader(rwr);){
			int data;
			while((data=rd.read())!=-1) {
				System.out.print((char)data);
			}
		}
		catch(IOException e) {e.printStackTrace();}
		
	}
}
