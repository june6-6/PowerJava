// 키(cm)입력 받고 70cm ~ 130cm 사이이면 "놀이기구 이용 가능!" 출력하기 ,
// 그렇지 않으면 "놀이기구 이용 불가능!"을 출력하시오 
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		double tall;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하시오: ");
		tall = sc.nextDouble();
		
		if (tall >= 70 && tall <= 130) {
			System.out.println("놀이기구 탑승 가능!");
		} else {
			System.out.println("놀이기구 탑승 불가!");
		}
	}

}
