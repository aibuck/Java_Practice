package a_JavaIO;

import java.io.InputStream;

public class S07 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		byte[] ba = new byte[100];
		InputStream is = System.in;
		int c = is.read(ba);
		
		for (int i = 0; i<c; i++) {
			System.out.print((char) ba[i]);
		}
		System.out.println(" : count="+c);
		
		System.out.println();
		
		int data;
		while((data=is.read())!= '\r') {
			System.out.println(data);
			System.out.println(is.read());
		}
	}

}