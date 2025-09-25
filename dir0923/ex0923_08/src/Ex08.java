// 다중 if 문
// 정수를 입렵 받아서 양수인지 음수인지 0인지 판단하기 	
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("양수!");
		} else if (num < 0) {
			System.out.println("음수!");
		} else {
			System.out.println("0");
		}
		
	}

}
