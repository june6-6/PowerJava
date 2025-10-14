// 무한 루프와 break문
// 사용자가 입력한 점수들의 평균을 내는 프로그램을 작성한다. 
// 만약 음수를 입력하면 break문에 의해 반복 종료

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0, count = 0;
		
		while(true) {
			System.out.print("점수를 입력하시오 ");
			int score = sc.nextInt();
			if(score < 0)
			{
				break;
			}
			else 
			{
				total += score;
				count++;
			}
		}
		System.out.println("평균: " + total/count);
	}

}
