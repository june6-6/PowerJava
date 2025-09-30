// 피자의 종류를 입력 받아서 가격을 구하는 프로그램 작성

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int price = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 피자 종류 ***");
		System.out.println("콤비네이션, 수퍼슈프림, 포테이토, 쉬림프");
		// 수퍼슈프림, 포테이토 가격 같음 
		
		System.out.print("피자 종류를 입력해 주세요: ");
		String model = sc.next();
		
		switch(model) {
		case "콤비네이션": 
			price = 20000;
			break;
		case "수퍼슈프림":
		case "포테이토":
			price = 25000;
			break;
		case "쉬림프":
			price = 28000;
			break;
		default:
			model = "종류에 없는";
		}
		System.out.println(model + "피자 가격: " + price);
		
	}

}
