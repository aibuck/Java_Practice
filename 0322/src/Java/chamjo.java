package Java;

import java.util.Arrays;

//import java.util.Arrays;

public class chamjo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// 배열 선언방법 S1
//		int[] a1 = new int[3];
//		int[] a2;
//		a1[0] = 3; a1[1] = 4; a1[2] = 5;
//		System.out.println(a1[0]);
//		
//		a2 = new int[3];
//		
//		// 배열 선언방법 S2
//		int a3[] = new int[3];//[]는 변수 뒤에도 사용가능
//		int a4[];
//		a4 = new int[3];
//		
//		//다양한 배열 선언(기본 자료형, 배열, 참조자료형 배열)
//		boolean[] a5 = new boolean[3];//ex) true, false, true
//		int[] a6= new int [5];
//		double[] a7 = new double[7];
//		String[] a8 = new String[9];
		
		
		
//		int[] a1 = new int[3];
//		a1[0] = 3; a1[1] = 4; a1[2] = 5;
//		System.out.println(a1[0] + " " + a1[1] + " "+a1[2]);
//		
//		int[] a2;
//		a2 = new int[3];
//		a2[0] = 3; a2[1] = 4; a2[2] =5;
//		System.out.println(a2[0] + " " + a2[1] + " "+a2[2]);
//		
//		int[] a3 = new int[] {3,4,5};// = {3,4,5}만 써도 가능
//		System.out.println(a3[0] + " " + a3[1] + " "+a3[2]);
		
		
//		String[] a4 = new String[3];
//		
//		for(int i = 0; i < a4.length; i++) {
//			a4[i] = Integer.toString(i);
//		}
//		
//		System.out.print(Arrays.toString(a4));//Arrays에 ctrl+shift+o 누르면 맞는 임포트 불러옴
		
		
//		int[] a = new int[5];
//		a[0] = 1; a[1] = 2; a[2] = 3; a[3] = 4; a[4] = 5;
//		
//		for(int k: a) {
//			System.out.println(k);
//		}
		
		
		//2차원 정방행렬 배열
//		int[][] a1 = new int[2][3];
//		a1[0][0] = 1; a1[0][1] =2; a1[0][2] = 3;
//		a1[1][0] = 4; a1[1][1] =5; a1[1][2] = 6;
//		
//		System.out.println(a1[0][0] + " " + a1[0][1] + " " + a1[0][2]+ " ");
//		System.out.println(a1[1][0] + " " + a1[1][1] + " " + a1[1][2]+ " ");
//		System.out.println();
//		
//		
//		int [][] a2;
//		a2 = new int[2][3];
//		a2[0][0] = 1; a2[0][1] =2; a2[0][2] = 3;
//		a2[1][0] = 4; a2[1][1] =5; a2[1][2] = 6;
//		
//		System.out.println(a2[0][0] + " " + a2[0][1] + " " + a2[0][2]+ " ");
//		System.out.println(a2[1][0] + " " + a2[1][1] + " " + a2[1][2]+ " ");
//		System.out.println();
//		
//		
//		int [][] a3 = new int[][] {{1,2,3},{4,5,6}};
//		System.out.println(a3[0][0] + " " + a3[0][1] + " " + a3[0][2]+ " ");
//		System.out.println(a3[1][0] + " " + a3[1][1] + " " + a3[1][2]+ " ");
//		System.out.println();
//		
//		
//		int [][] a4;
//		a4 = new int [][] {{1,2,3},{4,5,6}};
//		System.out.println(a4[0][0] + " " + a4[0][1] + " " + a4[0][2]+ " ");
//		System.out.println(a4[1][0] + " " + a4[1][1] + " " + a4[1][2]+ " ");
//		System.out.println();
//		
//		
//		int [][] a5 = {{1,2,3},{4,5,6}};
//		System.out.println(a5[0][0] + " " + a5[0][1] + " " + a5[0][2]+ " ");
//		System.out.println(a5[1][0] + " " + a5[1][1] + " " + a5[1][2]+ " ");
//		System.out.println();
		
		
		
		//2차원 비정방행렬 배열
