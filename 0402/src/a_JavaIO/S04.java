package a_JavaIO;

import java.io.*;
import java.nio.charset.Charset;

public class S04 {

	public static void main(String[] args) throws Exception {
		byte[] byteArray1 = new byte[9];

		File inFile = new File("sample8.txt");
		InputStream is2 = new FileInputStream(inFile);

		int count1;

		while ((count1 = is2.read(byteArray1)) != -1) {
			String str = new String(byteArray1, 0, count1, Charset.forName("UTF-8"));
			System.out.println(str);
			System.out.println(" : count=" + count1);
		}
		System.out.println();
		System.out.println();
		is2.close();
	}
}
