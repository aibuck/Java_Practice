package Java;

//class A {//C1
//int m;
//void method() {
//	System.out.println("A의 메서드");
//}
//}



//class A {//C2
//int m = 3;//필드 클래스 안에 있는 변수
//int n = 4;
//void work1() {
//	int k = 5; //지역변수 메서드 안에 있는 변수
//	System.out.println(k);
//	work2(3);
//}
//void work2(int i) {//순서는 상관없음.
//	int j = 4;
//	System.out.println(i + j);
//}
//
//}



//class A {//C3
//int m;//필드는 값을 지정하지 않으면 초기값 0으로 초기화됨 .
//int n;
//void work1() {
//	int k;
////	System.out.println(k);//지역변수는 초기화 x, 초기값 없이 출력을 시도해 오류 발생
//}
//}



//class A {//C4
//boolean m1;
//int m2;
//double m3;
//String m4;
//void printFieldValue() {
//	System.out.println(m1);
//	System.out.println(m2);
//	System.out.println(m3);
//	System.out.println(m4);
//}
//void printLocalVariable() {
//	int k;
////	System.out.println(k);//지역변수라서 값이 없을때 초기화 되지않음. (오류)
//}
//}



//class A{//C5
//void print() {//리턴값이 없으면 void
//	System.out.println("안녕");
//}
//int data() {
//	return 3;
//}
//double sum(int a, double b) {
//	return a+b;
//}
//void printMonth(int m) {
//	if (m<0 || m>12) {
//		System.out.println("잘못된 입력");
//		return;
//	}
//	System.out.println(m+"월입니다.");
//}
//
//}




public class Class {

public static void main(String[] args) {
	// TODO Auto-generated method stub
//	A a = new A(); //C1
//	
//	a.m = 5;
//	
//	System.out.println(a.m);
//	a.method();//a안에 있는 메소드 호출
	
	
	
//	A a = new A();//C2
//	System.out.println(a.m);
//	System.out.println(a.n);
//	a.work1();
	
	
	
//	A a = new A();//C3
//	System.out.println(a.m);
//	System.out.println(a.n);
//	a.work1();
	
	
	
//	A a = new A();//C4
//	a.printFieldValue();
	
	
	
//	A a = new A();//C5
//	a.print();
//	int k = a.data();
//	a.data();
//	System.out.println(k);
//	double result = a.sum(3, 5.2);
//	System.out.println(result);
//	a.printMonth(5);
//	a.printMonth(15);
	
	
	
//	print();
//	
//	int a = twice(3);
//	System.out.println(a);
//	
//	double b = sum(a, 5.8);
//	System.out.println(b);
	
}
}