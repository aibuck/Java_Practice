package Java;

class BankAccount{
	//필드
	private String name; //이름
	private double balance;//잔액
	
	//생성자
	public BankAccount(String name, double initialBalance) {
		this.name = name;
		this.balance = initialBalance;
	}
	
	//입금 메서드
	public void deposit(double amount) {
		balance += amount;
		System.out.println(amount + "원을 입금했습니다.");
	}
	
	//출금 메서드
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println(amount + "원을 출금했습니다.");}
		else {
			System.out.println("잔액이 부족합니다.");
			
		}
	}
	//잔액 조회 메서드
	public void checkBalance() {
		System.out.println("잔액: " + balance + "원");
	}
	
}


public class S06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount("홍길동", 10000);
		
		account1.checkBalance();//잔액조회
		account1.deposit(5000);//입금
		account1.checkBalance();
		account1.withdraw(2000);//출금
		account1.checkBalance();
	}

}
