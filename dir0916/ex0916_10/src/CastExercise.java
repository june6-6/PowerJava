// 상품 가격과 받은 금액을 입력하면, 남는 잔돈과 부과세(상품 가격의 10%)를 계산해서 출력하시오.
import java.util.Scanner;

public class CastExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price, money, change; // 상품가격, 받은 금액, 부과세, 잔돈
		double tax;
		
		System.out.println("상품가격을 입력하시오: ");
		price = sc.nextInt();
		System.out.println("지불 금액을 입력하시오: ");
		money = sc.nextInt();
		
		change = money - price;
		tax = price * 0.1;
		
		System.out.println("남는 돈: " + change);
		System.out.println("부가세: " + tax);
	}

}
