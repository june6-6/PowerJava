// 점수를 입력 받아서 학점 구하기
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		int score; // 점
		char grade; // 문자형 변수, 학점 	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		score = sc.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println(grade + "학점입니다.");
	}

}
