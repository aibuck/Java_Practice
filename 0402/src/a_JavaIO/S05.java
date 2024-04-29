package a_JavaIO;

import java.io.*;


public class S05 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		File outFile = new File("sample.txt");
		
		OutputStream os = new FileOutputStream(outFile, true);
		
		byte[] byteArray = "텀블러 태블릿".getBytes();
		
		os.write(byteArray, 0, 19);
		
		os.flush();
		
		if(os != null) {
			os.close();
		}
	}

}