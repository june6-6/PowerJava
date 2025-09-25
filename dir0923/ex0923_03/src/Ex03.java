// 속도가 60km/h 이상이고 100km/h 미만이면 "정상 속도"라고 출력하는 프로그램 작성하기
// 숫자 범위(논리 연산자 AND(&&) 이용 
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		double speed;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("속도를 입력하시오: ");
		speed = sc.nextDouble();
		
		if (speed >= 60 && speed < 100) {
			System.out.println("정상 속도!");
		} else {
			System.out.println("규정 속도 위반");
		}
		
		System.out.println("프로그램 끝!!!");
	}

}
