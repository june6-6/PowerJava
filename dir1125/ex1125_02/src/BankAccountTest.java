class BankAccount {
	private int balance;
	
	BankAccount(int balance) {
		this.balance = balance;
	}
	
	// 잔액 접근
	public int getBalance() {
		return this.balance;
	}
	
	// 잔액 설정
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 입금
	void deposit(int amount) {
		balance += amount;
	}
	
	// 출금 
	void withdraw(int amount) {
		balance -= amount;
	}
	
	// 이체
	public void transfer(int amount, BankAccount otherAccount) {
		System.out.println("이체 금액: " + amount);
		otherAccount.deposit(amount);
		balance -= amount;
	}
}

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(10000);
		BankAccount b2 = new BankAccount(20000);
		
		b2.transfer(7000, b1);
		
		System.out.println("b1의 잔액: " + b1.getBalance());
		System.out.println("b2의 잔액: " + b2.getBalance());
	}

}
