// class 만들기
class BankAccount {
	int accountNumber;	// 계좌 번호
	String owner;	// 예금주
	int balance;	// 잔액
	
	// 예금 입금 기능
	void deposit(int amount) {
		balance += amount;
	}
	
	// 예금 인출	
	void withdraw(int amount) {
		balance -= amount;
	}
	
	// 현재 잔액 출력 
//	public String toString() {
//		return "현재 잔액은" + balance + "입니다.";
//	}
	
	
}
public class Ex03 {

	public static void main(String[] args) {
		BankAccount  accountHong = new BankAccount();
		accountHong.owner = "홍길동";
		accountHong.deposit(1000);
		System.out.println(accountHong.owner + "님의 잔액:" +  accountHong.balance);
		System.out.println(accountHong); // 주소값
		
		BankAccount accountKim = new BankAccount();
		accountKim.owner = "김유신";
		accountKim.deposit(500);
		System.out.println(accountKim.owner + "님의 잔액:" +  accountKim.balance);
		System.out.println(accountKim);
		
		accountKim.withdraw(200);
		System.out.println(accountKim.owner + "님의 잔액:" +  accountKim.balance);
	}

}
