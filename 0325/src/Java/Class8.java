package Java;

class D{
	D(){
		System.out.println("첫 번째 생성자 ");
	}
	D(int a){
		System.out.println("두 번째 생성자");
	}
	D(int a, int b){
		System.out.println("세 번째 생성자");
	}
}


public class Class8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1 = new D();
		D d2 = new D(3);
		D d3 = new D(3,5);
		
	}

}
