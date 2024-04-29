package date0402;

import java.io.*;
import java.nio.*;

public class IOExample {
	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;
		int cnt = 0;
		int len = 0;
		int data;
		byte[] barr = null;
		
		while((data = is.read()) != '\r') {
			if(cnt == 0) {
				len = is.available();
				barr = new byte[len];
			}
			
			barr[cnt] = (byte)data;
			cnt++;
		}
		String str = new String(barr);
		File dataFile = new File("example.txt");
		
		try(OutputStream os = new FileOutputStream(dataFile); 
				OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8"); ){

			osw.write(str);
			osw.flush();
			
		}catch(Exception e) { e.printStackTrace(); }
	}

}
