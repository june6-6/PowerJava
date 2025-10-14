// 학생들의 점수를 입력받아서 배열에 저장 후, 합계, 평균 구하기 
// 음수 점수가 입력되면 종료
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[100];
		int sum = 0, index = 0;
		double avg;
		
		while(true) {
			System.out.print("점수 입력: ");
			int jumsu = sc.nextInt();
			if (jumsu < 0) break;
			scores[index++] = jumsu;
		}
		
		// 합 계산
		for (int i = 0; i < index; i++) {
			sum += scores[i];
		}
		System.out.println("합계: " + sum);
		
		// 평균 계산
		avg = (double)sum / index;
		System.out.println("평균: " + avg);
	}

}
