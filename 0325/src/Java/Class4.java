package Java;

import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int [] {1,2,3};
		
		modifyData(array);
		printArray(array);
	}
	
	public static void modifyData(int[] a) {
		a[0]= 4; a[1] = 5; a[2] = 6;
	}
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}//참조 자료형이기 때문에 int[] a 의 값을 변경가능함.