//		int[][] a1 = new int[2][];
//		
//		a1[0] = new int[2];
//		a1[0][0] = 1; a1[0][1] =2;
//		
//		a1[1] = new int[3];
//		a1[1][0] = 3; a1[1][1] = 4; a1[1][2] = 5;
//		
//		System.out.println(a1[0][0] + " " + a1[0][1]);
//		System.out.println(a1[1][0] + " " + a1[1][1] + " " + a1[1][2]);
//		System.out.println();
//		
//		
//		int [][] a2 = new int [2][];
//		a2[0] = new int[] {1,2};
//		a2[1] = new int[] {3,4,5};
//		
//		System.out.println(a2[0][0] + " " + a2[0][1]);
//		System.out.println(a2[1][0] + " " + a2[1][1] + " " + a2[1][2]);
//		System.out.println();
//		
//				
//		int[][] a3 = new int[][] {{1,2},{3,4,5}};
//		System.out.println(a3[0][0] + " " + a3[0][1]);
//		System.out.println(a3[1][0] + " " + a3[1][1] + " " + a3[1][2]);
//		
		
		
		//2차원 배열 원소 출력(이중 for문)
		
//		int[][] a = {{1,2},{3,4,5}};//S1
//		
//		for(int i = 0; i < a.length; i++) {
//			for (int j = 0; j<a[i].length; j++) {
//				System.out.println(a[i][j]);
//			}
//		}
		
		
//		int [][] a = {{1,2},{3,4,5}};//S2 for-each문 중요
//		
//		for (int[] m: a) {
//			for(int n: m) {
//				System.out.print(n);
//			}
//		}
		
		
		//String 참조 자료형
//		String a = args[0];//시작줄 String[] 뒤에 오는 문자랑 같아야함
//		String b = args[1];
//		String c = args[2];
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		
//		System.out.println(b+1);
//		System.out.println(c+1);
//		
//		int d = Integer.parseInt(b);
//		double e = Double.parseDouble(c);
//		System.out.println(d+1);
//		System.out.println(e+1);
		
		
		
		//String 객체 생성하는 2가지 방법
//		String str1 = new String("안녕");
//		System.out.println(str1);
//		
//		
//		String str2 = "안녕하세요";
//		System.out.println(str2);
		
		
//		String str1 = new String("안녕");
//		String str2 = str1;
//		str1 = "안녕하세요";
//		System.out.println(str1);//안녕하세요
//		System.out.println(str2);//안녕
		
		
		
//		String str1 = new String("안녕");
//		String str2 = "안녕";
//		String str3 = "안녕";
//		String str4 = new String("안녕");
//		
//		System.out.println(str1 == str2);
//		System.out.println(str2 == str3);
//		System.out.println(str3 == str4);
//		System.out.println(str4 == str1);//false, 힙 주소가 다름
//		
//		
//		
//		String a = new String("1234");
//		
//		System.out.println(a == "1234");//false 주소 다름
//		System.out.println(a.equals("1234"));//.equals()값이 같은지
		
		
		
//		String str1 = "안녕" + "하세요" + "!";
//		System.out.println(str1);
//		
//		String str2 = "반갑";
//		str2 += "습니다";
//		str2 += "!";
//		System.out.println(str2);
//		System.out.println();
		
		
		
//		System.out.println(1+"안녕");
//		System.out.println(1 + "안녕" +2);
//		System.out.println("안녕" + 1 + 2);
//		System.out.println(1 + 2 + "안녕");//더하기 끊어서 순서대로 하면됨
		
		
		
//		String str1 = "Hello Java!";
//		String str2 = "안녕하세요! 반갑습니다.";
//		System.out.println(str1.length());
//		System.out.println(str2.length());
//		System.out.println();
//		
//		
//		System.out.println(str1.charAt(1));
//		System.out.println(str2.charAt(1));
//		System.out.println();
//	
//		
//		System.out.println(str1.indexOf('a'));
//		System.out.println(str1.lastIndexOf('a'));//인덱스 절댓값은 안변함
//		System.out.println(str1.indexOf('a', 8));//8부터 시작해서 'a'인덱스 위치
//		System.out.println(str1.lastIndexOf('a', 8));
//		System.out.println(str1.indexOf("Java"));
//		System.out.println(str1.lastIndexOf("Java"));
//		System.out.println(str2.indexOf("하세요"));
//		System.out.println(str2.lastIndexOf("하세요"));
//		System.out.println(str1.indexOf("Bye"));//해당 문자(열)이 없으면 -1 리턴
//		System.out.println(str2.lastIndexOf("고맙습니다."));
//		System.out.println();
		
		
		//문자열 변환 및 연결
