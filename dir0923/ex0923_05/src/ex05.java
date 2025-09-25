// 입력 받은 정수가 짝수이면 짝수입니다!, 홀수이면 홀수입니다! 출력하
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수입니다!");
		} else {
			System.out.println("홀수입니다!");
		}
	}

}
