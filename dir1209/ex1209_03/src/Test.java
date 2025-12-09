// 예외 처리 
public class Test {

	public static void main(String[] args) {
//		int a = 10 / 0;
//		System.out.println("나눗셈 결과: " + a);
		
		try {
			// 예외 발생할 수 있는 코드 작성
			int b = 10  / 0;
		} catch (ArithmeticException e) {
			// 예외를 처리하는 코드
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램은 계속 진행됩니다.");
	}

}