//		String str3 = String.valueOf(2.3);
//		String str4 = String.valueOf(false);
//		System.out.println(str3);
//		System.out.println(str4);
//		
//		//concat() 문자열 연결
//		String str5 = str3.concat(str4);
//		System.out.println(str5);
//		
//		//String.valueOf() + concat()
//		String str6 = "안녕" + 3;
//		String str7 = "안녕".concat(String.valueOf(3));
//		
//		//문자열을 byte[] 또는 char[]로 변환
//		String str8 = "Hello Java!";
//		String str9 = "안녕하세요";
//		
//		//getBytes(): 문자열 > byte[] 변환
//		byte[] a1 = str8.getBytes();
//		byte[] a2 = str9.getBytes();//한글은 아스키코드 없음.
//		System.out.println(Arrays.toString(a1));
//		System.out.println(Arrays.toString(a2));
//		
//		//toCharArray(): 문자열 -> char[] 변환
//		char[] a3 = str8.toCharArray();
//		char[] a4 = str9.toCharArray();
//		System.out.println(Arrays.toString(a3));
//		System.out.println(Arrays.toString(a4));
		
		
		//대소문자
//		String str1 = "Java Study";
//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.toUpperCase());
//		System.out.println(str1.replace("Study", "공부"));//study를 공부로 교체
//		
//		
//		System.out.println(str1.substring(0,5));//슬라이싱, 0<=인덱스<5
//		
//		String[] strArray = "abc/def-ghi jkl".split("/|-| ");//split
//		System.out.println(Arrays.toString(strArray));
//		
//		System.out.println("   abc   ".trim());//양옆 공백제거
//		System.out.println();
//		
//		
//		String str2 = new String("Java");
//		String str3 = new String("Java");
//		String str4 = new String("java");
//		
//		System.out.println(str2 == str3);//주소 비교
//		System.out.println(str3 == str4);
//		System.out.println(str4 == str2);
//		
//		System.out.println(str2.equals(str3));//내용 비교
//		System.out.println(str3.equals(str4));
//		System.out.println(str4.equalsIgnoreCase(str2));
		
		
//		int[] a = new int [] {1,2,3,4,5,};//for문, for-each문 사용해서 순서대로 출력
//		
//		for(int i = 1; i<a.length+1 ; i++) {
//			System.out.println(i);
//		}
//		
//		for(int j : a) {
//			System.out.println(j);
//		}
		
		
//		int[][] b = new int [2][];
//		
//		b[0] = new int [3];
//		b[0][0] = 1; b[0][1] = 3; b[0][2] = 5;// = a[0] = new int[] {1,3,5};
//		
//		b[1] = new int [2];
//		b[1][0] = 7; b[1][1] = 9;
//		
//		for(int i = 0; i < b.length; i++){//이중 for 문으로 순서대로 출력
//			for(int j = 0; j < b[i].length; j++) {
//				System.out.println(b[i][j]);
//		}
//		}
		
//		String a = "방가";
//		String b = new String("방가");
//		String c = "방가";
//		String d = new String("방가");
//		String e = "방가";
//		String f = new String("방가");
//		
//		System.out.println(a == b);
//		System.out.println(a == c);
//		System.out.println(a == d);
//		System.out.println(a == e);
//		System.out.println(a == f);
//		System.out.println();
//		
//		System.out.println(b == c);
//		System.out.println(b == d);
//		System.out.println(b == e);
//		System.out.println(b == f);
		
		
		
//		String str = "내 이름은 [홍길동] 입니다. 나이는 [15]살 입니다.";
		
//		String name;//S1
//		name = str.substring(str.lastIndexOf("홍"),str.indexOf("]"));
//		
//		int age;
//		age = Integer.parseInt(str.substring(str.indexOf("1"),str.lastIndexOf("]")));
//				
//		System.out.println(name);
//		System.out.println(age);
		
		
		
//		String name;//S2
//		int age;
//		
//		int start = str.indexOf("[");
//		int end = str.indexOf("]");
//		name = str.substring(start+1,end);//여기까지 사용하고 끝
//		
//		start = str.lastIndexOf("[");
//		end = str.lastIndexOf("]");
//		age = Integer.parseInt(str.substring(start+1, end));//여기서 바뀐 start, end 사용
//		System.out.println(name);
//		System.out.println(age);
	}

}
