package a_JavaIO;

import java.io.*;
import java.nio.*;



public class S08 {
	public static void main(String[] args) throws Exception{
		
		File origin = new File("cat.jpg");//원본
		File copy = new File("cat_copy.jpg");//사본
		
		long start, end, time_result;
		start = System.nanoTime();
		
		try (InputStream is = new FileInputStream(origin);
				BufferedInputStream bis = new BufferedInputStream(is);
				OutputStream os = new FileOutputStream(copy);
				BufferedOutputStream bos = new BufferedOutputStream(os);
				)
		{
			
			int data;
			while((data = bis.read())!= -1) {
				bos.write(data);
			}
			bos.flush();
		}
		catch(Exception e) {e.printStackTrace();}
		
		end = System.nanoTime();
		time_result = end - start;
		System.out.println(time_result + "나노초 걸렸어요!");
		
	}
}
