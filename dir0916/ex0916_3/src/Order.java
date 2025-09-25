// 입력받은 정수가 짝수이면 "햄버거"를, 그렇지 않으면 (홀수) "김밥"을 출력하시오 

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오: ");
		 int num = sc.nextInt();
		 System.out.print((num % 2 == 0) ? "햄버거" : "김밥");
		 System.out.print(" 먹는다!");
	}

}
