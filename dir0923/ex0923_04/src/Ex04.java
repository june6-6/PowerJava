// 점수가 60이상이면 합격, 그렇지 않으면 불합격 출력 	
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		score = sc.nextInt();
		
		if (score >= 60) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다!");
		}
		
	}

}
