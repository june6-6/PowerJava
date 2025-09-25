// 사용자로부터 화씨온도를 입력받아서 섭씨온도를 출력하시오.
// 공식은 c = 5 / 9 * (f - 32)
import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("화씨온도를 입력하시오: ");
		double f = sc.nextDouble();
		double c = 5.0 / 9.0 * (f - 32);
		
		System.out.println("화씨 " + f + "도는 " + "섭씨 " + c + "도입니다.");
	}

}
