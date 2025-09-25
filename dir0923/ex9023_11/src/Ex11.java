// 중첩 if문
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		if (num > 100) {
			if (num < 200) {
				System.out.println("100 초과 200 미만");
			} else {
				System.out.println("100 초과 200 이상");
			}
		} else {
			System.out.println("100 이하입니다.");
		}
	}

}
