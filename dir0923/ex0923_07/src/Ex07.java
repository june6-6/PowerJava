// 국어, 영어, 수학 점수를 입력 받아서 세 과목 모두 60점 이상이면 "합격", 아니면 "불합격"
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int koreanScore;
		int englishScore;
		int mathScore;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학 점수를 입력하시오: ");
		koreanScore = sc.nextInt();
		englishScore = sc.nextInt();
		mathScore = sc.nextInt();
		
		// 3과목 모두 60점 이상일 경우 합
//		if (koreanScore >= 60 && englishScore >= 60 && mathScore >= 60) {
//			System.out.println("합격!");
//		} else {
//			System.out.println("불합격!");
//		}
		
		// 3과목 중 1과목 이라도 90점 초과이면 "합격"
		if (koreanScore > 90 || englishScore > 90 || mathScore > 90) {
			System.out.println("합격!");
		} else {
			System.out.println("불합격!");
		}
	}

}
