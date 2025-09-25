// 초 단위의 시간을 입력받아서 몇 분, 몇 초인지를 계산하여 출력하는 프로그램을 작성하기
import java.util.Scanner;

public class CalTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int second;
		
		System.out.print("초를 입력하시오: ");
		second = sc.nextInt();
		
		System.out.print(second + "초 = ");
		System.out.print(second / 360 + "시간 ");
		System.out.print((second % 360) / 60 + "분 ");
		System.out.print(second % 60 + "초");
	}

}
