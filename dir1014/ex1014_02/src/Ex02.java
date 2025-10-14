// 컴퓨터가 가지고 있는 정수를 사용자가 알아맞히는 게임
// 사용자가 답을 제시하면 컴퓨터가 가지고 있는 정수와 비교하여 더 큰지 작은지 알려줌
// 일단 사용자로부터 입력받아야 함으로 do-while 문 사용
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int answer = 77; // 정답
		int guess;
		Scanner sc = new Scanner(System.in);
		int tries = 0;
		
		System.out.print("100 이하의 수를 입력하시오: ");
		do {
			guess = sc.nextInt();
			tries++;
			if (guess > answer) {
				System.out.println("더 작은 수를 입력하시오.");
			} else if (guess < answer) {
				System.out.println("더 큰 수를 입력하시오.");
			} else {
				System.out.println("축하합니다. " + "시도 횟수: " + tries);
			}
		} while (guess != answer);
		
	}

}
