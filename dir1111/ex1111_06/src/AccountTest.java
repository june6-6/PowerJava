// 접근 제어: 클래스의 멤버(필드, 메소드)에 접근한는 것을 제어, 정보은닉의 방법

class Account {
	private String name; // 고객명	
	private int balance; // 잔고
	
	// 고객명 설정자(setter)
	public void setName(String name) {
		this.name = name;
	}
	// 고객명 접근자(getter)
	public String getName() {
		return name;
	}
	
	// 잔고 설정자(setter)
	public void setBalance(int balance) {
		this.balance = balance;
	}
	// 잔고 접근자(getter)
	public int getBalance() {
		return balance;
	}
	
	
}
public class AccountTest {

	public static void main(String[] args) {
		Account accountHong = new Account();
		
		// accountHong.name = "홍길동";  // 오류 
		accountHong.setName("홍길동"); // 고객명 설정자 호출
		accountHong.setBalance(100000); // 잔고 설정자 호출
		
		System.out.println("고객명: " + accountHong.getName()); // 고객명 접근자 호출
		System.out.println("통장 잔고: " + accountHong.getBalance()); // 잔고 접근자 호출 	
	}

}
