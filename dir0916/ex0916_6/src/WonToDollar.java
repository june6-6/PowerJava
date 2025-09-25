// 원화를 입력받아서 달러화 금액 구하기 
// 기호 상수 이용
import java.util.Scanner;

public class WonToDollar {

	public static void main(String[] args) {
		final double USD = 1300;	// 1달러 = 1300원 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("달러를 입력해주세요: ");
		double won = sc.nextDouble();
		
		double dollar = won / USD;
		System.out.println(won + "원은 " + dollar + "달러입니다.");
	}

}
