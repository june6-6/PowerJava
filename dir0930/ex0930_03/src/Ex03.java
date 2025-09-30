// 점수를 입력받아서 학점 구하기

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		char grade;
		int score, number;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		score = sc.nextInt();
		number = score / 10;
		
		switch(number) {
		case 10, 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println(grade + "학점입니다.");
	}

}