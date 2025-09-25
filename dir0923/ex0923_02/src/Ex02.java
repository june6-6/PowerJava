// 조건문 (if문)
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		double temperature; //온도 실수형 변수 선언
		Scanner sc = new Scanner(System.in);
		
		System.out.print("온도를 입력하시오: ");
		temperature = sc.nextDouble();
		
		if (temperature >= 32.5) { 
			System.out.println("폭염 주의!");
			System.out.println("건강 유의!");
			// 실행이 2줄 이상이면 블록 사용 	
		}
		
		System.out.println("프로그램 끝~!");
	}

}
